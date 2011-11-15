$(document).bind("mobileinit", function(){
  $.mobile.page.prototype.options.backBtnText = "Volver";
  $.mobile.pushStateEnabled = false;
  
  alert("¡Hola Mundo!");
});