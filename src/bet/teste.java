package bet;

public class teste {

	public static void main(String[] args) {
		
		Cliente clienteTeste = new Cliente("Guilherme", "24/10/2002", 123);
		
		System.out.println(clienteTeste.resumoCadastro()); 
		
		Equipe equipe = new Equipe("Real");
		
		System.out.println(equipe.getNome());
		
		
		Partida partida = new Partida("20/03/2021", 2, 4, new Equipe("Real Madri"), new Equipe("Barcelona"));
		
		System.out.println(partida.resumoPartida());
		
	}

}
