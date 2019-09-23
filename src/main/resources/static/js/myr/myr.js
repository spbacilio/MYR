var contador = 0;
//var contadorD = 0;
var componentList = [];
var damageAsosiateList = [];
var locationDamage = [];
var message = "";
function deleteImage(){
	var activo = $(".active").attr("id");
	var idDivActive = activo.slice(4,5);
	$("#frame" + idDivActive).empty();
	$("#frame1").empty();
	console.log("Current slide: " + idDivActive);
}
function getID(){
	console.log("currenet id");
}
function validateMyrContainer(){
	var name = $("#idPrefixMyr").val();
	var codeN = $("#idNumberMyr").val();
	console.log("Name: " + name);
	console.log("Code: " + codeN);
	
	$.ajax({
		url: contextPath + "/myr/searchContainer",
		data: {
			prefix: name,
			code: codeN
		},
		beforeSend: function(){
			loaderModal("Enviando la solicitud.");
		},
		success: function(data){
			console.log("Status: " + data.status);
			console.log("Id: " + data.integerResult);
			console.log("Mensaje: " + data.message);
			setModalStatus(data, false);
			if(data.status != "WARN"){
				setDataMYR(data.containerHistory)
			}
		},
		error: function(error, status){ console.log("Error en la petición: "+error+"Estado: "+status); }
	});
}

function setDataMYR(data){
	console.log("Fecha: " + data.timeCompleted);
	$("#idEquipmentMyr").val(data.associate);
	$("#userLogged").val(data.userImexId);//USUARIO LOGGEADO
	$("#LastUserLogged").val(data.userImexId);
	$("#LastEventDate").val(data.dateCompleted.slice(0,10));
	$("#LastDateTime").val(data.timeCompleted);
	$("#LastEvent").val(data.tipoInspeccion);
	$("#idTerminalMyr").val(data.terminalName);
	$("#sizeMyr").val(data.tamaniosclv);
	$("#docPrev").val(data.tipoEIR);
	$("#damageSummary").val(data.daniosDescripcion);	
	$("#idconsignee").val(data.tipoEirId);//REvisar este valor
}

function openModalJ2(){
	if (!validateForm()) {
		openModalWarn(message);
		return;
	}
	var containerName = $("#idPrefixMyr").val();
	var containerCode = $("#idNumberMyr").val();
	var fullName = containerName + "-" + containerCode.slice(0,6) + "-" + containerCode.slice(6,7);
	$("#modalCreateOrderEvent").modal("show");
	$("#myModalLabel").text(fullName);
}

function closeModalJ2() {
	$("#myModalLabel").text();
	$("#generalSection").val("");
	$("#eirComponents").empty();	
	$("#eirDamage").empty();	
	$("#idDamageLocation").empty();	
	$("#reasonDamageId").val("");	
	$("#eirComponents").append(new Option("Seleccionar", ""));
	$("#eirDamage").append(new Option("Seleccionar", ""));
	$("#idDamageLocation").append(new Option("Seleccionar", ""));
	$("#modalCreateOrderEvent").modal("hide");
}

//Fill eir components
function getEIRComponents() {
	var sectionId = $("#generalSection").val();
	console.log("Damage id: " + sectionId);
	$.ajax({
		url: contextPath + "/myr/eirComponents",
		data: { sectionIdentifier: sectionId },
		beforeSend: function(){
			$("#eirComponents").empty();
			$("#eirDamage").empty();
		},
		success: function(data){
			var components = data[0];
			var damages = data[1]
			componentList = components;
			damageAsosiateList = damages;
			fillEIRComponents(components);
			fillEIRDamage(damages);
		},
		error: function(error, status){ console.log("Error en la petición: "+error+"Estado: "+status); }		
	});
}

function fillEIRComponents(component){
	if(component.length > 0){
		$("#eirComponents").append(new Option("Seleccionar", ""));
		component.forEach(function(item, index){
			$("#eirComponents").append(new Option(item.component, item.eirComponentIdentifier));
		});	
	}
	else {
		$("#eirComponents").append(new Option("", "No disponible"));
	}
}

function fillEIRDamage(damages){
	if(damages.length > 0){
		$("#eirDamage").append(new Option("Seleccionar", ""));
		damages.forEach(function(item, index){
			$("#eirDamage").append(new Option(item.damageDescription, item.eirDamageIdentifier));
		});	
	}
	else {
		$("#eirDamage").append(new Option("", "No disponible"));
	}
}
function getDamageLocations(){
	var section =  $("#generalSection").val();
	var component = $("#eirComponents").val();
	$.ajax({
		url: contextPath + "/myr/damageLocations",
		data: {
			sectionIdentifier:  section,
			componentIdentifier: component
		},
		beforeSend: function(){
			$("#idDamageLocation").empty();
		},
		success: function(data){
			locationDamage = data;
			if(data.length > 0){
				$("#idDamageLocation").append(new Option("Seleccionar", ""));
				data.forEach(function(item, index){
					$("#idDamageLocation").append(new Option(item.damagelocation, item.damagelocation));
				});	
			}
			else {
				$("#idDamageLocation").append(new Option("", "No disponible"));
			}
		},
		error: function(error, status){ console.log("Error en la petición: "+error+"Estado: "+status); }
	});
}

function setAARCodeDamage(){
	var component = $("#eirComponents").val();
	var damage= $("#eirDamage").val();
	var location= $("#idDamageLocation").val();
	
	console.log("Component: " + component);
	console.log("damage: " + damage);
	console.log("location: " + location);
	
	componentList.forEach(function(item, index){
		if (item.eirComponentIdentifier == component) {
			console.log("component: -> " + item.aarCode);
		}		
	}); 
	damageAsosiateList.forEach(function(item, index){
		if (item.eirDamageIdentifier == damage) {
			console.log("damage: -> " + item.aarCode);
		}		
	}); 
	locationDamage.forEach(function(item, index){
		if (item.damagelocation == location){
			console.log("location: -> " + item.aarCode);
		}		
	}); 
	
}

function validateForm(){
	var containerName = $("#idPrefixMyr").val();
	var containerCode = $("#idNumberMyr").val();
	var ok = true;
	if(containerName === ""){
		message += "Falta el nombre del contenedor.";
		ok = false;
	}
	if(containerCode === ""){
		message += "Falta el c\xf3digo del contenedor.";
		ok = false;
	}
	return ok;
}












