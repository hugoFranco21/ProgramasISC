/*Javascript file for lab 8 */

function required(idcamp,message)
{
	camp = document.getElementById(idcamp);
	if(camp.value == '0' || camp.value == '')
	{
		alert(message);
		return false;
	}
	else	
		return true;
}

function validateUser()
{
	if(document.activeElement.name=='cancel'){
		return true;
	} else{
	return required('nick', 'The Nickname must be entered!') &&
	required('pass', 'The Password must be entered!');
	}
}
