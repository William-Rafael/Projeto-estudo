package com.exemplo.exccustomizada;

public class InformarNotas {

	public static void main(String[] args) {
		// try/catch
		try {
			Nota nota = new Nota("Um nome", 12);
		}catch(NotaInvalidaException e) {
			System.err.println("Nota invalida = " + e.getMessage());
			e.printStackTrace();
		}

	}

}
