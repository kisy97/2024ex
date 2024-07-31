// if문 결과값
var result1 = document.getElementById("result1");
// if...else문 결과값
var result2 = document.getElementById("result2");
// if...elseif문 결과값
var result3 = document.getElementById("result3");
// switch문 결과값
var result4 = document.getElementById("result4");
// for문 결과값
var result5 = document.getElementById("result5");
// for문 구구2단 결과값
var result6 = document.getElementById("result6");
// for문 구구단 전체 결과값
var result7 = document.getElementById("result7");
// while문 
var result8 = document.getElementById("result8");
// do~while문
var result9 = document.getElementById("result9");
// continue문
var result10 = document.getElementById("result10");
// break문
var result11 = document.getElementById("result11");

var resultStr;
//-----------------------------------------------
var num = 5;
if (num < 10) {
    // 조건의 값이 true일때 수행된다.
    result1.innerHTML = "num은 10보다 작아요";
}

//-----------------------------------------------
// var age = prompt("나이를 입력하세요", "숫자만 입력해주세요");
// if (age > 20 && age < 40) {
//     result2.innerHTML = "취업에 합격하셨습니다.";
// } else {
//     result2.innerHTML = "취업에 불합격하셨습니다."
// }
//삼항연산자일때
// (age > 20 && age < 40) ? "" : "";

//-----------------------------------------------
// if (age < 20) {
//     result3.innerHTML = "더 공부하고 오세요~";
// } else if (age > 40) {
//     result3.innerHTML = "취업에 불합격하셨습니다.";
// } else {
//     result3.innerHTML = "취업에 합격하셨습니다.";
// }

//-----------------------------------------------
var str1 = "학년을 입력하세요";
var str2 = "1학년:1, 2학년:2, 3학년:3, 기타4";
var classRoom = 1;
// classRoom = prompt(str1, str2);

switch (classRoom) {
    case "1": { result4.innerHTML = "2층으로 가세요"; }
        break;
    case "2": { result4.innerHTML = "3층으로 가세요"; }
        break;
    case "3": { result4.innerHTML = "4층으로 가세요"; }
        break;
    case "4": { result4.innerHTML = "5층으로 가세요"; }
        break;
    default: { result4.innerHTML = "1층 안내실로 가세요"; }
        break;
}

//-----------------------------------------------
resultStr = "";

// for(초기값; 종료감; 증감값) {수행문}
for (let i = 1; i <= 10; i++) {

    // resultStr  = resultStr +( i + ', ');
    resultStr += (i + ', ');

}
result5.innerHTML = resultStr += " end";

//-----------------------------------------------
resultStr = "";
var dan = 2;

for (let i = 1; i < 10; i++) {

    // 구구단결과값 += 2 * 1 = 2(연산값) <br>
    resultStr += dan + " * " + i + " = " + (dan * i) + "<br>";
}
result6.innerHTML = resultStr;

//-----------------------------------------------
resultStr = "";

// 2단 ~ 9단
for (let i = 2; i < 10; i++) {

    // 1 ~ 9까지 곱하기
    for (let j = 1; j < 10; j++) {

        // resultStr += 2 + " * " + 1 + " = " + (2*1) + "<br>";
        // resultStr += 2 + " * " + 2 + " = " + (2*2) + "<br>";
        resultStr += i + " * " + j + " = " + (i * j) + "<br>";
    }
}
result7.innerHTML = resultStr;

//-----------------------------------------------
var numWhile = 10;
resultStr = "";

// numWhile이 0보다 크거나 같으면 {수행}
while (numWhile >= 0) {
    // 조건에 맞을경우 수행
    resultStr += (numWhile + "<br>");

    // 반드시*** stop조건을 꼭 넣어줘야 한다.
    numWhile--;
}
result8.innerHTML = resultStr;

//-----------------------------------------------
resultStr = "";
var numDo = -10;

// do의 특징: 일단 먼저 한번 수행해요
do {
    // ~~
    resultStr += (numDo + "<br>") ;
    numDo--;

} while (numDo >= 0);
result9.innerHTML = resultStr;

//-----------------------------------------------
resultStr = "";
let numCnt;

for (numCnt = 1; numCnt <= 10; numCnt++) {
    
    // continue를 만나면, 이후*에 수행할 코드를 수행하지 않고*,
    // 제어을 위로 올려준다(흐름제어)
    if(numCnt == 3){
        continue;
    }
    resultStr += (numCnt + "<br>");
}
result10.innerHTML = resultStr;

//-----------------------------------------------
resultStr = "";
let numCnt2;

for (numCnt2 = 1; numCnt2 <= 10; numCnt2++) {
    
    // break를 만나면, 제어문을 완전히 빠져나간다.
    if(numCnt2 == 4){
        break;
    }
    resultStr += (numCnt2 + "<br>");
}
result11.innerHTML = resultStr;

