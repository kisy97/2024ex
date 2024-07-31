$("header .nav>ul").hover(function () {
    // over
    $(".subMenu, .navBg").stop().slideDown(800);;
}, function () {
    // out
    $(".subMenu, .navBg").stop().slideUp(300);
}
);