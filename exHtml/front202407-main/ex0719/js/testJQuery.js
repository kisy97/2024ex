// // javascript를 사용한 이벤트
/* document.getElementById("btnTrue").onclick = function () {
    document.getElementById("v").style.display = "block";
}
document.getElementById("btnFalse").onclick = function () {
    document.getElementById("v").style.display = "none";
} */

// jQuery를 사용한 이벤트
$("button").click(function (e) {
    $("p").hide();

});
$("#btnTrue").click(function (e) {
    $("p").show();

});





