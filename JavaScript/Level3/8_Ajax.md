# Ajax
- 서버와 데이터를 주고받는 방법 중 하나

<br>

### 서버
- 유저가 데이터를 요청하면 데이터를 보내주는 프로그램
    - 네이버 웹툰 서버: 유저가 웹툰을 요청하면 웹툰 보내주는 프로그램
    - 유뷰트 서버: 유저가 영상 요청하면 영상 보내주는 프로그램
- 서버에 데이터 요청 시
    1. 어떤 데이터인지 url로 기재
    2. 어떤 방법으로 요청할지 결정(GET/POST 등)

<br>

### GET/POST 요청 방법
- GET 요청: 서버에 있던 데이터를 읽고싶을 때 주로 사용
    - 브라우저에 GET 요청을 날리기
- POST 요청: 서버로 데이터를 보내고 싶을 때 사용
    - `<form action="요청할url" method="post">` 태그 사용
- GET, POST 요청을 하게되면 **브라우저가 새로고침**된다

<br>

# AJAX란?
- 서버에 GET, POST 요청을 할 떄 새로고침 없이 데이터를 주고 받을 수 있게 도와주는 간단한 브라우저 기능

<br>

# jQuery로 AJAX 요청하기
- `$.get` 함수를 쓰고 안에 `url` 넣기

<br>

데이터 가져오기
```js
$.get('https://codingapple1.github.io/hello.txt');
```
- 인사말 가져오기

<br>

```js
$.get('https://codingapple1.github.io/hello.txt').done(function(data){
  console.log(data)
});
```
- 가져온 데이터는 `.done` 아니면 `.then` 뒤에 붙이고 콜백함수 넣고 파라미터를 만들면 거기에 들어있다

<br>

```js
$.post('url~~', {name : 'kim'})
```
- 서버로 데이터를 보낼 수 있는 POST 요청을 주고 싶을 때 위처럼 사용
- `.done`도 가능

<br>

```js
$.get('https://codingapple1.github.io/hello.txt')
  .done(function(data){
    console.log(data)
  })
  .fail(function(error){
    console.log('실패함')
  });
```
- ajax 요청 성공시 `.done` 안에 있는 코드를 실행해줌
- ajax 요청 실패 시 `.fail` 안에 있는 코드를 실행해줌

<br>

- `done/fail` 말고 `then/catch` 사용 가능 

<br>

# Q. 다음 url로 GET요청을 해서 가격정보를 가져와 콘솔창에 출력

https://codingapple1.github.io/price.json 여기로 GET요청하면 오늘의 상품가격을 알려줍니다.

콘솔창에 5000이 뜨면 성공

<br>

```js
fetch('https://codingapple1.github.io/price.json')
  .then(res => res.json())
  .then(function(data){
    console.log(data)
  })
  .catch(function(error){
    console.log('실패함')
  });
```
- `fetch` 함수는 Edge 브라우저 이상에서만 동작함
- 코드가 한 줄 더 필요한 이유
    - 서버와 데이터를 주고 받을 때 문자만 주고받을 수 있다
        - array, object 전송 불가능
    - {price : 5000}은 받아왔는데?
        - object를 JSON으로 바꿔서 전송해줬기 때문
        - `"{price : 5000}"`
    - JSON은 문자로 인식하기 때문에 서버와 데이터 주고받기가 가능
- 하지만 jQuery의 `$.get()`은 JSON으로 자료가 도착하면 알아서 array/object 자료로 바꿔준다
- 기본함수 `fetch()`는 JSON으로 자료가 도착하면 알아서 array/object 자료로 바꿔주지 않는다
    - 따라서 `fetch()`로 가져온 결과를 array/object로 바꾸고 싶으면 `res.json()` 코드를 추가해주면 된다
- 귀찮으면 jQuery나 axios 같은 라이브러리를 설치하면 ajax가 간편해진다

<br>

