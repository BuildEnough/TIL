# setTimeout()
- x초 후에 코드를 실행해줌
- 시간은 ms 단위(1000 => 1초)
```javascript
setTimeout(function(){실행할코드}, 기다릴시간);
```

<br>

- 5초 후에 `<div>`를 숨기기
```html
<div class="alert alert-danger">
  5초 이내 구매시 사은품 증정
</div>

<script>
  setTimeout(function(){
    $('.alert').hide();
  }, 5000);

</script>
```

<br>

# setInterval()
- x초마다 코드 실행
```javascript
setInterval(function(){}, 기다릴시간);
```

<br>

# 자바스크립트 문법 vs 브라우저 사용법
- 자바스크립트 문법: `var` `let` `const` `if` `function`
- 웹 브라우저 사용법: `document.querySelector()` `alert()` `setTimeout()` `addEventListener()`

<br>

# 콜백함수 관련 기술
- 콜백함수: 함수 파라미터 자리에 들어가는 함수
- 콜백함수도 함수이기 때문에 다른 곳에서 만든 함수를 넣어도 잘 동작함
```javascript
setTimeout(함수, 1000);

function 함수(){ 
  console.log('안녕')
}
```

<br>

# 숙제 1초마다 5라는 문자 1씩 감소
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
  <body class="">

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
          <span class="badge bg-dark">Dark 🔄</span>
          <button  class="navbar-toggler" type="button">
            <span class="navbar-toggler-icon"></span>
          </button>
        </div>
    </nav> 

    <script>

      var count = 0;

      $('.badge').on('click', function() {
        count++;
        if (count % 2 == 1) {
          $('.badge').html('Light 🔄')
        } else {
          $('.badge').html('Dark 🔄')
        }
      });   

    </script>

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

    <div class="alert alert-danger">
      <span id="num">5</span>초 이내 구매 시 사은품 증정!
    </div>

    <script>

      var count = 5

      setInterval(function(){
        count--;
        if (count >= 0) {
          document.querySelector('#num').innerHTML = count;
        }

      }, 1000);

    </script>


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