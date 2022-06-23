package com.exemplo.io;

import java.io.FileReader;
import java.io.IOException;

public class ExemploIo {

	public static void main(String[] args) {
		// bloco try/catch
		try {
			FileReader doc;
			doc = new FileReader("C:\\Carta.txt");
		}catch(IOException e) {
			System.out.println("Não foi possivel abrir o arquivo.");
			e.printStackTrace();
	}

}
}