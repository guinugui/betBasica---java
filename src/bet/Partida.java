package bet;

public class Partida {

	private String data;
	private int golMandante;
	private int golVisitante;
	
	private Equipe mandante;
	private Equipe visitante;
	
	public Partida(String data, int golMandante, int golVisitante, Equipe mandante, Equipe visitante) {
		this.data = data;
		this.golMandante = golMandante;
		this.golVisitante = golVisitante;
		this.mandante = mandante;
		this.visitante = visitante;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getGolMandante() {
		return golMandante;
	}

	public void setGolMandante(int golMandante) {
		this.golMandante = golMandante;
	}

	public int getGolVisitante() {
		return golVisitante;
	}

	public void setGolVisitante(int golVisitante) {
		this.golVisitante = golVisitante;
	}

	public Equipe getMandante() {
		return mandante;
	}

	public void setMandante(Equipe mandante) {
		this.mandante = mandante;
	}

	public Equipe getVisitante() {
		return visitante;
	}

	public void setVisitante(Equipe visitante) {
		this.visitante = visitante;
	}
	
	public String resumoPartida() {
		return data +
				" " +
		golMandante +
		 " " +
		golVisitante +
		" " +
		mandante.getNome() +
		" " +
		visitante.getNome();
	}
	
	
}
