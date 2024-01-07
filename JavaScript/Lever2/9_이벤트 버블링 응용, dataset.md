### 이전 탭 기능 코드
```js
for (let i = 0; i < $('.tab-button').length; i++){

  $('.tab-button').eq(i).on('click', function(){
    $('.tab-button').removeClass('orange');
    $('.tab-button').eq(i).addClass('orange');
    $('.tab-content').removeClass('show');
    $('.tab-content').eq(i).addClass('show');
  })

});
```

<br>

### 탭 기능 함수로 축약
```js
for (let i = 0; i < $('.tab-button').length; i++){

  $('.tab-button').eq(i).on('click', function(){
    탭열기(i)
  })

});


function 탭열기(num){
  $('.tab-button').removeClass('orange');
  $('.tab-button').eq(num).addClass('orange');
  $('.tab-content').removeClass('show');
  $('.tab-content').eq(num).addClass('show');
}
```
- 함수로 코드를 만들 때 변수가 있으면 변수를 전부 파라미터로 바꾸는 것이 좋다
- `탭열기(0)`: 0번 탭 열림
- `탭열기(1)`: 1번 탭 열림
- `탭열기(2)`: 2번 탭 열림

<br>

### `이벤트 버블링` 알면 `이벤트 리스너` 줄이기 가능
- 탭을 만들 때 이벤트리스너를 3개 부착했다
- 이벤트리스너 1개만 사용해도됨
    - 이벤트버블링이 항상 일어나기 때문
```js
$('.list').click(function(e){
  if (e.target == document.querySelectorAll('.tab-button')[0] ){
    탭열기(0)
  }
  if (e.target == document.querySelectorAll('.tab-button')[1] ){
    탭열기(1)
  }
  if (e.target == document.querySelectorAll('.tab-button')[2] ){
    탭열기(2)
  }
})

function 탭열기(){
  생략
}
```
- 성능이 개선됨

<br>

### dataset 문법
```html
<div data-데이터이름="값"></div> 
```
- html 안에 유저 몰래 정보를 숨겨놓을 수 있다
- 데이터이름은 아무렇게 작명 후 값을 넣으면 됨
- 일반 유저들은 모름

<br>

```js
document.querySelector().dataset.데이터이름;
```
- html 요소에 숨겨놨던 데이터가 자리에 남는다

<br>

```html
<li class="tab-button" data-id="0">Products</li> 
<li class="tab-button orange" data-id="1">Information</li> 
<li class="tab-button" data-id="2">Shipping</li> 
```
- 탭의 버튼들에 데이터를 숨겨둔다
- 지금까진 if문이 3개 존재

<br>

```js
$('.list').click(function(){
  탭열기(지금누른버튼에 숨어있던 data-id)
});
```
- if문이 여러개 필요없이 한 줄로 해결가능

<br>

```js
$('.list').click(function(e){
  탭열기(e.target.dataset.id)
});
```
- 지금 누른 버튼을 찾고 싶을 떈 `e.target`
- 거기에 숨어있는 `data-id` 꺼내고 싶을 때 `.dataset.id` 붙이기

### 배운 것
1. 함수로 축약할 때 변수 같은 것이 있으면 파라미터로 바꾸는 것이 좋다
2. 이벤트리스너 줄이면 이점생김
3. `dataset` 문법알면 이벤트리스터를 적게 사용할 때 어떤 것을 눌렀는지 파악 됨

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
// for (let i = 0; i < $('.tab-button').length; i++){
//   $('.tab-button').eq(i).on('click', function(){
//     탭열기(i)
//   });
// }

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