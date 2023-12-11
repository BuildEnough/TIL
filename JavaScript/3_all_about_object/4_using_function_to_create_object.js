/**
 * Using Function to create objects
 */
function IdolModel(name, year) {
    if(!new.target) { // new 키워드를 안써도 사용할 수 있게 해줌
        return new IdolModel(name, year);
    }

    this.name = name;
    this.year = year;

    // return {};
    // return 123;

    this.dance = function() {
        return `${this.name}이 춤을 춥니다.`;
    }
}

const yuJin = new IdolModel('안유진', 2003);
console.log(yuJin);
// console.log(yuJin.dance());

const yuJin2 = IdolModel('안유진', 2003); // undefinded. 생성자 함수라면 new 키워드를 반드시 사용해야 됨
console.log(yuJin2);
// console.log(global.name);


const IdolModelArrow = () => {
    this.name = name;
    this.year = year;
};

// const yuJin3 = new IdolModelArrow('안유진', 2003); // new 키워드는 일반 함수에서만 사용 가능, 여기선 에러 발생
