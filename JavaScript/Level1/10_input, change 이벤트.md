# input 이벤트와 change 이벤트
input 이벤트
```javascript
document.getElementById('email').addEventListener('input', function(){
  console.log('안녕')
});
```
- `<input>`에 입력된 값이 변경될 때 input 이벤트가 발생함

<br>

chagne 이벤트
```javascript
document.getElementById('email').addEventListener('change', function(){
  console.log('안녕')
});
```
- `<input>`에 입력된 값이 변경되고 커서를 다른 곳에 찍으면 change 이벤트가 발생함