var demo = document.getElementById('demo');
demo.style.backgroundColor = 'yellow';

var wInnerWidth = window.innerWidth;
var wInnerHeight = window.innerHeight;

demo.innerHTML = `윈도우의 내부 너비: ${wInnerWidth}<br> 윈도우의 내부 높이: ${wInnerHeight}`;
