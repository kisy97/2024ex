
function myFun() {
    alert('3초후 함수 실행');
  }

let interval = setInterval(myInterval,1000);
function myInterval() {
    const d = new Date();
    document.getElementById('dat').innerHTML = d.toLocaleTimeString();
  }