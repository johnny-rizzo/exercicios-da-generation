package CLASSES;

public class pessoa {

	private String nome;
	private int datanascimento;
	private boolean vivo;
	private char genero;
	
	//construtor
	
	public pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public pessoa(String nome, int datanascimento, char genero) {
		super();
		this.nome = nome;
		this.datanascimento = datanascimento;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(int datanascimento) {
		this.datanascimento = datanascimento;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	
	public int idade()
	{
		return 2021 - datanascimento;
	}
	
	public int idade(int anoatual) 
	{
		return anoatual - datanascimento;
	}
	
}
