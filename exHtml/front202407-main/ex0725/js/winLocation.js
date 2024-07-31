// 변수 선언
var demo = document.getElementById("demo");
var demo2 = document.getElementById("demo2");
var demo3 = document.getElementById("demo3");
var demo4 = document.getElementById("demo4");
var demo5 = document.getElementById("demo5");
var locAssign = document.getElementById("locAssign");

// 속성 함수 정의
function funStyle(obj, c, f) {
    obj.style.backgroundColor = c;
    obj.style.fontSize = f;
}

// 속성 설정
funStyle(demo, "yellow", "1.5em");
funStyle(demo2, "lightgreen", "1.8em");
funStyle(demo3, "lightpink", "1.3em");
funStyle(demo4, "yellow", "1.8em");
funStyle(demo5, "lightgreen", "1.5em");
funStyle(locAssign, "lightpink", "2em");

// 값 정의
var locHref = window.location.href;
var locHostName = window.location.hostname;
var locPathName = window.location.pathname;
var locProtocol = window.location.protocol;
var locPort = window.location.port;

// 표현방법1
// demo.innerHTML = `${locHref}`;

// 표현방법2
function funInnerHtml(obj, loc) {
    obj.innerHTML = `${loc}`;
}
funInnerHtml(demo, locHref);
funInnerHtml(demo2, locHostName);
funInnerHtml(demo3, locPathName);
funInnerHtml(demo4, locProtocol);
funInnerHtml(demo5, locPort);

// 버튼 이벤트 구현
function newDoc() {
    const aUrl = "https://www.w3schools.com";
    window.location.assign(aUrl);
}
locAssign.onclick = newDoc;

