# jQuery
- 자바스크립트의 특징은 코드가 매우 길고 더럽다
- 따라서 html 조작을 쉽게 바꿔주는 라이브러리를 사용할 수 있다
    - `React`, `Vue`, `jQuery`
- `jQuery`는 자바스크립트의 `querySelectorAll`, `addEventListener`, `classList.add` 등을 이름만 짧게 바꿔주는 라이브러리

<br>

# jQuery 설치
- Google에 jQuery cdn 검색
- jQuery 3.x 버전 `<script>` 태그를 html 파일에 복붙
- jQuery 설치한 부분의 하단부터 jQuery 문법 사용 가능

<br>

# jQuery로 html 변경
```html
<p class="hello">안녕</p>

<script>
  $('.hello').html('바보'); 
</script>
```
- `$`은 `querySelector`와 동일하게 사용하면 됨

<br>

# jQuery로 스타일 변경
```html
<p class="hello">안녕</p>

<script>
  $('.hello').css('color', 'red');
</script>
```

<br>

# jQuery 주의사항
- html 셀럭터로 찾으면 html 함수들을 뒤에 붙이고  
jQuery 셀렉터로 찾으면 jQuery 함수들을 뒤에 붙여야 한다
- `$('').innerHtml`은 안됨(jQuery와 html 셀렉터 섞여있음)

<br>

# jQuery로 class 탈부착
```html
<p class="hello">안녕</p>

<script>
  $('.hello').addClass('클래스명');
  $('.hello').removeClass('클래스명');
  $('.hello').toggleClass('클래스명');
</script>
```

<br>

# html 여러 개 바꾸기
javaScript
```html
<p class="hello">안녕</p>
<p class="hello">안녕</p>
<p class="hello">안녕</p>

<script>
  document.querySelectorAll('.hello')[0].innerHTML = '바보';
  document.querySelectorAll('.hello')[1].innerHTML = '바보';
  document.querySelectorAll('.hello')[2].innerHTML = '바보';
</script>
```

<br>

jQuery
```html
<p class="hello">안녕</p>
<p class="hello">안녕</p>
<p class="hello">안녕</p>

<script>
  $('.hello').html('바보');
</script>
```
- `$()` 셀렉터는 `querySelectorAll`처럼 여러 개가 있으면 전부 찾아준다
- [0]과 같이 순서를 지정해 줄 필요 없다
- `.html()`을 붙이면 셀렉터로 찾은 모든 요소를 한 번에 조작하고 변경할 수 있다

<br>

# jQuery 이벤트 리스너
```html
<p class="hello">안녕</p>
<button class="test-btn">버튼</button>

<script>
  $('.test-btn').on('click', function(){
    어쩌구~
  });
</script>
```
- `on`을 `addEventListener` 대신 사용
- `on`은 `$()`으로 찾은 것들에만 붙일 수 있다

<br>

# jQuery UI 애니메이션
```html
<p class="hello">안녕</p>
<button class="test-btn">버튼</button>

<script>
  $('.test-btn').on('click', function(){
    $('.hello').fadeOut();3
  });
</script>
```
- `.hide()`: 사라지게
- `.fadeOut()`: 서서히 사라지게
- `.slideUp()`: 줄어들며 사라지게
- 애니메이션을 반대로 주고 싶으면 `show()`, `fadeIn()`, `slideDown()`이 있다
