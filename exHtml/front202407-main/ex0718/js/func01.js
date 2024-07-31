var result01 = document.getElementById("func1");
var result02 = document.getElementById("func2");
var result03 = document.getElementById("func3");
// var result04 = document.getElementById("func4");
var result05 = document.getElementById("func5");
// 해보자 교재110page
var result06 = document.getElementById("func6");
// 해보자 교재111page
var result07 = document.getElementById("func7");

var result;

//--------------------  함수 선언 ----------------
function line() {

    // 특정기능을 반복 사용하기 위해서
    result01.innerHTML += "<p>" + "**********" + "<p>";
}
line();
line();
line();
line();

//--------------------  함수를 이용한 구구단 -------
var dan = 2;
// result = 0;

function multiply(ii) {
    // result02.innerHTML = result02.innerHTML + (dan * ii);
    result02.innerHTML += dan + " *----- " + ii + " = " + (dan * ii) + "<br>";
}
for (let i = 1; i < 5; i++) {
    multiply(i);
}

//--------------------  함수를 이용한 더하기 -------
function add(num01, num02) {

    // var hap = 2 + 3;
    var hap = num01 + num02;

    result03.innerHTML += hap + "<br>";
}

add(2, 3);
add(45, 3463);
add(123685, 45690);

//----------------  함수를 이용한 버튼 이벤트 처리 -------
function flower(flowerName) {

    switch (flowerName) {
        case "무궁화": alert("무궁화 동호회를 추천합니다!");
            break;
        case "장미": alert("장미 동호회를 추천합니다!");
            break;
        case "국화": alert("국화 동호회를 추천합니다!");
            break;
    }

}
// flower(flowerName)

//-------------------  함수 return -------
// 전역global
result = 0;
var first = 13;
var last = 7;

function all(a, b) {
    // 함수내의 지역
    var sam = a + b;

    return sam;
}

var result = all(first, last);
result05.innerHTML += "결과값: " + result;

//-------------------  함수 110page -------
// 스스로 해봅니다 ㅎ

//--------  함수 111page 교재틀렸어요_아래처럼 수정요함----

function love(){
    // var를 생략하고 사용하면 전역변수가 된다.
    str = "산";
    var strInner = "강";
    console.log("함수내에서 출력: ", str);
    console.log("함수밖에서 출력: ", strInner);
    
    return strInner;
}

// 첫번째 함수 기본콜
love();
console.log("--------");

// 두번째 함수 콜 + return
// return된 지역변수strInner값을 recStr에 담는다.
var recStr = love();
console.log("나는 return된 값: ", recStr);