# 숙제
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
    
          <div class="col-sm-4">
            <img src="https://via.placeholder.com/600" class="w-100">
            <h5>Card title</h5>
            <p>가격 : 70000</p>
          </div>
    
      </div>
    </div> 

    <script>
      var products = [
        { id : 0, price : 70000, title : 'Blossom Dress' },
        { id : 1, price : 50000, title : 'Springfield Shirt' },
        { id : 2, price : 60000, title : 'Black Monastery' }
      ];

    </script> 
      
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
  </body>
</html>
```

<br>

```html
<div class="container">
  <div class="row">

      <div class="col-sm-4">
        <img src="https://via.placeholder.com/600" class="w-100">
        <h5>Card title</h5>
        <p>가격 : 70000</p>
      </div>

  </div>
</div> 
```
- 자바스크립트를 이용하여 카드 레이아웃 3개 생성하기
- `var products`에 있던 데이터도 html에 있어야 함
- `div class="col-sm-4"`가 카드 1개

### 풀이
```js
var products = 생략;

products.forEach((a, i)=>{
      var 템플릿 = 
      `<div class="col-sm-4">
        <img src="https://via.placeholder.com/600" class="w-100">
        <h5>${products[i].title}</h5>
        <p>가격 : ${products[i].price}</p>
      </div>`;
      $('.row').append(템플릿)
});
```

혹은

```js
var products = 생략;

products.forEach((a, i)=>{
      var 템플릿 = 
      `<div class="col-sm-4">
        <img src="https://via.placeholder.com/600" class="w-100">
        <h5>${a[i].title}</h5>
        <p>가격 : ${a[i].price}</p>
      </div>`;
      $('.row').append(템플릿)
});
```
- `<div class="row">`안에 있던 카드 지우고 카드 레이아웃을 `<div class="row">`안에 넣기를 3번 함

<br>

---
# 상품 더보기 버튼 누르면 상품 3개 가져오기
버튼을 하나 생성후 버튼 눌렀을 때 상품 가져오기  
`https://codingapple1.github.io/js/more1.json` GET 요청 시 상품 3개의 데이터를 보내줌
```js
<div class="container">
  <button class="btn btn-danger" id="more">더보기</button>
</div>

<script>
  $('#more').click(function(){
    $.get('https://codingapple1.github.io/js/more1.json')
      .done((data)=>{
        console.log(data)
      });
  });
</script>
```
- html에 버튼 하나 생성 후, 버튼 눌렀을 때 get 요청하여 성공하면 결과를 console 창에 출력

<br>

# 가져온 데이터로 카드 3개 생성
- 버튼 눌렀을 때 데이터는 잘 가져옴
- 가져온 데이터로 카드 레이아웃을 3개 더 만들기
- 버튼 누르면 카드 레이아웃이 3개 더 생성되면 됨
```html
<div class="container">
  <button class="btn btn-danger" id="more">더보기</button>
</div>

<script>
  $('#more').click(function(){
    $.get('https://codingapple1.github.io/js/more1.json')
      .done((data)=>{
        
        data.forEach((a, i)=>{
          var 템플릿 = 
          `<div class="col-sm-4">
            <img src="https://via.placeholder.com/600" class="w-100">
            <h5>${data[i].title}</h5>
            <p>가격 : ${data[i].price}</p>
          </div>`;
          $('.row').append(템플릿)
        })
        
      });
  });
</script>
```
- `.done()`안에 카드 3개를 추가해달라고 코드 작성
- 카드 레이아웃 생성 후 `append()`하는 코드를 3번 반복

<br>

# 문제
1. 더보기 버튼을 2번 째 누르면 7, 8, 9 번째 상품을 가져와서 html로 보여주기
    - `https://codingapple1.github.io/js/more2.json`으로 GET 요청하면 7, 8, 9 번째 상품이 도착
    - 유저가 더보기 버튼을 몇 번 눌렀는지를 기록해야 내가 버튼 누를 때마다 어디로 GET 요청할지 판단할 수 있음
    - 10, 11, 12 번 상품은 없으므로 버튼 3번 못누르게하기
2. 유사한 코드 발생
    - forEach 반복문 2번 사용
    - 함수로 축약해보기
    - 함수 축약 시 변수는 파라미터로 바꾸기
        - a, i 변수들은 이미 콜백함수에 의해 파라미터화 되어있기 때문에 신경안써도됨

