package procedimento_funcao_metodo;

import java.util.Scanner;

public class Exercicio_3 
{
	public static void main(String args[])
	{
	 Scanner leitor = new Scanner(System.in);
	 double nota1,nota2,nota3,nota4;
	
	 
	 System.out.print("Digite a 1° nota do aluno(1 a 10): ");
	 nota1 = leitor.nextDouble();
	 if (nota1 > 10 || nota1 < 0)
	 {
		 nota1 = clamp_nota(nota1);
	 }
	 
	 System.out.print("Digite a 2° nota do aluno(1 a 10): ");
	 nota2 = leitor.nextDouble();
	 if (nota2 > 10 || nota2 < 0)
	 {
		 nota2 = clamp_nota(nota2);
	 }
	 
	 
	 System.out.print("Digite a 3° nota do aluno(1 a 10): ");
	 nota3 = leitor.nextDouble();
	 if (nota3 > 10 || nota3 < 0)
	 {
		 nota3 = clamp_nota(nota3);
	 }
	 
	 System.out.print("Digite a 4° nota do aluno(1 a 10): ");
	 nota4 = leitor.nextDouble();
	 if (nota4 > 10 || nota4 < 0)
	 {
		 nota4 = clamp_nota(nota4);
	 }
	 
	 System.out.println("A média do aluno é: "+((nota1+nota2+nota3+nota4)/4));
	 System.out.print("Estado do aluno: ");
	 System.out.print(estado_media(nota1,nota2,nota3,nota4));
	 
	}
	
	public static boolean estado_media(double nota1, double nota2, double nota3, double nota4)
	{
		double media;
		boolean estado = false;
		media = (nota1+nota2+nota3+nota4)/4;
		
		if(media >= 7)
		{
			estado = true;
		}
		else
		{
			estado = false;
		}
		
		return estado;
	}
	
	public static double clamp_nota(double nota)
	{
		Scanner leitor = new Scanner(System.in);
		if (nota > 10 || nota < 0)
		{
			while(nota > 10 || nota < 0)
			{
				 System.out.println("Digite somente notas entre 1 e 10");
				 System.out.print("Digite a nota novamente: ");
				 nota = leitor.nextDouble();
			}	
		}
		return nota;
	}

}
