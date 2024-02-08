### 서버에서 바지 사이즈 데이터를 가져와 그 갯수만큼 `<option>` 생성
```html
<script>
  var pants = [28, 30, 32];
  $('.form-select').eq(0).on('input', function(){

    var value = $('.form-select').eq(0).val();
    if (value == '셔츠') {
      $('.form-select').eq(1).removeClass('form-hide');
    }
    else if (value == '바지'){
      $('.form-select').eq(1).removeClass('form-hide');
      $('.form-select').eq(1).html('');
      여기다 무슨 코드 짜야함 
    }

  });
</script>
```
- `pants`라는 변수를 만들고 서버에서 보낸 데이터라고 가정
- `pants` 데이터의 갯수만큼 `<option>`을 생성하고 싶으면 반복문 사용하면 됨
    ```html
    <script>
    var pants = [28, 30, 32];
    $('.form-select').eq(0).on('input', function(){

        var value = $('.form-select').eq(0).val();
        if (value == '셔츠') {
        $('.form-select').eq(1).removeClass('form-hide');
        }
        else if (value == '바지'){
        $('.form-select').eq(1).removeClass('form-hide');
        $('.form-select').eq(1).html('');
        for (let i = 0; i < pants.length; i++){
            <option>생성해주세요~
        }
        }

    });
    </script>
    ```

<br>

# forEach 반복문
- array 자료 뒤에 붙일 수 있는 `forEach()`라는 기본 함수
```js
var pants = [28, 30, 32];
pants.forEach(function(){
  console.log('안녕')
});
```
- `pants`안의 데이터 갯수만큼 `forEach` 콜백함수 안에 있는 코드 실행됨
- array 자료를 다룰 때 `for 반복문` 사용하기 싫으면 `forEach`를 붙여도 됨
- 3번 실행됨

<br>

### 콜백함수는 왜 넣을까?
- 만든 사람이 저렇게 정한 듯

<br>

```js
var pants = [28, 30, 32];
pants.forEach(function(a, i){
  console.log(a)
});
```
- 콜백 함수 안에 파라미터를 2개까지 작명 가능
- 첫 파라미터(a)는 반복문을 돌 때마다 array 안에 있던 하나하나의 데이터가 됨
- 두 번째 파라미터(i)는 반복문을 돌 때마다 0부터 1씩 증가하는 정수가 됨

<br>

# 코드 변경
```html
<script>
  var pants = [28, 30, 32];
  $('.form-select').eq(0).on('input', function(){

    var value = $('.form-select').eq(0).val();
    if (value == '셔츠') {
      $('.form-select').eq(1).removeClass('form-hide');
    }
    else if (value == '바지'){
      $('.form-select').eq(1).removeClass('form-hide');
      $('.form-select').eq(1).html('');
      pants.forEach(function(a){
        $('.form-select').eq(1).append(`<option>${a}</option>`)
      })
    }

  });
</script>
```
- `pants`라는 서버에서 보낸 데이터가 바뀔 때마다 거기에 맞게 `<option>`이 생성됨

<br>

# object 자료를 다룰 떄 `for in` 반복문
object 자료 갯수만큼 반복문을 돌리고 싶을 때 `for in` 반복문 사용

<br>

```js
var obj = { name : 'kim', age : 20 }

for (var key in obj){
  console.log('안녕')
}
```
- '안녕'이 2회 출력됨

<br>

`for in` 반복문을 사용하면 object 자료 안에 있는 key와 value를 전부 출력해볼 수 있다
```js
var obj = { name : 'kim', age : 20 }

for (var key in obj){
  console.log(key)
}
```
- key 말고 value를 출력하고 싶다면 `console.log(obj[key])`

<br>

# 반복문의 용도 2가지
1. 코드 복붙
2. array, object 자료 꺼내고 싶을 때

<br>

# arrow function 문법
함수를 만드는 다른 문법  
콜백함수를 만들 때 자주 사용
```js
var pants = [28, 30, 32];
pants.forEach(function(a){
  console.log(a)
});

pants.forEach((a) => {
  console.log(a)
});
```
- function 대신 `=>`를 () 우측에 부착해도 함수를 만들 수 있다

<br>

arrow function 예시
```js
let 함수 = function(){ console.log('안녕') }
let 함수 = () => { console.log('안녕') }
```

<br>

# 그냥 함수와 `arrow function`의 기능차이
- 함수 안에서 `this`를 써야할 경우
    - 그냥 함수는 함수 안에서 `this`를 알맞게 재정의
    - `arrow function`은 함수 안에서 `this`를 재정의해주지 않고 바깥에 있던 `this`를 그대로 사용
- 이벤트리스너 콜백함수 안에서 `this`를 사용해야하면 `arrow function`를 쓰면 의도와 다르게 동작할 수도 있다

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
        <option>바지</option>
      </select>

      <select class="form-select mt-2 form-hide">
        <option>95</option>
        <option>100</option>
      </select>
    </form>

    <div id="test">
      <h4>반갑당</h4>
    </div>

    <script>

      var 템플릿 = '<p>안녕</p>';
      document.querySelector('#test').insertAdjacentHTML('beforeend', 템플릿);
      $('#test').append(템플릿);

    </script>

    <script>

      var pants = [28, 30, 32, 34];
      var shirts = [95, 100, 105];
      
      $('.form-select').eq(0).on('input', function(e) {
        var value = e.currentTarget.value;
        if (value == '셔츠'){
          $('.form-select').eq(1).removeClass('form-hide');
        } else if (value == '바지') {
          $('.form-select').eq(1).removeClass('form-hide');
          $('.form-select').eq(1).html('');

          pants.forEach(function(a, i){
            $('.form-select').eq(1).append(`<option>${a}</option>`);
          });
        }

        if (value == '모자'){
          $('.form-select').eq(1).addClass('form-hide');
        }
      })

      var obj = {name:'kim', age:20};

      for (var key in obj){
        console.log(key);
      }

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