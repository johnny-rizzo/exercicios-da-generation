package POO;

public class PATINETE {
       
	String marca;
	String modelo;
	String cor;
	double preço;
	
	public void aniversario(String marca, String modelo, String cor, double preço) {
		System.out.printf("Você comprou um patinete da marca %s, o modelo dele é o %s e sua cor é %s e ele custou apenas %2f", marca, modelo, cor, preço);
	}
}
