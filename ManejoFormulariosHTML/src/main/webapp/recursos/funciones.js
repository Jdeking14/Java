function validarForma(forma) {
    var usuario = forma.usuario;
    if (usuario.value === "" || usuario.value === "Escribir usuario") {
        alert("Debe proporcionar un nombre de usuario lol");
        usuario.focus();
        usuario.select();
        return false;
    }

    var password = forma.password;
    if (password.value === "" || password.value.length < 3) {
        alert("Debe proporcionar un password de almenos 3 caracteres");
        password.focus();
        password.select();
        return false;
    }
    
    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false;
    for (var i in tecnologias) {
        if(tecnologias[i].checked){
            checkSeleccionado = true;
        }
    }
    
    if(!checkSeleccionado){
        alert("debe seleccionar alguna tecnologia");
        return false;
    }
    
    var generos = forma.genero;
    var radioSeleccionado = false;
    
    for (var i in generos) {
        if(generos[i].checked){
            radioSeleccionado = true;
        }
    }
    if(!radioSeleccionado){
        alert("debe seleccionar un genero");
        return false;
    }
    
    var ocupacion = forma.ocupacion;
    if(ocupacion.value === ""){
        alert("Debe seleccionar una ocupacion");
        return false;
    }
    
    alert("formulario valido");
    return true;
}