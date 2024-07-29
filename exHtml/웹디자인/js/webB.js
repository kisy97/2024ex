var slide = $('.slideContent>img');
var sno = 0;
var eno = slide.length - 1;

var timer = setInterval('autoslide()', 3000);

function autoslide() {
    $(slide[sno]).stop().animate({
        left: '100%'
    }, 1000, function () {
        $(this).css({ left: "-100%" });
    });
    sno++;
    if (sno > eno) {
        sno = 0;
    }
    $(slide[sno]).stop().animate({
        left: '0'
    }, 1000)

}

$('.slideContent').hover(function () {
    // over
    clearInterval(timer);
}, function () {
    // out
    timer = setInterval('autoslide()', 3000);
}
);

$('.tabMenu li').click(function () {
    var idx = $(this).index()

    $('.tabItem >*').hide().removeClass('on');
    $('.tabItem >*').eq(idx).show().addClass('on');

    $('.tabMenu li').removeClass('on');
    $('.tabItem li').removeClass('on');
    $(this).addClass('on');

});
// 탭메뉴
function openPop() {
    $('.contentpop').show();
}

function closePop() {
    $('.contentpop').hide();
}
// 메뉴바
$(function () {
    $('header .nav>ul>li').hover(function () {
            // over
            $(this).find('.submenu').stop().slideDown();
        }, function () {
            // out
            $('.submenu').stop().slideUp();
        }
    );
  });