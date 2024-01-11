# DOM(Document Object Model)
- 자바스크립트는 HTML 조작에 특화된 언어
- 자바스크립트가 어떻게 HTML을 조작할 수 있는지 원리에 대해 생각..
- HTML과 자바스크립트는 다른 언어
- 그래서 자바스크립트에서 `<p></p>`와 같은 html을 직접 해석하고 조작할 수 없다

<br>

동작 안됨
```js
<script>

  <p></p>.innerHTML = '안녕' (당연히 에러날듯)

</script>
```

<br>

### 그럼 어떻게 자바스크립트는 HTML 태그들을 알아보고 조작하는 걸까?
- HTML을 자바스크립트가 해석할 수 있는 문법으로 변환하면 됨
- HTML을 array 혹은 object 자료형에 넣기
- 실제로 브라우저는 HTML 페이지를 열어줄 때 HTML을 자바스크립트로 쉽게 찾고 바꾸기 위해 object와 비슷한 자료형에 담아준다

<br>

```html
<div style="color : red">안녕하세요</div>

```
- 브라우저는 이런 HTML을 발견하면 object 자료로 바꿔서 보관해둔다
- 구체적으로 `var document = {}`이런 변수를 하나 만들어서 넣어줌

<br>

```js
var document = {
  div1 : {
    style : {color : 'red'}
    innerHTML : '안녕하세요'
  }
}
```
- 이렇게 object 자료에 정리를 해놓음
- 이렇게 해야 점을 찍어서 원하는 자료를 출력하고 조작할 수 있다
- `document.div1.innerHTML = '안녕'`이렇게 JS를 짜면 HTML 조작 가능
- 그래서 object에 담아두는 것(실제 DOM 생김새와 다름)

<br>

- 위의 변수를 `document.object`라고 부른다
- +model을 붙여 `Docuemnt Object Model`
- 자바스크립트가 HTML에 대한 정보들(id, class, style, innerHTML)을 object 자료로 정리한 것을 DOM이라고 한다

<br>

---
# 브라우저는 HTML 문서를 위에서부터 읽으며 DOM을 생성함
- 브라우저는 HTML 문서를 위에서부터 차례로 읽어내려간다
- 읽을 때마다 HTML을 발견하면 DOM에 추가한다

<br>

에러 발생하는 코드
```html
(html 파일)

<script>
  document.getElementById('test').innerHTML = '안녕'
</script>

<p id="test">임시글자</p>
```
- 브라우저는 HTML을 위에서부터 한 줄씩 읽는다
- 갑자기 자바스크립트로 `<p id="test">`인 요소를 DOM에서 찾고 바꾸라고 해서 에러가 발생한다
- 아직 `<p id="test">`를 읽기 전이라 p 태그에 대한 DOM이 생성되지 않았기 때문
- 자바스크립트는 DOM이 생성된 경우에만 HTML을 변경할 수 있다

<br

# 자바스크립트 실행을 나중으로 미루는 방법
HTML을 전부 다 읽고 실행해달라고 코드를 작성할 수 있다
```js
$(document).ready(function(){ 실행할 코드 })
document.addEventListener('DOMContentLoaded', function() { 실행할 코드 }) 
```
- 둘 중 마음에 드는 것 사용하면 됨
- 이 이벤트리스너들은 `HTML을 다 읽어들였는지`를 알려주는 이벤트리스너

<br>

```html
(html 파일)

<script>
  document.addEventListener('DOMContentLoaded', function() { 
    document.getElementById('test').innerHTML = '안녕'
  })
</script>

<p id="test">임시글자</p>
```
- 밑에 있는 `<p id="test">` 변경해달라는 코드가 잘 동작함

<br>

- 자바스크립트를 `<body>`태그 끝나기 전에 전부 작성하기 때문에 그런 걱정은 잘 안함
- 자바스크립트 위치를 내가 정할 수 없는 경우에 유용한 방법

<br>

---

# load 이벤트리스너
- `load`라는 이벤트리스너를 사용한 `DOM` 생성뿐만 아니라 이미지, css, js 파일이 로드가 됐는지도 체크가능함
- 이미지 같은 것이 로드되면 이벤트가 발생하기 때문

<br>

```js
셀렉터로찾은이미지.addEventListener('load', function(){
  //이미지 로드되면 실행할 코드 
})
```
- 외부 자바스크립트 파일에 적어두면 그 js 파일보다 이미지가 더 먼저 로드되는 경우가 있으니 이벤트 발생체크를 못할 수도 있다

<br>

```js
$(window).on('load', function(){
  //document 안의 이미지, js 파일 포함 전부 로드가 되었을 경우 실행할 코드 
});

window.addEventListener('load', function(){
  //document 안의 이미지, js 파일 포함 전부 로드가 되었을 경우 실행할 코드
})
```
- window에 붙여도 됨
- document에 포함된 이미지, CSS 파일 등 모든 것이 로드가 되었는지 체크해준다

<br>

### ready와의 차이
- `.ready()`는 DOM 생성만 체크해주는 함수
- `load`는 모든 파일과 이미지의 로드상태를 체크해줌
- 그래서 "이미지가 다 로드외면 사이트 보여달라"는 코드는 답답할 수도 있음