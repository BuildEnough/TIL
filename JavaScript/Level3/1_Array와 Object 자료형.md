# Array 자료형
- 자료를 한 곳에 저장하고 싶을 때 사용하는 자료형
- 여러 자료를 변수 하나에 저장하고 싶을 때 array 자료형 사용
```js
var car = ['소나타', 50000, 'white'];
```
- 대괄호를 열고 자료를 ,(콤마)로 구분해서 넣으면 됨
- 여러 자료를 엑셀처럼 저장가능

<br>

```js
var car = ['소나타', 50000, 'white'];
console.log(car[1]);
```
- array 자료에서 데이터를 뽑을 땐 []대괄호를 뒤로 붙이면 됨

<br>

```js
var car = ['소나타', 50000, 'white'];
car[1] = 60000;
console.log(car[1]);
```
- array 자료를 수정하고 싶으면 등호를 이용해서 수정하면 됨

<br>

# Object 자료형
- 여러가지 자료를 한 곳에 저장하고 싶을 때 사용하는 자료형
- 여러 자료를 변수 하나에 저장하고 싶으면 object 사용하면 편리함
```js
var car2 = { name : '소나타', price : 50000 };
```
- {}중괄호를 열고 자료를 ,(콤마)로 구분해서 넣으면 됨
- 자료 왼쪽에 자료의 이름을 붙여서 저장해야 함
- `key`: 자료의 이름
- `value`: 실제 자료
- object 자료형은 `key:value`형태로 자료를 저장할 수 있다

<br>

```js
var car2 = { name : '소나타', price : 50000 };
console.log(car2['name']);
console.log(car2.name);
```
- array 자료에서 데이터를 뽑을 땐 []대괄호를 뒤에 붙이면 됨
    - `[자료이름]`
- `.자료이름` 이것도 가능

<br>

```js
var car2 = { name : '소나타', price : 50000 };
car2['name'] = '그랜저';
console.log(car2['name']);
```
- object 자료를 수정하고 싶으면 =등호를 이용하여 수정하면 됨
- 자료 추가도 =등호를 이용하면 됨

# Array/Object 차이
`상품명`, `가격`, `연식`, `색상`, `옵션여부`, `...`
- 이런 데이터를 변수 하나에 보관하고 싶으면 `object`가 좋을거 같음

<br>

```js
var car = ['소나타', 50000, 2030, 'white', false];
```
- array를 사용하면 저장 시 간단하겠지만, 자료를 뽑을 때 힘들 수 있음
    - 가격을 뽑을 때 "몇 번째 위치에 있었는지"를 기억해야 함

<br>

```js
var car = { name : '소나타', price : 50000, year : 2030 };
```
- object로 넣으면 저장은 귀찮지만 가격을 뽑을 때 "가격의 key 이름이 뭔지를" 기억하면 됨

<br>

# Array/Object 차이 2
- array는 순서가 있다
    - 왼쪽에 있을수록 더 앞에 있는 자료
- object는 순서가 없다

<br>

array는 순서가 있기 때문에 순서개념이 필요한 것들을 할 수 있다
- 가나다순 정렬
- x번 자료부터 x번 자료까지 자르기
- x번 자료 바꾸기
- 맨 뒤, 맨 앞에 자료 넣기
- 원하는 자료가 있는지 검색

<br>

- `array.sort()`: 가나다순 정렬
- `array.slice(x, y)`: x번부터 y번 전까지 자름
- `array.push(x)`: x를 맨 뒤에 입력
- ...

<br>

# 숙제
```html
<div class="container mt-3">
  <div class="card p-3">
    <span>상품명</span>
    <span>가격</span>
  </div>
</div> 

<script>
  var car2 = { name : '소나타', price : 50000 } 
</script>
```
- 여기서 car2에 저장된 소나타라는 상품명과 50000이라는 가격을 뽑아서 html에 넣기

<br>

### 풀이

```html
<div class="container mt-3">
    <div class="card p-3">
    <span id="item">상품명</span>
    <span id="price">가격</span>
    </div>
</div>

<script>``
    var car2 = {name :'소나타', price: 50000}

    document.getElementById('item').innerHTML = car2['name'];
    document.getElementById('price').innerHTML = car2['price'];
</script>
```

<br>

### 정리
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

    <div class="container mt-3">
      <div class="card p-3">
        <span id="item">상품명</span>
        <span id="price">가격</span>
      </div>
    </div>

    <script>
      
      var car = ['소나타', 50000, 'white'];
      var car2 = {name :'소나타', price: 50000}

      document.getElementById('item').innerHTML = car2['name'];
      document.getElementById('price').innerHTML = car2['price'];
    

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

```js
$('.list').click(function(e) {

  탭열기(e.target.dataset.id)

});



function 탭열기(num) {
  $('.tab-button').removeClass('orange');
  $('.tab-button').eq(num).addClass('orange');
  $('.tab-content').removeClass('show');
  $('.tab-content').eq(num).addClass('show');
}
```