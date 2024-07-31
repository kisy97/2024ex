
// 이창을 떠날지 묻고, true이면 새창을 띄워서 굿바이 인사한다.

// Boolean(true, false)

if (window.confirm("이 창을 닫을시겠습니다?")) {

    // 수행할 로직을 작성하는 부분
    window.open("exit.html", "mozillaWindow", "popup");

    // 참고~
    // window.open("https://www.mozilla.org/", "mozillaTab");
    // window.open("https://www.mozilla.org/", "mozillaWindow", "popup");

}