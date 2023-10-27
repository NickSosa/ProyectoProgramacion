// Call the dataTables jQuery plugin
$(document).ready(function() {

	

});


async function registrarUsuarios() {
	let datos = {};
	datos.nombre = document.getElementById('txtNombre').value;
	datos.apellido = document.getElementById('txtApellido').value;
	datos.email = document.getElementById('txtEmail').value;
	datos.telefono = document.getElementById('txtTelefono').value;
	datos.password = document.getElementById('txtPassword').value;

	let repetirPassword = document.getElementById('txtRepetirPassword').value;

	if (repetirPassword != datos.password) {
		alert("Las contraseñas no coinciden");
		return;
	}
	alert("Se ha registrado exitosamente");
	window.location.href = 'login.html'

	const rawResponse = await fetch('api/usuarios', {
		method: 'POST',
		headers: {
			'Accept': 'application/json',
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(datos)
	});
	const content = await rawResponse.json();
	
//Cambiar el logo y las imagenes
	
}