function myAlert() {
    alert('나는 알림박스입니다.');
}
function myConfirm() {
    let result = confirm("확인해주세요");
    var re = document.getElementById('re');
    if (result) {
        re.innerHTML = '확인';
    } else {
        re.innerHTML = '취소';
    }
}
function myPrompt() {
    let reProm = document.getElementById('reProm');
    let resultProm = prompt('이름을 입력하세요');

    if(resultProm) {
        reProm.innerHTML = resultProm;
    } else {
        reProm.innerHTML = '올바른 값 아님';
    }
}