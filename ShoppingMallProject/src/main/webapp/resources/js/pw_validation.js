function passwordValidation() {
	var pass1 = document.getElementById("pass").value;
	var pass2 = document.getElementById("c_pass").value;

	var ok = true;

	if (pass1 != pass2) {
		document.getElementById("msg").textContent = "Password doesn't match the confirm password";
		ok = false;
	}
	return ok;
}