package DEUPAU;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class Leiturinha 
{

	public static void main(String[] args) 
	{
		
		File arquivo = new File("C:\\temp\\lista.txt");
		Scanner sc = null;
		
	try 
	{
		sc = new Scanner(arquivo);
		while (sc.hasNextLine()) 
	{
		System.out.println(sc.hasNextLine());
	}
	}
	catch (FileNotFoundException erro)
	{
		System.out.println("arquivo não encontrado");
	}
	finally {
		if(sc != null) {
			sc.close();
		}
	}
	}
	
	}
