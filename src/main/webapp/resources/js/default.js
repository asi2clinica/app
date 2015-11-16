var editStuff = "";
function validarNumeros(e) { // 1
		tecla = (document.all) ? e.keyCode : e.which; // 2
		if (tecla==8) return true; // backspace
		//if (tecla==109) return true; // menos
    	if (tecla==190) return true; // punto
		//if (tecla==189) return true; // guion
		if (e.ctrlKey && tecla==86) { return true}; //Ctrl v
		if (e.ctrlKey && tecla==67) { return true}; //Ctrl c
		if (e.ctrlKey && tecla==88) { return true}; //Ctrl x
		if (tecla>=96 && tecla<=105) { return true;} //numpad
 
		patron = /[0-9]/; // patron
 
		te = String.fromCharCode(tecla); 
		return patron.test(te); // prueba
	}
$(function(){
	
		$('.action-trash').click(function(e)
		{
			var _url = $(this).attr("action");
			var _pk  = $(this).attr("pk");
			e.preventDefault();
			$("#cf").modal({ backdrop: 'static', keyboard: false })
			        .one('click', '#ok', function() 
			        {
						$.ajax({
							url:_url,
							dataType:'json',
							data:{
								pk:_pk
							},
							 statusCode: {
								404: function() {
										alert( "page not found" );
								}
							}
						}).done(function(data){
							$("#cf").modal('hide');
							if(data.ok=="no")
							{
								$("#error-msj").html(data.estado);
								$("#er").modal({ backdrop: 'static', keyboard: false });
							}else{
								location.reload(); 
							}
						});
			        });
		});	
	
/*
	$("form").submit(function(e){
		e.preventDefault();
		var _url = $(this).attr("action");
		var kyv  = $(this).serialize() ;
		$.ajax({
							url:_url,
							dataType:'json',
							data:kyv,
							statusCode: {
								404: function() {
										alert( "page not found" );
								}
							}
						}).done(function(data)
						{
							if(data.ok=="no")
							{
								$("#error-msj").html(data.estado);
								$("#er").modal({ backdrop: 'static', keyboard: false });
							}else{
								location.reload(); 
							}
						});
		return false;

	});	
	*/
	$(".table").DataTable({
		"info":     "",
		"language": {
			"zeroRecords": "No se encontraron registros",
			"info": "_PAGE_ of _PAGES_",
			"infoEmpty": "No se encontraron registros",
			"infoFiltered": "(_MAX_ total)",
			"decimal": ".",
			"thousands": ",",
			"search":"Buscar",
			"lengthMenu":"",
			"paginate":{
				"previous":"Anterior",
				"first":"Primero",
				"next":"Siguiente",
				"last":"Ultimo",
				"entries":"Registros"
			}
		}
	});
	
	$(".table tr").on('dblclick',function(e){
		var attr = $(this).attr('view');
		if(attr){
		
			window.location.href = attr;
		}
	});
});

