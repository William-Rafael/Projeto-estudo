package com.exemplo.arrayobjeto;

public class ChamandoUsuario {

	public static void main(String[] args) {
		// instanciando a classe Usuario()
		Usuario usuarioInfo = new Usuario("Marcelo");
		
		//definição do array
		Usuario novosUsuarios[] = {usuarioInfo, new Usuario("shazam"), new Usuario("Namor")};

		for(Usuario user : novosUsuarios) {
			System.out.println(user.getNome());
		}
	}

}
