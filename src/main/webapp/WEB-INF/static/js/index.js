function confirmSaveNewCircle(){
	
	var isEmpty = document.forms["newCircleForm"]["name"].value;
	if(isEmpty==""){
		alert("Please put value for circle name!");
		return false;
	}else{
		var iscomfirmed = confirm("Are you sure to submit new circle?");
		if(iscomfirmed){
			return true;
		}else{
			return false;
		}
		
	}
	
			
}

function confirmDelete(){
	var iscomfirmed = confirm("Are you sure to delete this circle?");
	if(iscomfirmed){
		return true;
	}else{
		return false;
	}
			
}