package procedimento_funcao_metodo;

import java.util.Scanner;

public class Exercicio_2 
{
	public static void main(String args[])
	{
	 Scanner leitor = new Scanner(System.in);
	 int x,y;
	 System.out.println("Digite um número inteiro");
	 x = leitor.nextInt();
	 
	 System.out.println("Digite outro número inteiro");
	 y = leitor.nextInt();
	 
	 
	 System.out.println("A soma de todos os números entre "+x+" e "+y);
	 System.out.println(soma(x,y));
	 
	}
	
	public static int soma(int x, int y)
	{
		int resposta = 0, maior, menor;
		if(x >= y)
		{
			maior = x;
			menor = y;
		}
		else
		{
			maior = y;
			menor = x;
		}
			
		for(int z = menor; z<=maior; z++ )
		{
			resposta += z;
		}
		
	
		return resposta;
	}

}
