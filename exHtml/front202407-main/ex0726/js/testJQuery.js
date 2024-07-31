$("button").click(function (e) { 
    $("p").hide();
});
$("#delDiv").click(function (e) { 
   $("#del").hide();
});
$("#delDiv2").click(function (e) { 
    $(".del").hide();
});
$("#dbclick").dblclick(function (e) { 
    $(this).hide();
});

$("#enter").mouseenter(function () { 
    $(this).text("나에게 오버했습니다.");
});
$("#enter").mouseleave(function () { 
    $(this).text("나에게서 벗어났습니다.");
});
$("#enter").mousedown(function () { 
    $(this).text("나에게 mousedown()");
});
$("#enter").mouseup(function () { 
    $(this).text("나에게 UpUpUP()");
});

$("#hover").hover(function () {
        // over
        $(this).text("마우스 OVER오버");
        
    }, function () {
        // out
        $(this).text("마우스 오버OUT ~ 빠이~");
    }
);
 