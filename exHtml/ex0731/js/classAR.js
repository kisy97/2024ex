$('#btn1').click(function (e) { 
    e.preventDefault();
    $('h1, h2, p').addClass('blue');
});
$('#btn2').click(function (e) { 
    e.preventDefault();
    $('#divc').addClass('blue important');
});
$('#btn3').click(function (e) { 
    e.preventDefault();
    $('#divc').removeClass('blue');
});
$('#btn4').click(function (e) { 
    e.preventDefault();
    $('#h1c, #h2c, #pc').toggleClass('blue');
});


