package bet;

public class Aposta {

	private Cliente cliente;
	private Partida partida;
	
	
	public Aposta(Cliente cliente, Partida partida) {
		this.cliente = cliente;
		this.partida = partida;
	}
	
	public String resumoAposta() {
		return cliente.resumoCadastro()
		+ "\n"
		+ partida.resumoPartida();
	}
	
}
