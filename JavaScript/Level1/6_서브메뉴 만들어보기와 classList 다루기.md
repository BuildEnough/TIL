# Bootstrap
- 구글에 Bootstrap 검색
- get started 버튼 선택
1. css 파일은 `<head>`태그 안
2. js 파일은 `<body>` 태그 끝나기 전에 넣기
- 잘 모르겠으면 [starter template](https://getbootstrap.com/docs/5.3/getting-started/introduction/) 항목에 있는 예제코드로 html 내용 넣기
- 기존에 만들어 놨던 css 파일도 `<link>`태그로 넣기

# Navbar 만들기
- Bootstrap 설치 해놨다는 가정
- Bootstrap 사이트에서 원하는 UI 검색 후 복사 붙여넣기
- 일단 Navbar 코드
```html
<nav class="navbar navbar-light bg-light">
  <div class="container-fluid">
    <span class="navbar-brand">Navbar</span>
    <button class="navbar-toggler" type="button">
      <span class="navbar-toggler-icon"></span>
    </button>
  </div>
</nav> 
```

<br>

### 누르면 등장하는 서브메뉴 만들기
    1. 미리 html, css로 디자인 만들고 숨기기
    2. 버튼 누르면 보여주기
- Bootstrap 사이트에서 `list group` 검색 후 `<nav>`밑에 붙여넣기
```html
<ul class="list-group">
  <li class="list-group-item">An item</li>
  <li class="list-group-item">A second item</li>
  <li class="list-group-item">A third item</li>
  <li class="list-group-item">A fourth item</li>
  <li class="list-group-item">And a fifth one</li>
</ul> 
```

<br>

### class 탈부착식으로 버튼을 누르면 보여주기
- css 파일에 평소 `.list-group`가 붙은 요소는 숨겨두기
- `show`라는 클래스를 부착하면 보여주는 것으로 개발
```css
.list-group {
  display : none
}
.show {
  display : block
}
```
- 버튼 누르면 `<ul class="list-group">` `<ul class="list-group" show>`와 같이 클래스를 탈부착하는 방식

<br>

- 탈부착 하는 이유는 `display: block;`말고 다른 스타일도 동시에 주고 싶을 경우 유용함

<br>

### 버튼 클릭시 클래스명 추가
- 버튼을 눌렀을때 `show`라는 클래스를 추가
- class 명을 원하는 요소에 추가하는 방법
    - `셀럭터로찾은요소.classList.add('클래스명')`
- class 명을 원하는 요소에서 제거하는 방법
    - `셀렉터로찾은요소.classList.remove('클래스명')`

<br>

```javascript
document.getElementsByClassName('navbar-toggler')[0].addEventListener('click', function(){
  document.getElementsByClassName('list-group')[0].classList.add('show');
});
```
- `class="navbar-toggler`을 가진 요소를 클릭하면  
`class="list-group"`인 요소에 `show`라는 클래스명을 추가

<br>

### 버튼 한 번 더 누르면 숨기기
- 버튼 한 번 더 누르면 `show`클래스 제거

<br>

```javascript
document.getElementsByClassName('navbar-toggler')[0].addEventListener('click', function(){
  document.getElementsByClassName('list-group')[0].classList.toggle('show');
});
```
- `.classList.toggle()`
    - 클래스명이 있으면 제거
    - 클래스명이 없으면 생성

<br>

# querySelector
`getElementById()`, `getElementsByClassName()`말고 다른 방식으로 html 요소를 찾아주는 셀렉터
```html
<div class="test1">안녕하세요</div>
<div id="test2">안녕하세요</div>

<script>
  document.querySelector('.test1').innerHTML = '안녕';
  document.querySelector('#test2').innerHTML = '안녕';
</script>
```
- `querySelector()`는 맨 위의 한 개 요소만 선택해준다

<br>

```html
<div class="test1">안녕하세요</div>
<div class="test1">안녕하세요</div>

<script>
  document.querySelectorAll('.test1')[1].innerHTML = '안녕';
</script>
```
- `querySelectorAll()`은 해당하는 걸 다 찾아서 []안에 담아준다

<br>

- `querySelector`로 바꾸기

```html
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="main.css">
  </head>
  <body>

    <nav class="navbar navbar-light bg-light">
        <div class="container-fluid">
          <span class="navbar-brand">Navbar</span>
          <button  class="navbar-toggler" type="button">
            <span class="navbar-toggler-icon"></span>
          </button>
        </div>
    </nav> 

    <ul class="list-group" id="test1">
        <li class="list-group-item">An item</li>
        <li class="list-group-item">A second item</li>
        <li class="list-group-item">A third item</li>
        <li class="list-group-item">A fourth item</li>
        <li class="list-group-item">And a fifth one</li>
    </ul>

    <script>

        document.querySelector('.navbar-toggler').addEventListener('click', function() {
            document.querySelector('.list-group').classList.toggle('show');
        });

        // document.getElementsByClassName('navbar-toggler')[0].addEventListener('click', function() {
        //     document.getElementsByClassName('list-group')[0].classList.toggle('show');
        // });
    </script>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
  </body>
</html>
```