var idYard = "";
var idYardRelation = "";
var message  = "";
$(document).ready(function(){
	$("#idYardTable").DataTable();
});
$(document).on("click", ".deleteYard", function() {
	console.log("Borrando patios.");
	event.preventDefault();
	$(this).closest("tr").remove();
	idYard = $(this).parents("tr").find("td:first").html();
	console.log("Id selected: " + idYard);
	deleteYard();
});

$(document).on("click", ".deleteYardRelation", function() {
	console.log("Borrando relacion terminal-patio");
	event.preventDefault();
	$(this).closest("tr").remove();
	idYardRelation = $(this).parents("tr").find("td:first").html();
	console.log("Id selected: " + idYardRelation);
	//delete relation
	deleteYardRelation()
});

function deleteYard(){
	 maintenance("DELETE");
}
function addYard(){
	 maintenance("INSERT");
}

function maintenance(type){
	var yardName = $("#idYard").val();
	if(type === "INSERT"){
		if(!validateName(yardName)){
			return;
		}
	}
	
	$.ajax({
		url: contextPath + "/yards/maintenance",
		data: { 
				name: yardName,
				identifier: idYard,
			 	operation: type
			  },
		beforeSend: function(){loaderModal("Enviando la solicitud.");},
		success: function(data){
			setModalStatus(data, true);
		},
		error: function(error, status){
			console.log("Error en la petición: "+error+"Estado: "+status);
		}
	});
}
function addYardsRelations(){
	var terminalId = $("#idSTerminalCombo").val();
	var yardId = $("#idYardCombo").val();
	if(!validateYardsRelation(terminalId, yardId)){
		openModalWarn(message);
		return;
	}
	$.ajax({
		url: contextPath + "/yards/saveYardRelations",
		data: {
			terminal: terminalId,
			yard: yardId
		},
		beforeSend: function(){loaderModal("Enviando la solicitud.");},
		success: function(data) {
			setModalStatus(data, true);
		},
		error: function(error, status){
			console.log("Error en la petición: "+error+"Estado: "+status);
		}
	});
}
function deleteYardRelation(){
	var terminalIdRelation = $("#idSTerminalCombo").val();
	console.log("Id Patio:" + idYardRelation);
	console.log("Id Terminal: " + terminalIdRelation);
	$.ajax({
		url: contextPath + "/yards/deleteYardRelations",
		data: {
			terminalId: terminalIdRelation,
			yardId: idYardRelation
		},
		beforeSend: function(){loaderModal("Enviando la solicitud.");},
		success: function(data){
			setModalStatus(data, true);
		},
		error: function(error, status){
			console.log("Error en la petición: "+error+"Estado: "+status);
		}	
	});
}
function loadRelationTable(){
	var yardRelationList = [];
	var terminal = $("#idSTerminalCombo").val();
	console.log("Terminal id: " + terminal);
	$.ajax({
		url: contextPath + "/yards/loadYardRelations",
		data: {
			terminalId: terminal
		},
		beforeSend: function(){loaderModal("Enviando la solicitud.");},
		success: function(data){
			console.log("Load table");
			$.each(data, function(index, item){
				yardRelationList.push("<tr>"+
										"<td class='cell-size'>"+item.id+"</td>"+
										"<td class='cell-size'>"+item.nombrePatio+"</td>"+
										"<td><button type='button' class='btn btn-danger deleteYardRelation'>X</button></td>"+
									"</tr>");
			});			
			$("#ibodyYardRelation").html(yardRelationList);
		},
		error: function(error, status){
			console.log("Error en la petición: "+error+"Estado: "+status);
		},
		complete: function(){
			$("#openModalLoader").css("display", "none");
		}
	});
}
function validateYardsRelation(terminal, yard){
	var ok = true;
	if(terminal === ""){
		ok = false;
		message += "Seleccionar terminal. \n";
	}
	if(yard === ""){
		ok = false;
		message += "Seleccionar Patio. \n";
	}
	return ok;
}
function validateName(name){
	var ok = true;
	if(name === ""){
		ok = false;
		openModalWarn("Ingresar el nombre.");
	}
	return ok;
}