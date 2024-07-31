$(".menu").hover(function () {
    // over
    $(this).find(".subMenu").stop().fadeIn()

}, function () {
    // out
    $(".subMenu").stop().fadeOut()
}
);