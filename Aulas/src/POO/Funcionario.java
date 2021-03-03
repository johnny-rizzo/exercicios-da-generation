package POO;

public class Funcionario {
	
	
	public String nome;
	public String profissao;
	public double salario;
	
	public void salario(String nome,String profissao,double salario) {
		System.out.printf(" %s, você foi selecionado para ser %s e seu salário será %2f.",nome, profissao, salario);

}
}