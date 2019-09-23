const contextPath = "/myr";
var reload;
$(document).ready(function(){
	$("#openModalLoader").css("display", "none");
	$("#openModalLoaderWarn").css("display", "none");
	$("#idCheck").css("display", "none");
	$("#idError").css("display", "none");
	$("#idWarn").css("display", "none");
	
	$("#idInventoryTable").DataTable();
});

function loaderModal(title){
	$("#openModalLoader").css("display", "flex");
	$("#idCloseModal").css("display", "none");
	$("#modalTitle").text(title);
}

function closeModal(){
	$("#openModalLoader").css("display", "none");
	console.log("Close modal: " + reload);
	if(reload){
	
		location.reload(true);
	}
	$("#idCheck").css("display", "none");
	$("#idError").css("display", "none");
	$("#idWarn").css("display", "none");
}

function openModalWarn(message) {
	$("#openModalLoaderWarn").css("display", "flex");
	$("#modalTitleWarn").text("Atenci\xf3n.!!");
	$("#IdexceptionWarn").text(message);
}

function closeModalWarn() {
	console.log("Closing warn modal");
	$("#openModalLoaderWarn").css("display", "none");
}

function setModalStatus(data, flag){
	$("#openModalLoader").css("display", "flex");
	$("#idCloseModal").css("display", "flex");
	$("#idAjaxLoader").css("display", "none");
	$("#modalTitle").text(data.message);
	$("#Idexception").text(data.exception);
	switch(data.status){
	case "SUCCESS":
		console.log("Success !!");
		$("#idCheck").css("display", "flex");
		$("#idError").css("display", "none");
		$("#idWarn").css("display", "none");
		$("#idCloseModal").removeClass("btn-danger");
		$("#idCloseModal").removeClass("btn-warning");
		$("#idCloseModal").addClass("btn-success");
		break;
	case "ERROR":
		console.log("Error !!");
		$("#idCheck").css("display", "none");
		$("#idWarn").css("display", "none");
		$("#idError").css("display", "flex");
		$("#idCloseModal").removeClass("btn-success");
		$("#idCloseModal").removeClass("btn-warning");
		$("#idCloseModal").addClass("btn-danger");
		break;
	case "WARN":
		console.log("Warn !!");
		$("#idCheck").css("display", "none");
		$("#idError").css("display", "none");
		$("#idWarn").css("display", "flex");
		$("#idCloseModal").removeClass("btn-success");
		$("#idCloseModal").removeClass("btn-danger");
		$("#idCloseModal").addClass("btn-warning");
		break;
	default: break;	
	}
	$("#idCloseModal").css("display", "flex");
	reload = flag;
}