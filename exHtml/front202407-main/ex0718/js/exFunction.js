// 1. 함수를 그냥 사용해본다.
//----- 기본 함수 사용해보기 -----
function myFunc1() {
    console.log("나는 기본 함수예요");
}
myFunc1();


// 2. 함수안에 값을 넣어서 사용해본다.
//----- myParm변수 매개값을 전달받는 함수 사용해보기 -----
function myFunc2(myParm) {
    console.log("나는 ", myParm, "값을 가지는 함수예요");
}
myFunc2("파라메터값");


// 3. 함수안에있는 값을 받아서 사용해본다. 
//----- return값을 전달받는 함수 사용해보기 -----
function myFunc3() {
    console.log("나는 값을 가지는 함수예요");

    return "전달받는값";
}
var myReturn = myFunc3();
console.log(myReturn);