// 버튼을 클릭했을때, 함수를 수행
//--- $("button").click();
$("#btn").click(
    // 익명함수
    function () {
        $("p").hide();
    }
);

// Javascript방식
/* document.getElementById("btn").onclick = function () {
    $("p").hide();
} */

