$("button").css("font-size", "20px");
$("p").css("background-color", "aquamarine");
$("ol").css("border", "1px solid blue");

$("#btn1").click(function (e) { 
    $("p").append("<b>추가</b>");
});
$("#btn2").click(function (e) { 
    $("ol").append("<li>추가리스트</li>");
});
$("#btn3").click(function (e) { 
    $("p").prepend("<b>삽입</b>");
});
$("#btn4").click(function (e) { 
    $("ol").prepend("<li>삽입리스트</li>");
});
// -----------------------
$("#btn5").click(function (e) { 
    $("img").before("<b>이전</b>");
});
$("#btn6").click(function (e) { 
    $("img").after("<i>이후</i>");
});
// -----------------------
$("#btn7").click(function (e) { 
    $("#remove").remove();
});
$("#btn8").click(function (e) { 
    $("#remove").empty();
});
$("#btn9").click(function (e) { 
    $("p").remove(".del1, .del3");
});