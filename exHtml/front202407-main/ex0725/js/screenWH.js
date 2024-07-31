// 변수 선언
var demo = document.getElementById("demo");
var demo2 = document.getElementById("demo2");
var demo3 = document.getElementById("demo3");
// 속성 정의
demo.style.backgroundColor = "yellow";
demo.style.fontSize = "1.5em";
demo2.style.backgroundColor = "lightgreen";
demo2.style.fontSize = "1.5em";
demo3.style.backgroundColor = "lightpink";
demo3.style.fontSize = "1.5em";
// 값 정의
var screenWidth = screen.width;
var screenHeight = screen.height;
var screenAvalWidth = screen.availWidth;
var screenAvalHeight = screen.availHeight;
var screenColorDep = screen.colorDepth;
var screenPixelDep = screen.pixelDepth;

// 표현
demo.innerHTML
    = `스크린의 넓이: ${screenWidth}<br> 
        스크린의 높이: ${screenHeight}`;

demo2.innerHTML
= `스크린의 넓이: ${screenAvalWidth}<br> 
    스크린의 높이: ${screenAvalHeight}`;

demo3.innerHTML
= `스크린의 화면색상깊이: ${screenColorDep}<br> 
    스크린의 화면픽셀깊이: ${screenPixelDep}`;