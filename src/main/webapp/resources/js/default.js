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

jQuery.extend(jQuery.validator.messages, {
			required: "El campo es requerido",
			remote: "Verifique la información",
			email: "El correo es invalido",
			url: "La url no es valida",
			date: "La fecha es invalida",
			dateISO: "La fecha no tiene el formato correcto",
			number: "El valor indicado no es númerico",
			digits: "Solo se permiten digitos",
			creditcard: "El número de targeta no es valido",
			equalTo: "",
			accept: "El dato no es correcto",
			maxlength: jQuery.validator.format("Solo se permiten {0} caracteres"),
			minlength: jQuery.validator.format("Por favor ingrese mas de {0} caracteres."),
			rangelength: jQuery.validator.format("Favor ingrese entre {0} y {1} caracteres"),
			range: jQuery.validator.format("Favor ingrese una valor entre {0} y {1}."),
			max: jQuery.validator.format("Favor ingrese un valor menor a {0}."),
			min: jQuery.validator.format("Favor ingrese un valor mayor a {0}.")
		});


$(function(){
		$('form').validate();
		
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




