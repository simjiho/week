var test="안녕";
console.log(test);
//변수 선언
//let 변수명:자료형
let studentName:string;
studentName="호기";
// studentName=19;
console.log(studentName);
let studentAge:number;
//number, string, boolean, object, 자료형[]
let isTrue:boolean;
let student:object;//객체형 타입이 모두 저장이 가능함
let hobby:string[];
//any타입 권장하지않음


isTrue=true;
isTrue=false;
//isTrue=1;

//함수선언하기
// function 함수명(매개변수명:자료형,매개변수명:자료형...):반환형{}
//const test=function(매개변수명:자료형,매개변수명:자료형...):반환형{}
//const arrow=(매개변수명:자료형,매개변수명:자료형...):반환형=>{}
//void 반환이 없을때 사용

// import {test1,test2} from './mymodule/functionModule';
// test1("아아",19);
// console.log(test2(["하나","둘","셋"]))