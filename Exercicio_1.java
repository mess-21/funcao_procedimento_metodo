package procedimento_funcao_metodo;

import java.util.Scanner;

public class Exercicio_1 
{
	public static void main(String args[])
	{
	 Scanner leitor = new Scanner(System.in);
	 int x,y;
	 System.out.println("Digite um número inteiro");
	 x = leitor.nextInt();
	 
	 System.out.println("Digite outro número inteiro");
	 y = leitor.nextInt();
	 
	 
	 System.out.println("A soma dos números acima é:");
	 soma(x,y);
	 
	}
	
	public static void soma(int x, int y)
	{
		System.out.println((x+y));
	}

}
