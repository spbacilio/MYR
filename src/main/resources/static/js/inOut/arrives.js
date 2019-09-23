var resultFlag ="";
var message = "";
var containerType;
var containerFlag = true;
function getRadioButtonValue(){
	var radioValue = $("input[name='radioButtonContainers']:checked").val();
	console.log("Valor de radio button: " + radioValue);
	return radioValue;
}
function dataFormSave(){
    var dataObject = objectConverter();
	if(!validateDataForm(dataObject)){
        openModalWarn(message);
        return;
    }
    var json = JSON.stringify(dataObject);
    console.log("Datos capturados: " + json.toString());
    return json;
}
function objectConverter(){
    var formObject = {
        containerIdentifier : $("#idNumber").val(),
        containerName : $("#idPrefix").val(),
        ownerIdentifier : $("#idPropetary").val(),
        containerSize : $("#idContainerSize").val(),
        plaque : $("#idPlacas").val(),
        trailerType : $("#idRemolque").val(),
        year : $("#idYear").val(),
        machineryType : $("#idMachinary").val(),
        technology : $("#idTechnology").val(),
        gsSubType : $("#idSubtype").val(),
        condition : $("#idCondition").val(),
        origin : $("#idOrigin").val(),
        terminalId : $("#idSTerminalCombo").val(),
        operator : $("#idOperator").val()
    }
    containerType =  getRadioButtonValue(); 
    if (containerType === "DryCargo") {
    	console.log("OK es dry cargo");
    	formObject.technology = "NA";
    	formObject.gsSubType = "NA";
    	formObject.machineryType = "NA";
    	formObject.year = 0;
    	
    }   
    return formObject;
}
function saveContainer(){
	containerExistValidation();
	console.log("Container flag: " + containerFlag);
	if(containerFlag === false){
		openModalWarn(message);
		return;
	}
	var data = dataFormSave();
	$.ajax({
		url: contextPath + "/containers/saveContainer",
		beforeSend: function (){
			loaderModal("Enviando la solicitud.");
		},
		data: {
			container: data.toString()
		},
		success: function(data){
			setModalStatus(data, true);
		},
		error: function(error, status){ console.log("Error en la petición: "+error+"Estado: "+status); }
		
	});
}
function containerExistValidation(){
	var prefix = $("#idPrefix").val();
	var code = $("#idNumber").val();
	console.log("Prefijo: " + prefix);
	console.log("Codigo: " + code);
	if(!validateEmptyFields(prefix, code)){
		openModalWarn(message);
		return;
	}
	$.ajax({
		url: contextPath + "/containers/validation",
		data: {
			prefix: prefix,
			code: code,
			operation: "SELECT"
		},
		beforeSend: function(){
			loaderModal("Enviando la solicitud.");
		},
		success: function(data){
			console.log("Status: " + data.status);
			console.log("Id: " + data.integerResult);
			console.log("Mensaje: " + data.message);
			resultFlag = data.status;
			if(data.status === "WARN"){
				setModalStatus(data, false);
				containerFlag = false;
			}
			if(data.integerResult === 0){
				containerFlag = true;	
				$("#idCheckok").css("display", "flex");
			}
			
		},
		error: function(error, status){ console.log("Error en la petición: "+error+"Estado: "+status); },
		complete: function(){
			if(resultFlag != "WARN"){
				$("#openModalLoader").css("display", "none");				
			}
			if(resultFlag == "WARN"){
				$("#idCloseModal").css("display", "flex");
			}
		}
	});
}
function validateDataForm(arriveObject){
    message = "";
    var validationResult = true;
    if(arriveObject.containerIdentifier === ""){
        message += "Ingresar el prefijo. \n";
        validationResult = false;
    }
    if(arriveObject.containerName === ""){
        message += "Ingresar el nombre. \n";
        validationResult = false;
    }
    if(arriveObject.ownerIdentifier === ""){
        message += "Ingresar el dueño. \n";
        validationResult = false;
    }
    if(arriveObject.containerSize === ""){
        message += "Ingresar el tamaño. \n";
        validationResult = false;
    }
    if(arriveObject.plaque === ""){
        message += "Ingresar las placas. \n";
        validationResult = false;
    }
    if(arriveObject.trailerType === ""){
        message += "Ingresar el tipo de remolque. \n";
        validationResult = false;
    }
    if(arriveObject.year === ""){
        message += "Ingresar el año. \n";
        validationResult = false;
    }
    if(arriveObject.machineryType === ""){
        message += "Ingresar el tipo de maquinaria. \n";
        validationResult = false;
    }
    if(arriveObject.technology === ""){
        message += "Ingresar el tipo de tecnolog\xeda. \n";
        validationResult = false;
    }
    if(arriveObject.gsSubType === ""){
        message += "Ingresar el subtipo de GS. \n";
        validationResult = false;
    }
    if(arriveObject.condition ===""){
        message += "Ingresar la condici\xf3. \n";
        validationResult = false;
    }
    if(arriveObject.origin === ""){
        message += "Ingresar el origen";
        validationResult = false;
    }
    if(arriveObject.terminalId === "" ){
        message += "";
        validationResult = false;
    }
        operator : $("#idOperator").val()
    if(arriveObject.operator === ""){
        message += "";
        validationResult = false;
    }
    return validationResult;
}

function validateEmptyFields(prefix, code){
	var ok = true;
	message = "";
	if(prefix === ""){
		message += "Ingresar el prefijo. \n";
		ok = false;
	}
	if(code === ""){
		message += "Ingresar el c\xf3digo. \n";
		ok = false;
	}
	return ok;
}

