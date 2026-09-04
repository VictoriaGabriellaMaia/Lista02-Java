// Determine a situação de peso de um indivíduo determinada através do IMC (Índice de Massa Corpórea). 
// IMC = PESO / ALTURA2. 

import java.util.Scanner;

public class Questao2{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double peso, altura, imc;

        System.out.print("Digite seu peso: ");
        peso = input.nextDouble();

        System.out.print("Digite sua altura: ");
        altura = input.nextDouble();

        imc = peso / (altura * altura); // Calcula o IMC 

        // Condicionais 
        if (imc < 20) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 20 && imc < 25){
            System.out.println("Normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc >=30 && imc < 40) {
            System.out.println("Obesidade");
        } else {
            System.out.println("Obesidade Mórbida");
        }

        input.close();

    }
}