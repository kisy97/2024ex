// 메뉴 드롭다운
$('.menu').hover(function () {
        // over
        $(this).find('.submenu').stop().slideDown(500);
    }, function () {
        // out
        $('.submenu').stop().slideUp(500);

    }
);
// 이미지 슬라이드
let slide = $('.slide > img');
let idx = 0;
let end = slide.length - 1;
let timer = setInterval(autoslide,3000);

function autoslide() {
    $(slide[idx]).stop().animate({
        left: '100%'
    },1000,function () {
        $(this).css({left: '-100%'});
    });
    idx++;
    if(idx > end) idx = 0;
    $(slide[idx]).stop().animate({
        left: '0'
    },1000);
}

$(slide).hover(function () {
        // over
        clearInterval(timer);
    }, function () {
        // out
        timer = setInterval(autoslide,3000);
    }
);

$('.tabmenu li').click(function (e) { 
    let idx = $(this).index();

    $('.tabItem >*').hide().removeClass('on');
    $('.tabItem >*').eq(idx).show().addClass('on');

    $('.tabItem li').removeClass('on');
    $('.tabmenu li').removeClass('on');

    $(this).addClass('on');
    
});
