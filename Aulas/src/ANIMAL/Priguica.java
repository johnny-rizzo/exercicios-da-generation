package ANIMAL;

public class Priguica {
	
	
	private String nome;
	private int idade;
	private String grito;
	private boolean sim;
	
	
	public Priguica(String nome, int idade, String grito, boolean sim) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.grito = grito;
		this.sim = sim;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getGrito() {
		return grito;
	}


	public void setGrito(String grito) {
		this.grito = grito;
	}


	public boolean isSim() {
		return sim;
	}


	public void setSim(boolean sim) {
		this.sim = sim;
	}
	
	
	
	
}
