 $(document).ready(function () {
    	   $("#password, #passwordConfirm").keyup(verifyConfirmPassword);
    	});
 
 
 function verifyConfirmPassword() {
    
	var orignalPass = $("#password").val();
    var confirmPass = $("#passwordConfirm").val();

    if (orignalPass != confirmPass){
        $("#verifyPassMsg").html("Your Passwords Do NOT Match");
        $('#registerSubmitButton').prop('disabled', true);
    }
    
    else if()
    else
    	{
        $("#verifyPassMsg").html("Passwords Match");
    	$('#registerSubmitButton').prop('disabled', false);
 		}
}
 
 $(document).ready(function() {
 $("#password, #passwordConfirm").keyup(function() {
	 
	 var password = $(this).val();	 
	
	 
	 	if (password.match(/[a-z]/)) {
		   $('#smallCase').removeClass('notAllowedPassRules').addClass('allowedPassRules');
		} 
	 	else {
		     $('#smallCase').removeClass('allowedPassRules').addClass('notAllowedPassRules');
		}

		
		if (password.match(/[A-Z]/)) {
		   $('#capsCase').removeClass('notAllowedPassRules').addClass('allowedPassRules');
		}
		else {
		     $('#capsCase').removeClass('allowedPassRules').addClass('notAllowedPassRules');
		}

		
		if (password.match(/\d/)) {
		   $('#numberCase').removeClass('notAllowedPassRules').addClass('allowedPassRules');
		} 
		else {
		     $('#numberCase').removeClass('allowedPassRules').addClass('notAllowedPassRules');
		}
		
		
		if (password.match(/[-!@#$%^&*()_+|~=`{}\[\]:";'<>?,.\/]/)) {
			$('#specialCase').removeClass('notAllowedPassRules').addClass('allowedPassRules');
		} 
		 else {
			  $('#specialCase').removeClass('allowedPassRules').addClass('notAllowedPassRules');
		}
		
		
		 if (password.length<8) {
			$('#lengthCase').removeClass('allowedPassRules').addClass('notAllowedPassRules');
		} 
		 else {
			  $('#lengthCase').removeClass('notAllowedPassRules').addClass('allowedPassRules');
		}
		 
		
	    
	}).focus(function() {
	    $('#passwordRules').show();
	    
	}).blur(function() {
	    $('#passwordRules').hide();
	    
	});
 });