# Dark mode
- 사이트가 반전되는 다크 모드
- class를 css 파일에 미리 만들어놓고 버튼을 부착하면 됨

<br>

```html
<span class="badge bg-dark">Dark 🔄</span>
```
- 버튼 추가

<br>

- 버튼 클릭횟수가 홀수면 내부 글자를 Light로 변경
- 버튼 클릭횟수가 짝수면 내부 글자를 Dark로 변경
```javascript
var count = 0;

$('.badge').on('click', function() {
count++;
if (count % 2 == 1) {
    $('.badge').html('Light 🔄')
} else {
    $('.badge').html('Dark 🔄')
}
});   
```