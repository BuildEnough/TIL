### 새로운 파일 생성
- `detail.html` 생성
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
          <li class="tab-button">Products</li>
          <li class="tab-button orange">Information</li>
          <li class="tab-button">Shipping</li>
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

# 자바스크립트 파일 모듈화
- 자바스크립트 코드가 길고 복잡할 때 다른 파일로 뺄 수 있다
1. 작업 폴더에 `~.js`파일 생성
    - js 코드 작성
2. js 코드가 필요한 html 파일에
```html
<script src="~.js"></script>
```

<br>

# 첫 버튼부터 기능 개발
버튼 0 누르면  
버튼 0에 orage 클래스명 부착  
박스 0에 show 클래스명 부착  
- 여기까지만 하면 안됨

<br>

버튼 0 누르면  
버튼 0, 1, 2에 붙어있던 orange 클래스명 전부 제거하라고 코드 3줄 생성하기  
버튼 0에 orange 클래스명 부착  
박스 0, 1, 2에 붙어있던 show 클래스명 전부 제거하라고 코드 3줄 생성  
박스 0에 show 클래스명 부착

<br>

# jQuery 셀렉터로 여러 요소 찾은 뒤 하나만 고르기
- `class="tab-button"`를 가진 요소가 3개 존재
- `$('.tab-button').on()`로 이벤트 리스너를 하면 3개 버튼 전부 이벤트리스너가 달림
- 버튼 0만 달고 싶으면
    ```js
    $('.tab-button').eq(0).on('click', function(){
  
    });
    ```

<br>

# 탭 기능 완성
```js
$('.tab-button').eq(0).on('click', function() {
    $('.tab-button').removeClass('orange');
    $('.tab-button').eq(0).addClass('orange');
    $('.tab-content').removeClass('show');
    $('.tab-content').eq(0).addClass('show');
});

$('.tab-button').eq(1).on('click', function(){
    $('.tab-button').removeClass('orange');
    $('.tab-button').eq(1).addClass('orange');
    $('.tab-content').removeClass('show');
    $('.tab-content').eq(1).addClass('show');
  });
  
  
  $('.tab-button').eq(2).on('click', function(){
    $('.tab-button').removeClass('orange');
    $('.tab-button').eq(2).addClass('orange');
    $('.tab-content').removeClass('show');
    $('.tab-content').eq(2).addClass('show');
  });
```
- 만약 `querySelectorAll()`사용하면 `[0]`붙이기0

<br>

# 반복적인 셀렉터는 변수에 넣어 사용
- 비슷한 셀렉터가 많이 보임
- 셀렉터 문법은 기본적으로 작동시간이 오래걸림
  - 셀렉터를 하나 사용할 때마다 html을 읽고 찾아야 하기 때문
- 셀렉터가 반복적으로 등장하면 변수에 넣어 사용하는 것이 좋음
- `querySelector`도 마찬가지

<br>

```js
var 버튼 = $('.tab-button');

버튼.eq(0).on('click', function(){
  버튼.removeClass('orange');
  버튼.eq(0).addClass('orange');
  $('.tab-content').removeClass('show');
  $('.tab-content').eq(0).addClass('show');
})
```
- 셀렉터 3번 사용 -> 1번 사용: 성능적 이점 생김

<br>

# 코드 반복 -> for 반복문
```js
for (횟수) {
  반복할 코드
}
```

<br>

```js
for (let i=0; i<3; i++) {
  console.log(i)
}
```

<br>

# for 반복문으로 탭기능 코드 줄이기
```js
for (let i = 0; i < 3; i++){

  $('.tab-button').eq(i).on('click', function(){
    $('.tab-button').removeClass('orange');
    $('.tab-button').eq(i).addClass('orange');
    $('.tab-content').removeClass('show');
    $('.tab-content').eq(i).addClass('show');
  });
}
```
- for 반복문 사용시 변수를 `var i`말고 `let i`로 바꿔야 함
  - `var`는 범위가 `function`
  - `let`은 범위가 `{}`

<br>

# 확장성 있는 코드로 바꾸기
1. 원하는 기능이 잘 동작하는가
2. 확장성이 좋은가
3. 차후 관리가 쉬운가
4. 성능문제 없는가

### 현재 탭이 3개지만 4개, 5개가 되면 어떻게 해야할까
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

- 3이라는 숫자 대신 `지금 html에 있는 탭 버튼의 개수` 넣기

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
          <li class="tab-button">Products</li>
          <li class="tab-button orange">Information</li>
          <li class="tab-button">Shipping</li>
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
for (let i = 0; i < $('.tab-button').length; i++){
  $('.tab-button').eq(i).on('click', function(){
    $('.tab-button').removeClass('orange');
    $('.tab-button').eq(i).addClass('orange');
    $('.tab-content').removeClass('show');
    $('.tab-content').eq(i).addClass('show');
  });
}
```