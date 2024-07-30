$('#btn1').click(function (e) { 
    document.querySelector('#result').innerHTML = $('#myTxt').text();    
});

$('#btn2').click(function (e) { 
    document.querySelector('#result').innerHTML = $('#myTxt').html();    
});

$('#btn3').click(function (e) { 
    document.querySelector('#result').innerHTML = $('#myval').val();    
});

$('#btn4').click(function (e) { 
    document.querySelector('#result').innerHTML = $('#result').attr('style');    
});

$('#btn5').click(function (e) { 
    $('#result').attr('style','bakcground-color: yellow; border: 1px solid #333');
});