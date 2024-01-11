# 브라우저 저장공간
- 크롬 개발자 도구의 `Application` 탭에 들어가면 구경 가능
- `Local Storage`/ `Session Storage`
    - 문자, 숫자만 key : value 형태로 저장가능
    - 5MB까지만 저장가능
    - `Local Storage`: 브라우저 재접속 시 영구적으로 존재
    - `Session Storage`: 브라우저 재접속 시 날라감
- `Indexed DB`: 크로 많은 구조화된 데이터를 DB처럼 저장가능
- `Cookies`: 유저 로그인정조 저장공간
- `Cache Storage`: html, css, js, img 파일 저장해두는 공간

<br>

# 로컬 스토리지 사용법
```js
localStorage.setItem('이름', 'kim') //자료저장하는법
localStorage.getItem('이름') //자료꺼내는법
localStorage.removeItem('이름') //자료삭제하는법
```
- 수정하는 방법은 없어서:  꺼내서 수정하고 다시 저장
- 문자나 숫자만 저장가능
- `localStorage`를 `sessionStorage`로 바꾸면 `Session Storage`에 저장가능

<br>

# 로컬 스토리지에 array/object 저장하려면
- array/object를 로컬스토리지에 저장하면 강제로 문자로 바꿔 저장됨
    - 자료가 깨질 수 있음
- array/object를 JSON으로 바꾸면 문자취급을 받기 때문에 안전하게 로컬 스토리지에 저장가능
- JSON은 따옴표친 array/object임

<br>

```js
var arr = [1,2,3];
var newArr = JSON.stringify(arr);

localStorage.setItem('num', newArr)
```
1. `JSON.stringify()`안에 `array/object` 넣으면 JSON으로 바꿔준다
    - 문자 취급 받음
2. 그걸 `localStorage`에 저장하라고 함

<br>

```js
//꺼내서 쓸 땐
var 꺼낸거 = localStorage.getItem('num');
꺼낸거 = JSON.parse(꺼낸거);
console.log(꺼낸거);
```
- JSON으로 저장했으니 꺼내도 JSON
- 다시 `array/object`로 바꾸고 싶으면 `JSON.parse()`안에 넣으면 됨

<br>

# 정리
array/object -> JSON: `JSON.stringify()`
JSON -> array/object: `JSON.parse()`

<br>

# 코드
```html
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Hello, world</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

    <script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
  </head>
  <body>

    <div class="container">
      <div class="row">
    
          <!-- <div class="col-sm-4">
            <img src="https://via.placeholder.com/600" class="w-100">
            <h5>Card title</h5>
            <p>가격 : 70000</p>
          </div> -->
    
      </div>
    </div>
    
    <div class="container my-3">
      <button class="btn btn-danger" id="price">가격순 정렬</button>
    </div>

    <div class="container my-3">
      <button class="btn btn-danger" id="sort1">다나가순 정렬</button>
    </div>

    <div class="container my-3">
      <button class="btn btn-danger" id="filter">6만 원이하</button>
    </div>
    
    <script>
      var products = [
        { id : 0, price : 70000, title : 'Blossom Dress' },
        { id : 1, price : 50000, title : 'Springfield Shirt' },
        { id : 2, price : 60000, title : 'Black Monastery' }
      ];

      $('#filter').click(function() {
        var newProduct = products.filter(function(a) {
          return a.price <= 60000;
        });

      $('.row').html('');
  
      newProduct.forEach((a, i)=>{
        var 템플릿 = 
        `<div class="col-sm-4">
          <img src="https://via.placeholder.com/600" class="w-100">
          <h5>${newProduct[i].title}</h5>
          <p>가격 : ${newProduct[i].price}</p>
          </div>`;
          $('.row').append(템플릿)
        });
      });

      $("#sort1").click(function() {
        products.sort(function(a, b) {
          if (a.title < b.title) {
            return 1;
          } else {
            return -1;
          }
        });
      });


      $('#price').click(function() {
        products.sort(function(a, b){
          return a.price - b.price;
        });

      $('.row').html('');
  
      products.forEach((a, i)=>{
        var 템플릿 = 
        `<div class="col-sm-4">
          <img src="https://via.placeholder.com/600" class="w-100">
          <h5>${products[i].title}</h5>
          <p>가격 : ${products[i].price}</p>
          </div>`;
          $('.row').append(템플릿)
        });
      });

      var 변수 = 0;
      
      products.forEach((a, i)=>{
        var 템플릿 = 
        `<div class="col-sm-4">
          <img src="https://via.placeholder.com/600" class="w-100">
          <h5>${products[i].title}</h5>
          <p>가격 : ${products[i].price}</p>
          <button class="buy">구매</button>
          </div>`;
          $('.row').append(템플릿)
        });

        var arr = [1,2,3];
        var newArr = JSON.stringify(arr);

        localStorage.setItem('num', newArr);
        var 꺼낸거 = localStorage.getItem('num')
        console.log(JSON.parse(꺼낸거)[0]);

        
      </script> 
      
      <div class="container">
        <button class="btn btn-danger" id="more">더보기</button>
      </div>

      <script>

        $('#more').click(function() {
          $.get('https://codingapple1.github.io/js/more1.json')
          .done((data)=> {
            console.log(data);

            data.forEach((a, i)=>{
              var 템플릿 = 
                `<div class="col-sm-4">
                  <img src="https://via.placeholder.com/600" class="w-100">
                  <h5>${data[i].title}</h5>
                  <p>가격 : ${data[i].price}</p>
                  </div>`;
                  $('.row').append(템플릿)
            });

          });
        });

      </script>
      
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </body>
    </html>
```

<br>

# 숙제
1. 카드 하단 구매버튼 추가 후 버튼 클릭 시 누른 상품의 이름을 localStorage에 저장
    - 저장하는 형태는 자유지만 이렇게 array 안에 전부 저장
    - 구매 누를 때 마다 array에 추가
    - (팁1) 내가 누른 요소의 형제요소를 찾는 법을 알아야 됨
    - (팁2) localStorage가 비어있을 때는 array를 추가하면 되겠지만 localStorage에 이미 뭐가 있을 때는 array를 수정

2. cart.html 같은 파일 하나 만들어서 (장바구니 페이지)  
그 페이지 방문시 localStorage에 있던 상품명들을 꺼내서 전부 진열해서 보여주기