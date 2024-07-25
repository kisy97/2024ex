var demo = document.getElementById('demo');
var demo2 = document.getElementById('demo2');
var demo3 = document.getElementById('demo3');


demo.style.backgroundColor = 'yellow';
demo.style.fontSize = '1.5em';
demo2.style.backgroundColor = 'lightgreen';
demo2.style.fontSize = '1.5em';
demo3.style.backgroundColor = 'lightpink';
demo3.style.fontSize = '1.5em';



var screenInnerWidth = screen.width;
var screenInnerHeight = screen.height;
var screenAvalWidth = screen.availWidth;
var screenAvalHeight = screen.availHeight;
var screenColorDep = screen.colorDepth;
var screenPixelDep = screen.pixelDepth;


demo.innerHTML = `스크린의 내부너비: ${screenInnerWidth}<br>스크린의 내부높이: ${screenInnerHeight}`;

demo2.innerHTML = `스크린의 내부너비: ${screenAvalWidth}<br>스크린의 내부높이: ${screenAvalHeight}`;

demo3.innerHTML = `스크린 화면색상깊이: ${screenColorDep}<br>스크린의 픽셀깊이: ${screenPixelDep}`;
