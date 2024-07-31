//----- H2 꾸미기 -----
var h2 = document.querySelectorAll("h2");
for(let i=0; i<h2.length; i++){
    h2[i].style.color = "orange";
}
//----- INPUT버튼 꾸미기 -----
var btn = document.querySelectorAll("input");
// i= 0~3
for(let i=0; i<btn.length; i++){
    btn[i].style.backgroundColor = "lightblue";
    btn[i].style.fontSize = "1.6em";
}
//----------------------------

function goHistory2(){
    location.assign("./bomHistory2.html");
}
function goBack() {
    window.history.back();
}
function goForward() {
    window.history.forward();
}

function enCookie(){
    let output = document.getElementById("output");
    output.style.fontSize = "30px";
    let naviA = navigator.cookieEnabled;
    let naviB = navigator.appCodeName;
    let naviC = navigator.platform;
    let naviD = navigator.appVersion;
    let naviE = navigator.userAgent;

    output.innerHTML 
    = `A:${naviA}<br>  B:${naviB}<br>  C:${naviC}<br>  D:${naviD}<br>  E:${naviE}`;
}