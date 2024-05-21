package bet;

public class Cliente {

	private String nome;
	private String dataNascimento;
	private int numero;
	

	public Cliente(String nome, String dataNascimento, int numero) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String resumoCadastro() {
		return nome +
				" " +
				dataNascimento +
				" " + 
				numero;
	}
	
	
}
