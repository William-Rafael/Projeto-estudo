package Laboratorio1;
import java.io.*;

public class Cap16_Lab1 {
	
	public static void escrever(String texto) {
		
		
		try {
			FileOutputStream arquivo = new FileOutputStream("Cap16_Lab1.txt");
			DataOutputStream dados = new DataOutputStream(arquivo);
			dados.writeChars(texto);
			
	}catch(IOException e){
		System.out.println(e.getMessage());
		
	}
	}
	public static void ler() {
		try {
			FileInputStream arquivo = new FileInputStream("Cap16_Lab1.txt");
			DataInputStream dados = new DataInputStream(arquivo);
			while (dados.available() > 0) {
                char c = dados.readChar();
                System.out.println(c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        escrever("Capitulo 16\nLaboratorio 1");
        ler();
    }
}
		
