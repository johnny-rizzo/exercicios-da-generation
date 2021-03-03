package FUNCOES;
//1- Informar todos os números de 1000 a 1999 que quando divididos por 11
//obtemos resto = 5. (FOR)
public class ecerciciorepeticao1 {

	public static void main(String[] args) {
	
		int numero = 1999, resto = 0;
		for(int contador = 1000; contador <= 1999; contador++) {
			
		resto = (contador % 11);
		if(resto == 5) {
			System.out.println(contador);
		}
		}

	}

}
