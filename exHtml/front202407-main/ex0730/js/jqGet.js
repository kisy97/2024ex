// text(): 태그안의 값을 text로 분석하여 가져오기
$("#btn1").click(function (e) {
    document.querySelector("#result").innerHTML 
    = $("#myTxt").text();
});
// html(): 태그안의 값을 html로 분석하여 가져오기
$("#btn2").click(function (e) { 
    document.querySelector("#result").innerHTML 
    = $("#myTxt").html();
    // alert($("#myTxt").html());
});
// val(): input박스안의 사용자 입력값을 가져오기
$("#btn3").click(function (e) { 
    document.querySelector("#result").innerHTML
     =$("#myVal").val();
    
});
// attr("style"): 속성에 설정된 값 가져오기
$("#btn4").click(function (e) { 
    document.querySelector("#result").innerHTML 
    = $("#result").attr("style");
});
// attr("style"): 스타일 속성에 새로운값 설정해주기
$("#btn5").click(function (e) { 
    $("#result").attr("style", "background-color: yellow; border: 1px solid red");
});
