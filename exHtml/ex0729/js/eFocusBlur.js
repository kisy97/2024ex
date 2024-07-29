$('input').focus(function (e) { 
    e.preventDefault();
    $(this).css('background-color','yellow');
});
$('input').blur(function (e) { 
    e.preventDefault();
    $(this).css('background-color','green');
});