// Este programa calcula o IMC (Índice de Massa Corporal) com base no peso e altura do usuário.
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu peso (em kg): ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura (em metros): ");
        double altura = sc.nextDouble();

        // Cálculo do IMC
        double imc = peso / Math.pow(altura, 2);
        imc = Math.round(imc * 100.0) / 100.0;

        // Saída do IMC
        System.out.println("\n--- Resultado ---");
        System.out.printf("%s, seu IMC é: %.2f\n", nome, imc);

        // Classificação
        String classificacao;
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25) {
            classificacao = "Peso normal";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else if (imc < 35) {
            classificacao = "Obesidade grau 1";
        } else if (imc < 40) {
            classificacao = "Obesidade grau 2";
        } else {
            classificacao = "Obesidade grau 3";
        }

        System.out.println("Classificação: " + classificacao);

        sc.close();
    }
}
