## char 타입(문자 타입)은 정수 타입일까 문자 타입일까?
- 정수 타입이다
- 문자 리터럴은 유니코드로 변환되어 저장하는데, 유니코드는 세계 각국의 문자를 0 ~ 65535 숫자로 매핑한 국제 표준 규약
- 자바는 이러한 유니코드를 저장할 수 있도록 char 타입을 제공한다
- **즉 유니코드가 정수이기 때문에 char 타입도 정수 타입에 속한다**