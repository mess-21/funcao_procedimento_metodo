package procedimento_funcao_metodo;

import java.util.Scanner;

public class Exercicio_4 
{
	public static void main(String args[])
	{
	 Scanner leitor = new Scanner(System.in);
	 int x, y;
	 String op;
	 
	 System.out.println("Digite um número inteiro");
	 x = leitor.nextInt();
	 
	 System.out.println("Digite outro número inteiro");
	 y = leitor.nextInt();
	 
	 System.out.println("Digite uma operação aritmética (+, -, /, *)");
	 op = leitor.next();
	 if( !(   op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")   ) )
	 {
		 while( !(   op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")   ) )
		 {
			 System.out.println("ERRO: Símbolo não reconhecido");
			 System.out.println("Digite uma operação aritmética novamente (+, -, /, *)");
			 op = leitor.next();
		 }
	 }
	
	 
	 
	 operacao(x, y, op);
	}
	
	public static void operacao(int x, int y, String op)
	{ 
		int oper = 0;
		switch(op)
		{
		case "*": oper = x*y; break;
		case "/": oper = x/y; break;
		case "+": oper = x+y; break;
		case "-": oper = x-y; break;
		}
		System.out.println(x+" "+op+" "+y+" = "+oper);
		
	}

}
