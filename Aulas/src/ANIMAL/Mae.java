package ANIMAL;

public class Mae {
	
	public String nome;
	public String nomec;
	public String nomep;
	public int idade;
	public int idadec;
	public int idadep;
	public String latido;
	public String relinxo;
	public String berro;
	public boolean deveCorrer;
	

	public String getNome() {
		return nome;

	}

	public void setNome(String nome) {
		this.nome = nome;
		System.out.println(nome);
		
		this.nomec = nomec;
		System.out.println(nomec);
		
		this.nomep = nomep;
		System.out.println(nomep);
		
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
		System.out.print("e sua idade é: ");
		System.out.println(idade);
	}



	public String getLatido() {
	
		return latido;
	}



	public void setLatido(String latido) {
		this.latido = latido;
		System.out.println(latido);
		
		
	}



	public boolean isdeveCorrer() {
		return deveCorrer;
	}



	public void setdeveCorrer(boolean deveCorrer) {
		this.deveCorrer = deveCorrer;
		System.out.println();
	}



	public String latido() {
		
		return null;
	}
	
	
	

}
