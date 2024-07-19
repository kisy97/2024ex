/* document.getElementById('btnTrue').onclick = function() {
    document.getElementById('v').style.display = 'block';
}
document.getElementById('btnFalse').onclick = function() {
    document.getElementById('v').style.display = 'none';
}
 */
$('button').click(function (e) { 
    $('p').hide();
    
});
$('#btnTrue').click(function (e) { 
    $('p').show();    
});