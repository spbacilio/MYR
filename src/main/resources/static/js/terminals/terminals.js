var idTerminal ="";
var message = "";
$(document).ready(function(){
	$("#idTerminalTable").DataTable();
});

$(document).on("click", ".deleteTerminal", function(){
	console.log("Borrando terminal");
	event.preventDefault();
	$(this).closest("tr").remove();
	idTerminal = $(this).parents("tr").find("td:first").html(); 
	console.log("Id selected: " + idTerminal);
	deleteTerminal();
});

function deleteTerminal(){
	console.log("Delete terminal");
	 terminalMaintenance("DELETE");
}

function addTerminal(){
	terminalMaintenance("INSERT");
}
function terminalMaintenance(type){
	var terminalName = $("#idAddTerminal").val();
	var terminalCode = $("#idAddCode").val();
	if(type === "INSERT"){
		if(!validateTerminalFields(terminalName, terminalCode)){
			openModalWarn(message);
			return;
		}
	}
	$.ajax({
		url: contextPath + "/terminals/maintenance",
		data: {
			name: terminalName,
			code: terminalCode,
			operation: type,
			id: idTerminal			
		},
		beforeSend: function(){ loaderModal("Enviando la solicitud."); },
		success: function(data){
			setModalStatus(data, true);
		},
		error: function(error, status){
			console.log("Error en la petición: "+error+"Estado: "+status);
		}
	});
	
}

function validateTerminalFields(terminalName, terminalCode){
	message = "";
	var ok = true;
	if (terminalName === ""){
		ok = false;
		message += "Ingresar el nombre.\n";
	}
	if (terminalCode === ""){
		ok = false;
		message += "\nIngresar el c\xf3digo.\n";
	}
	return ok;
}