# 자료 다루기
```html
<div class="container mt-3">
  <div class="card p-3">
    <span class="car-title">상품명</span>
    <span>가격</span>
  </div>
</div> 

<script>
  var car2 = { name : '소나타', price : [50000, 3000, 4000] } 
  document.querySelector('.car-title').innerHTML = car2.name;
</script>
```
- car2에 저장된 자료는 object
    - object 안에 array와 object를 넣을 수 있다
    - array 안에 array와 object를 넣을 수도 있다

<br>

### car2에 있는 50000 이라는 데이터를 뽑아서 html 가격표시 부분에 넣고 싶은 경우
1. `console.log`를 사용하여 복잡한 자료를 출력부터 해보기
    ```js
    console.log(car2);
    ```
    - 시작 기호가 {}중괄호면 object 자료형
2. `console.log(car2.price)`
    - 시작기호가 []대괄호면 array 자료형
    ```js
    console.log(car2.price[1]); // 3000
    console.log(car2.price[0]); // 50000
    ```

<br>

# 그냥 하드코딩하면 안되나?
- 되긴하지만 실제 사이트에서 html이 항상 바뀌기 때문에 안됨
- 가격을 매일 서버에서 받아서 html로 보여줘야하는데  
html 안에 50000 이렇게나
`document.querySelector('.car-title').innerHTML = 50000;` 이렇게 대충 적으면 나중에 수정하기 힘듬

<br>

# 웹 서비스 개발 시 2가지 방식
유저가 사이트에 접속하면 html을 만들어 보내주는 것을 `웹서비스`라고 한다
1. 서버에서 html을 미리 완성해서 고객에게 보내준다
    - `server-side rendering`이라고 함
2. 서버가 비어있는 html과 데이터만 보내줌
    - JavaScript를 이용하여 고객 브라우저 안에서 html을 완성함
    - ` client-side rendering`이라고 함
    - `데이터바인딩`하는 방법

<br>

- `데이터바인딩`하는 문법이 길고 복잡하기 때문에 작은 사이트는 JavaScript만 사용해도 가능
- 대형 사이트를 만들 땐 문법이 길고 복잡하기 때문에 `jQuery`, `React`, `Vue`를 사용하면 코드가 짧아짐

<br>

# 숙제
- `list.html` 만들기
    ```html
    <div class="card-group container">
    <div class="card">
        <img src="https://via.placeholder.com/600">
        <div class="card-body">
        <h5>Card title</h5>
        <p>가격 : 70000</p>
        <button class="btn btn-danger">주문하기</button>
        </div>
    </div>
    <div class="card">
        <img src="https://via.placeholder.com/600">
        <div class="card-body">
        <h5>Card title</h5>
        <p>가격 : 70000</p>
        <button class="btn btn-danger">주문하기</button>
        </div>
    </div>
    <div class="card">
        <img src="https://via.placeholder.com/600">
        <div class="card-body">
        <h5>Card title</h5>
        <p>가격 : 70000</p>
        <button class="btn btn-danger">주문하기</button>
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
    ```
- 3개의 상품제목, 가격을 html에 넣기

### 풀이

<br>

```js
document.querySelectorAll('.card-body h5')[0].innerHTML = products[0].title;
document.querySelectorAll('.card-body p')[0].innerHTML = '가격 : ' + products[0].price

document.querySelectorAll('.card-body h5')[1].innerHTML = products[1].title;
document.querySelectorAll('.card-body p')[1].innerHTML = '가격 : ' + products[1].price;

document.querySelectorAll('.card-body h5')[2].innerHTML = products[2].title;
document.querySelectorAll('.card-body p')[2].innerHTML = '가격 : ' + products[2].price; 
```

아니면

```js
$('.card-body h5').eq[0].html(products[0]['title']);
$('.card-body p').eq[0].html('가격: ' + products[0]['price']);

document.querySelectorAll('.card-body h5')[1].innerHTML = products[1]['title'];
document.querySelectorAll('.card-body p')[1].innerHTML = '가격: ' + products[1]['price'];

document.querySelectorAll('.card-body h5')[2].innerHTML = products[2]['title'];
document.querySelectorAll('.card-body p')[2].innerHTML = '가격: ' + products[2]['price'];
```

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

    <script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
  </head>
  <body>

    <div class="card-group container">
        <div class="card">
          <img src="https://via.placeholder.com/600">
          <div class="card-body">
            <h5>Card title</h5>
            <p>가격 : 70000</p>
            <button class="btn btn-danger">주문하기</button>
          </div>
        </div>
        <div class="card">
          <img src="https://via.placeholder.com/600">
          <div class="card-body">
            <h5>Card title</h5>
            <p>가격 : 70000</p>
            <button class="btn btn-danger">주문하기</button>
          </div>
        </div>
        <div class="card">
          <img src="https://via.placeholder.com/600">
          <div class="card-body">
            <h5>Card title</h5>
            <p>가격 : 70000</p>
            <button class="btn btn-danger">주문하기</button>
          </div>
        </div>
      </div>
      
      <script>
        var products = [
          { id : 0, price : 70000, title : 'Blossom Dress' },
          { id : 1, price : 50000, title : 'Springfield Shirt' },
          { id : 2, price : 60000, title : 'Black Monastery' }
        ];

        $('.card-body h5').eq[0].html(products[0]['title']);
        $('.card-body p').eq[0].html('가격: ' + products[0]['price']);

        document.querySelectorAll('.card-body h5')[1].innerHTML = products[1]['title'];
        document.querySelectorAll('.card-body p')[1].innerHTML = '가격: ' + products[1]['price'];

        document.querySelectorAll('.card-body h5')[2].innerHTML = products[2]['title'];
        document.querySelectorAll('.card-body p')[2].innerHTML = '가격: ' + products[2]['price'];
      </script> 
      
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
  </body>
</html>
```