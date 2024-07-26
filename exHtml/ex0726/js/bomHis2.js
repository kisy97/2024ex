var btn = document.getElementsByClassName('btn');
btn.style.fontSize = '1.6em'


function goBack() {
    window.history.back();
}
function goForward() {
    window.history.forward();
}

function enCookie() {
    let output = document.getElementById('output');
    document.getElementById('output').style.fontSize = '30px';
    let navA = navigator.cookieEnabled;
    let navB = navigator.appCodeName;
    let navC = navigator.platform;
    let navD = navigator.appVersion;
    let navE = navigator.userAgent;

    output.innerHTML = `A: ${navA} <br> B: ${navB} <br> C: ${navC} <br> D: ${navD} <br> E: ${navE} <br>`

}