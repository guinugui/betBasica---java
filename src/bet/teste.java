package bet;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {

		Cliente clienteTeste = new Cliente("Guilherme", "24/10/2002", 123);

		System.out.println(clienteTeste.resumoCadastro());

		Equipe equipe = new Equipe("Real");

		System.out.println(equipe.getNome());

		Partida partida = new Partida("20/03/2021", 2, 4, new Equipe("Real Madri"), new Equipe("Barcelona"));

		Partida partida2 = new Partida("20/03/2021", 6, 2, new Equipe("Goias"), new Equipe("Vila Nova"));
		
		Partida partida3 = new Partida("20/03/2021", 7, 1, new Equipe("Alemanha"), new Equipe("Brasil"));
	
		Aposta aposta = new Aposta(clienteTeste, partida);
		Aposta aposta2 = new Aposta(clienteTeste, partida2);
		Aposta aposta3 = new Aposta(clienteTeste, partida3);
		
		
		System.out.println(aposta.resumoAposta());
		Conferencia.conferenciaAposta(partida);
		
		System.out.println(aposta2.resumoAposta());
		Conferencia.conferenciaAposta(partida2);
		
		System.out.println(aposta3.resumoAposta());
		Conferencia.conferenciaAposta(partida3);
		
		
		
		

	}

}
