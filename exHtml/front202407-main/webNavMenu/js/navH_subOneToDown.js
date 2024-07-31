$(".menu").hover(function () {
    // over
    $(this).find(".subMenu").stop().slideDown(800);;
}, function () {
    // out
    $(".subMenu").stop().slideUp(300);
}
);