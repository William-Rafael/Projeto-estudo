package com.exemplo.lindamente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ExemploStream {

	public static void main(String[] args) {
		//praticar a instancia de nossa classe e referencia da interface necessaria
		List<Colaborador> listaColab = new ArrayList<>();
		
		// inserindo dados
		listaColab.add(new Colaborador(2005, "Manuel da Silva", "Developer", 3580.0));
		listaColab.add(new Colaborador(3018, "Joaquim Batista", "Developer", 5580.0));
		listaColab.add(new Colaborador(1045, "Maria das Dores", "Analista", 6250.0));
		listaColab.add(new Colaborador(1780, "João Ricardo", "Developer", 7100.0));
		listaColab.add(new Colaborador(5200, "Ana Maria", "Vendedor", 4100.0));
		listaColab.add(new Colaborador(3420, "André de Souza", "Developer", 5890.0));
		listaColab.add(new Colaborador(3999, "Bartolomeu Dias", "Analista", 3100.0));
		listaColab.add(new Colaborador(1920, "Rubens da Gama", "Coodernador", 12300.0));
		listaColab.add(new Colaborador(2389, "Cristovão Colombo", "Navegador", 33200.0));
		listaColab.add(new Colaborador(1500, "Pedro Alvares Cabral", "Explorador", 1580.0));
	
		/* (descomentar para habilitar a manipulacao dos cargos com os jogadores)
	//usar o stream para gerar um elemento diferente
		Stream<Colaborador> streamColab = listaColab.stream();
		Stream<JogadorDeFutebol> streamJogador = streamColab.map(j -> new JogadorDeFutebol(
				j.getNome(),
				j.getSalario() > 6000 ? "Atacante" : "Zagueiro"
				));
		streamJogador.forEach(System.out::println);
		//uso do stream para executador algumas manipulacoes sucessivas
		listaColab.stream()
			.filter(f -> f.getCargo().equals("Developer"))
			.filter(f -> f.getSalario() > 5000)
			.forEach(System.out::println);
		
		
	//	.sorted((f1, f2) -> f1.getNome().compareTo(f2.getNome()))
	//	.forEach(a -> System.out.println(a.toString()));
		
		
		// .sorted(Comparator.comparing(Funcionario::getSalario)
		//						.reversed())
	//	.skip(3)
	//	.forEach(System.out::println);
		
		
	//	.filter(f -> "Developer".equals(f.getCargo()))
	//	.sorted((f1, f2) -> f1.getNome().compareTo(f2.getNome()))
	//	.sorted(Comparator.comparing(Colaborador::getNome))
	//	.skip(1)
		
		
	//	.limit(2)
	//	.forEach(System.out::println);
	//	.forEach(x -> System.out.println(x.getNome()));
	//	.forEach(nominho -> System.out.println(nominho.getNome())); */
		
	/*	Stream<Colaborador> streamColab = listaColab.stream();  // (mostrar Cargos)
		Stream<String> streamCargo = streamColab.map(Colaborador::getCargo);
		
		streamCargo.forEach(System.out::println);*/
	
		/* (tira cargos duplicados)
		listaColab.stream()
		.map(Colaborador::getCargo)
		.distinct()
		.forEach(System.out::println); */
		
	/*	System.out.println(           //contagem de frequencia
				listaColab.stream()
					.filter(f -> f.getSalario() > 5000)
					.count()
					); */
		
		Colaborador minColab = 
				listaColab.stream()
				.min(Comparator.comparing(Colaborador::getMatricula))
				.get();
		
		Colaborador maxColab = 
				listaColab.stream()
				.min(Comparator.comparing(Colaborador::getMatricula))
				.get();
		//exibindo os valores
		System.out.println("Colaborador com o menor numero de matricula: " + minColab);
		System.out.println("Colaborador com o maior numero de matricula: " + maxColab);

		
	}

}
