package Exemplofuncionario;

public class Funcionario {
	
	private String nome;
	private int matricula;
	private int horastrabalhadas;
	private double valorporhora;
	public Funcionario(String nome, int matricula, int horastrabalhadas, double valorporhora) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.horastrabalhadas = horastrabalhadas;
		this.valorporhora = valorporhora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getHorastrabalhadas() {
		return horastrabalhadas;
	}
	public void setHorastrabalhadas(int horastrabalhadas) {
		this.horastrabalhadas = horastrabalhadas;
	}
	public double getValorporhora() {
		return valorporhora;
	}
	public void setValorporhora(double valorporhora) {
		this.valorporhora = valorporhora;
	}
	
	
}//termina aqui
