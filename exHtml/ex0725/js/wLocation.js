
// 변수 선언
// html
var demo = document.getElementById('demo');
var demo2 = document.getElementById('demo2');
var demo3 = document.getElementById('demo3');
var demo4 = document.getElementById('demo4');
var demo5 = document.getElementById('demo5');
var locAssign = document.getElementById('locAssign');
// 단축
var wl = window.location;
// 출력값
var loHref = wl.href;
var loHost = wl.hostname;
var loPath = wl.pathname;
var loProtocol = wl.protocol;
var loPort = wl.port;


// 스타일 
funStyle(demo, 'yellow', '1.5em');
funStyle(demo2, 'lightgreen', '1.5em');
funStyle(demo3, 'yellow', '1.5em');
funStyle(demo4, 'lightgreen', '1.5em');
funStyle(demo5, 'yellow', '1.5em');
funStyle(locAssign, 'lightgreen', '2em')


// 출력
funInner(demo, loHref);
funInner(demo2, loHost);
funInner(demo3, loPath);
funInner(demo4, loProtocol);
funInner(demo5, loPort);

// 버튼지정
locAssign.onclick = newDoc;



// 스타일 함수 선언
function funStyle(obj, c, f) {
    obj.style.backgroundColor = c;
    obj.style.fontSize = f;

}
// 출력 함수 선언
function funInner(obj, value) {
    obj.innerHTML = value;
}
// 버튼 함수 선언
function newDoc() {
    const aUrl = 'https://www.w3schools.com/';
    window.location.assign(aUrl);
}


