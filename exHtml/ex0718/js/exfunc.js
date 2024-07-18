function myfunc1(){
    console.log('나는 기본 함수입니다.');
}
myfunc1();


function myfunc2(myParm) {
    console.log(myParm);
}
myfunc2('파라미터 값');


function myfunc3() {
    console.log('난 값을 보내는 함수 입니다.');
    return '전달하는값';
}
var myReturn = myfunc3();


console.log(myReturn);