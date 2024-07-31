$("button").click(function (e) {
    // $("p").hide();
    // $("p").hide("slow");
    // $("p").hide(3000);
    $("p").hide("slow",

        function () {
            // hide후에 alert를 띄우기 위해서
            alert("P태그가 사라졌습니다.");
        }
    );

});
// alert()가 우선순위를 가진다.
// $("button").click(function (e) {
//     $("p").hide("slow");

//     alert("이제 P태그가 사라지려고 합니다.");
// });