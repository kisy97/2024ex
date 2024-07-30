$('#btn1').click(function (e) { 
    $('p').append('<b>Appended text</b>');    
});

$('#btn2').click(function (e) { 
    $('ol').append('<li>Appended item</li>');
});
$('#btn3').click(function (e) { 
    $('p').prepend('<b>Prepended item</b>');
});
$('#btn4').click(function (e) { 
    $('ol').prepend('<li>Prepended item</li>');
});
$('#btn5').click(function (e) { 
    $('img').before('<b>이전</b>');
});
$('#btn6').click(function (e) { 
    $('ol').prepend('<li>Prepended item</li>');
});