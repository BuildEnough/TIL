# \<from> 만들기
```html
<form action="success.html">
  <div class="my-3">
    <input type="text" class="form-control">
   </div>
   <div class="my-3">
     <input type="password" class="form-control">
   </div>
   <button type="submit" class="btn btn-primary">전송</button>
   <button type="button" class="btn btn-danger" id="close">닫기</button>
</form> 
```
- modal 창 안에 form 만들기
- `success.html` 파일도 같은 폴더에 하나 만들어두기
- 전송 버튼을 누르면 form 전송이 되고 `success.html`로 이동함

<br>

# if else 조건문
```javascript
if (조건식) {
    실행할 코드
} else {
    조건식이 false일 때 실행할 코드
}
```

<br>

# 간편한 alert 함수
- 간단한 알림팝업은 `alert(~)` 사용

<br>

# 전송버튼 누르면 공백체크
### 전송버튼 누르면 input에 입력한 값이 공백인 경우 알림창 띄우기
```javascript
$('form').on('submit', function(){
  input에 입력한 값이 공백인 경우 알림 띄우기~~
});
```
- 버튼에 `click` 이벤트리스너나 `<form>`태그에 submit 이벤트리스너를 달아도 동일하게 작동함
  - form 전송이 되면 `<form>` 태그에서 submit 이벤트도 발생하기 때문
- 원하는 html을 태그명으로 찾고 싶으면 `$('태그명')`만 적으면 됨

<br>

```javascript
$('form').on('submit', function(){
  if (document.getElementById('email').value == '') {
    alert('아이디 입력하쇼');
  }
});
```
- `jQuery` 사용시 `$('#email').val() == ''`

<br>

### form 전송 막는 법
```javascript
$('form').on('submit', function(e){
  if (document.getElementById('email').value == '') {
    e.preventDefault();
    alert('아이디 입력하쇼');
  }
});
```
- 이벤트리스너 콜백함수에 `e`라는 파라미터 추가 후 `e.preventDefault()`라고 쓰면 form 전송이 안됨

<br>

# 정리
```html
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="main.css">

    <script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
  </head>
  <body>

    <div class="black-bg">
      <div class="white-bg">
        <h4>로그인하세요</h4>
        
        <form action="success.html">
          <div class="my-3">
            <input type="text" class="form-control" id="email">
           </div>
           <div class="my-3">
             <input type="password" class="form-control" id="password">
           </div>
           <button type="submit" class="btn btn-primary" id="send">전송</button>
           <button type="button" class="btn btn-danger" id="close">닫기</button>
        </form>

      </div>
    </div>

    <script>

      $('form').on('submit', function() {
        if (document.getElementById('email').value === ''){
          alert('아이디를 입력을 해주세요');
        } else if (document.getElementById('password').value === ''){
          alert('비밀번호를 입력을 해주세요');
        }

        if (document.getElementById('password').value.length < 6){
          alert('비밀번호가 6자리 미만입니다')
        }
      });

    </script>

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

    <div class="main-bg">
      <h4>Shirts on Sale</h4>
      <button id="login" class="btn btn-danger">로그인</button>
    </div>


    <script>
        $('#login').on('click', function() {
          $('.black-bg').addClass('show-modal');
        });

        $('#close').on('click', function() {
          $('.black-bg').addClass('unShow-modal');
        });

        document.querySelector('.navbar-toggler').addEventListener('click', function() {
            document.querySelector('.list-group').classList.toggle('show');
        });

    </script>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
  </body>
</html>
```