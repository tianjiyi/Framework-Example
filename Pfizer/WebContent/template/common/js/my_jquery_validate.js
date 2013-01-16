$(document).ready(function() {
	$("#form1").validate({
		rules : {
			name : "required",// simple rule, converted to {required:true}
			email : {// compound rule
				required : true,
				email : true
			},
			url : {
				url : true
			},
			comment : {
				required : true
			},
			pid:{
				required : true
			},
			password: {
				required: true
			},
		},
		messages : {
			comment : "Please enter a comment."
		}
	});
});