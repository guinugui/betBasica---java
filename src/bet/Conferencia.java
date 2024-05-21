package bet;

public abstract class Conferencia {

	public static void conferenciaAposta(Partida partida) {
		
		if(partida.getGolMandante() < partida.getGolVisitante()) {
			System.out.println("Resutado da Partida: Vitorida da equipe Visitante");
		}else if(partida.getGolMandante() > partida.getGolVisitante()) {
			System.out.println("Resutado da Partida: Vitorida da equipe Mandante");
		}else {
			System.out.println("Resutado da Partida: Empate !");
		}
		
	}
	
}
