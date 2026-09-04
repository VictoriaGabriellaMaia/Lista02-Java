// Receba 3 notas no intervalo [0, 10] de um aluno, calcule e apresente uma mensagem de 
// acordo com sua média. OBS: >= 0 e < 3 Reprovado | >= 3 e < 7 Exame | >= 7 e <= 10 Aprovado

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.print("Digite a 1° nota (0 a 10): ");
        nota1 = input.nextDouble();
        
        System.out.print("Digite a 2° nota (0 a 10): ");
        nota2 = input.nextDouble();

        System.out.print("Digite a 3° nota (0 a 10): ");
        nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3) / 3; // Calcula a média 

        // Condicionais: 

        if (media >= 0 && media < 3) {
            System.out.println("Reprovado");
        } else if (media >= 3 && media < 7) {
            System.out.println("Exame");
        } else if (media >= 7 && media <= 10) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Média inválida. Digite valores de 0 a 10");
        }

        input.close();
        
    }
}