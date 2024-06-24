/**
 * 변수 선언
 * var
 * let
 * const
 */

var name = 'enough';
console.log(name);

var age = 99;
console.log(age);

let ive = '아이브';
console.log(ive);

/**
 * var와 let은
 * 값을 추후 변경할 수 있다
 */

ive = '안유진';
console.log(ive);

const newJeans = '뉴진스';
console.log(newJeans);

// newJeans = 'enough';

/**
 * 선언과 할당
 * 
 * 1) 변수를 선언하는 것
 * 2) 할당
 */
var name = 'enough';
console.log(name);

let girlFriend;
console.log(girlFriend); // 할당을 안했기 때문에 undefined가 자동으로 설정됨

// const girlFriend2; // const는 undefined로 될 수 없다