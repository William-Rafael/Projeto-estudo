package Laboratorio1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Cap16_Lab2 {
	static final String PASTA_ORIGEM ="C:\\Users\\William Rafael\\Downloads\\CURSO IMPACTA JAVA\\Mp3";
	static final String PASTA_BACKUP ="C:\\Users\\William Rafael\\Downloads\\CURSO IMPACTA JAVA\\Backup";

	 public static void main(String[] args) {
	        Path origem = Paths.get(PASTA_ORIGEM);
	        Path backup = Paths.get(PASTA_BACKUP);

	        try {
	            if (!Files.exists(backup)) {
	                Files.createDirectory(backup);
	            }
	            Stream<Path> streamOrigem = Files.list(origem);

	            streamOrigem.forEach(p -> {
	                try {
	                    Files.copy(p, backup.resolve(p.getFileName()));
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            });
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}