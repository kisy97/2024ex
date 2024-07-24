$(function () {
    $('header nav >ul').hover(function () {
            // over
            $(this).find('.submenu').stop().slideDown(1000);
            
        }, function () {
            // out
            $('.submenu').stop().slideUp(500);
        }
    );
});