// Informe o preço dos produtos de uma loja, conforme indicado na tabela abaixo. 
// O algoritmo deve receber o código do produto como entrada.

import java.util.Scanner;

public class Questao3{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int codigo;

        System.out.print("Digite o código do produto: ");
        codigo = input.nextInt();

        // Condicional

        switch(codigo){
            case 1:
                System.out.println("Sapato = R$99,99");
                break;
            case 2:
                System.out.println("Bolsa = R$103,89");
                break;
            case 3: 
                System.out.println("Camisa = R$49,98");
                break;
            case 4:
                System.out.println("Calça = R$89,72");
                break;
            case 5:
                System.out.println("Blusa = R$97,35");
                break;
            default:
                System.out.println("Produto indisponível");
        }

        input.close();

    }
}