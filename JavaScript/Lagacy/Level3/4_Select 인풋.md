# select 폼 생성
`detail.html`에 생성
```html
<form class="container my-5 form-group">
    <p>상품선택</p>
    <select class="form-select mt-2">
      <option>모자</option>
      <option>셔츠</option>
    </select>
</form>
```
- `<select>`는 `<input>`랑 같은데,  
사용자가 고를 수 있는 선택지를 드랍다운 메뉴로 제공하는 `<input>`이다
    - 선택지는 `<option>`으로 하면 됨
- `<select>`태그도 선택 시 `input`, `change` 이벤트가 발생함
- `<select>` 태그도 `.value` 유저가 입력한 값을 가져올 수 있다

<br>

# 셔츠 선택 시 `<select>` 더보여주기
유저가 셔츠를 선택하면 하단에 `95`, `100`을 선택할 수 있는 `<select>`박스가 등장하려면 코드를 어떻게 만들어야 할까
```html
<form class="container my-5 form-group">
    <p>상품선택</p>
    <select class="form-select mt-2">
      <option>모자</option>
      <option>셔츠</option>
    </select>
    <select class="form-select mt-2 form-hide">
      <option>95</option>
      <option>100</option>
    </select>
</form>
```

<br>

```css
.form-hide {
    display: none;
}
```

<br>

```html
<script>
  var value = $('.form-select').eq(0).val();
  if (value == '셔츠') {
    $('.form-select').eq(1).removeClass('form-hide');
  }
</script>
```
- 유저가 `<select>`에서 어떤 것을 선택했는지 확인하는 방법
    - `<input>`과 똑같이 `.value`를 사용하면 됨
- 여기까지하면 작동 안됨
    - `<script> 안에 있는 코드는 페이지 로드 시 1회만 실행되기 때문`

따라서

```html
<script>
  $('.form-select').eq(0).on('input', function(){

    var value = $('.form-select').eq(0).val();
    if (value == '셔츠') {
      $('.form-select').eq(1).removeClass('form-hide');
    }

  });
</script>
```
- `<input>`이나 `<select>` 조작할 때 input 이벤트가 발생하기 때문에 `이벤트리스너`를 부착하면 됨

<br>

# 정리

```html
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Hello, world</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="main.css">

    <script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
  </head>
  <body>

    <div class="container mt-3">
      <div class="card p-3">
        <span class="car-title">상품명</span>
        <span class="car-price">가격</span>
      </div>
    </div>

    <form class="container my-5 form-group">
      <p>상품선택</p>
      <select class="form-select mt-2">
        <option>모자</option>
        <option>셔츠</option>
      </select>

      <select class="form-select mt-2 form-hide">
        <option>95</option>
        <option>100</option>
      </select>
    </form>

    <script>
      $('.form-select').eq(0).on('input', function(e) {
        var value = e.currentTarget.value;
        if (value == '셔츠'){
          $('.form-select').eq(1).removeClass('form-hide');
        }

        if (value == '모자'){
          $('.form-select').eq(1).addClass('form-hide');
        }
      })



    </script>


    <script>
      
      var car2 = {name :'소나타', price: [50000, 3000, 4000]}

      document.querySelector('.car-title').innerHTML = car2['name'];
      document.querySelector('.car-price').innerHTML = car2.price[1];
    

    </script>

    <style>
        ul.list {
          list-style-type: none;
          margin: 0;
          padding: 0;
          border-bottom: 1px solid #ccc;
        }
        ul.list::after {
          content: '';
          display: block;
          clear: both;
        }
        .tab-button {
          display: block;
          padding: 10px 20px 10px 20px;
          float: left;
          margin-right: -1px;
          margin-bottom: -1px;
          color: grey;
          text-decoration: none;
          cursor: pointer;
        }
        .orange {
          border-top: 2px solid orange;
          border-right: 1px solid #ccc;
          border-bottom: 1px solid white;
          border-left: 1px solid #ccc;
          color: black;
          margin-top: -2px;
        }
        .tab-content {
          display: none;
          padding: 10px;
        }
        .show {
          display: block;
        }
      </style>
      
      <div class="container mt-5">
        <ul class="list">
          <li class="tab-button" data-id="0">Products</li>
          <li class="tab-button orange" data-id="1">Information</li>
          <li class="tab-button" data-id="2">Shipping</li>
        </ul>
        <div class="tab-content">
          <p>상품설명입니다. Product</p>
        </div>
        <div class="tab-content show">
          <p>스펙설명입니다. Information</p>
        </div>
        <div class="tab-content">
          <p>배송정보입니다. Shipping</p>
        </div>
      </div>

      
    <script src="tab.js"></script>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
  </body>
</html>
```

<br>

```css
.form-hide {
    display: none;
}
```