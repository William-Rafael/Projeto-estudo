package LabCap11;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ExercicioGravacao {

	public static void main(String[] args) throws FileNotFoundException {
		String texto = "";
		try {

			Scanner in = new Scanner(System.in);

			System.out.println("digite uma mensagem: ");
			texto = in.nextLine();
			PrintWriter writer = new PrintWriter("C:\\doc1.txt");
			writer.println(texto);
			writer.close();

		} catch (IOException e) {
			System.out.println("Falha ao gravar as informações digitadas!");
			e.printStackTrace();

		}

	}
}
