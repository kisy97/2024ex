let slide = $('.slideContent > img');
let sno = 0;
let eno = slide.length - 1;
let timer = setInterval('autoslide()', 3000);

function autoslide() {
    $(slide[sno]).stop().animate({
        opacity: 0
    }, 1000);
    sno++;
    if (sno > eno) sno = 0;
    $(slide[sno]).stop().animate({
        opacity: 1
    }, 1000);
}

$('.slideContent').hover(function () {
    // over
    clearInterval(timer);
}, function () {
    // out
    timer = setInterval('autoslide()', 3000);
}
);

// slide

$(function () {
    $('.menu').hover(function () {
        // over
        $(this).find('.submenu').stop().fadeIn();
    }, function () {
        // out
        $('.submenu').stop().fadeOut();

    }
    );
});

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