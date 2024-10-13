package estruturaSwitch_Case;

import java.util.Scanner;

public class ExerciciosSwithc_case {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um exercício (1 a 10): ");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                exercicio1();
                break;
            case 2:
                exercicio2();
                break;
            case 3:
                exercicio3();
                break;
            case 4:
                exercicio4();
                break;
            case 5:
                exercicio5();
                break;
            case 6:
                exercicio6();
                break;
            case 7:
                exercicio7();
                break;
            case 8:
                exercicio8();
                break;
            case 9:
                exercicio9();
                break;
            case 10:
                exercicio10();
                break;
            default:
                System.out.println("Escolha inválida.");
        }

        scanner.close();
    }

    // 1. Dias da Semana
    public static void exercicio1() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digite um número (1-7) para o dia da semana: ");
			int dia = scanner.nextInt();

			switch (dia) {
			    case 1:
			        System.out.println("Domingo");
			        break;
			    case 2:
			        System.out.println("Segunda-feira");
			        break;
			    case 3:
			        System.out.println("Terça-feira");
			        break;
			    case 4:
			        System.out.println("Quarta-feira");
			        break;
			    case 5:
			        System.out.println("Quinta-feira");
			        break;
			    case 6:
			        System.out.println("Sexta-feira");
			        break;
			    case 7:
			        System.out.println("Sábado");
			        break;
			    default:
			        System.out.println("Dia inválido.");
			}
		}
    }

    // 2. Meses do ano
    public static void exercicio2() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digite um número (1-12) para o mês: ");
			int mes = scanner.nextInt();

			switch (mes) {
			    case 1:
			        System.out.println("Janeiro");
			        break;
			    case 2:
			        System.out.println("Fevereiro");
			        break;
			    case 3:
			        System.out.println("Março");
			        break;
			    case 4:
			        System.out.println("Abril");
			        break;
			    case 5:
			        System.out.println("Maio");
			        break;
			    case 6:
			        System.out.println("Junho");
			        break;
			    case 7:
			        System.out.println("Julho");
			        break;
			    case 8:
			        System.out.println("Agosto");
			        break;
			    case 9:
			        System.out.println("Setembro");
			        break;
			    case 10:
			        System.out.println("Outubro");
			        break;
			    case 11:
			        System.out.println("Novembro");
			        break;
			    case 12:
			        System.out.println("Dezembro");
			        break;
			    default:
			        System.out.println("Mês inválido.");
			}
		}
    }

    // 3. Calculadora simples
    public static void exercicio3() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Insira o primeiro número: ");
			double num1 = scanner.nextDouble();
			System.out.print("Insira o segundo número: ");
			double num2 = scanner.nextDouble();
			System.out.print("Escolha a operação (+, -, *, /): ");
			char operacao = scanner.next().charAt(0);

			switch (operacao) {
			    case '+':
			        System.out.println("Resultado: " + (num1 + num2));
			        break;
			    case '-':
			        System.out.println("Resultado: " + (num1 - num2));
			        break;
			    case '*':
			        System.out.println("Resultado: " + (num1 * num2));
			        break;
			    case '/':
			        if (num2 != 0) {
			            System.out.println("Resultado: " + (num1 / num2));
			        } else {
			            System.out.println("Erro: divisão por zero.");
			        }
			        break;
			    default:
			        System.out.println("Operação inválida.");
			}
		}
    }

    // 4. Classificação de notas
    public static void exercicio4() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Insira uma nota (A, B, C, D ou F): ");
			char nota = scanner.next().charAt(0);

			switch (nota) {
			    case 'A':
			        System.out.println("Excelente!");
			        break;
			    case 'B':
			        System.out.println("Bom!");
			        break;
			    case 'C':
			        System.out.println("Satisfatório!");
			        break;
			    case 'D':
			        System.out.println("Aprovado com ressalvas!");
			        break;
			    case 'F':
			        System.out.println("Reprovado.");
			        break;
			    default:
			        System.out.println("Nota inválida.");
			}
		}
    }

    // 5. Classificação de idades
    public static void exercicio5() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Insira sua idade: ");
			int idade = scanner.nextInt();

			switch (idade) {
			    case 0:
			    case 1:
			    case 2:
			    case 3:
			    case 4:
			    case 5:
			    case 6:
			    case 7:
			    case 8:
			    case 9:
			    case 10:
			    case 11:
			    case 12:
			        System.out.println("Criança");
			        break;
			    case 13:
			    case 14:
			    case 15:
			    case 16:
			    case 17:
			        System.out.println("Adolescente");
			        break;
			    case 18:
			    case 19:
			    case 20:
			    case 21:
			    case 22:
			    case 23:
			    case 24:
			    case 25:
			    case 26:
			    case 27:
			    case 28:
			    case 29:
			    case 30:
			    case 31:
			    case 32:
			    case 33:
			    case 34:
			    case 35:
			    case 36:
			    case 37:
			    case 38:
			    case 39:
			    case 40:
			    case 41:
			    case 42:
			    case 43:
			    case 44:
			    case 45:
			    case 46:
			    case 47:
			    case 48:
			    case 49:
			    case 50:
			    case 51:
			    case 52:
			    case 53:
			    case 54:
			    case 55:
			    case 56:
			    case 57:
			    case 58:
			    case 59:
			    case 60:
			    case 61:
			    case 62:
			    case 63:
			    case 64:
			        System.out.println("Adulto");
			        break;
			    default:
			        System.out.println("Idoso");
			}
		}
    }

    // 6. Escolha de transporte
    public static void exercicio6() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Escolha um modo de transporte (1: Carro, 2: Moto, 3: Bicicleta, 4: Caminhada): ");
			int opcao = scanner.nextInt();

			switch (opcao) {
			    case 1:
			        System.out.println("Você escolheu Carro.");
			        break;
			    case 2:
			        System.out.println("Você escolheu Moto.");
			        break;
			    case 3:
			        System.out.println("Você escolheu Bicicleta.");
			        break;
			    case 4:
			        System.out.println("Você escolheu Caminhada.");
			        break;
			    default:
			        System.out.println("Opção inválida.");
			}
		}
    }

    // 7. Converter número em mês
    public static void exercicio7() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite um número de 1 a 12 para converter em mês: ");
			int mes = scanner.nextInt();

			switch (mes) {
			    case 1:
			        System.out.println("Janeiro");
			        break;
			    case 2:
			        System.out.println("Fevereiro");
			        break;
			    case 3:
			        System.out.println("Março");
			        break;
			    case 4:
			        System.out.println("Abril");
			        break;
			    case 5:
			        System.out.println("Maio");
			        break;
			    case 6:
			        System.out.println("Junho");
			        break;
			    case 7:
			        System.out.println("Julho");
			        break;
			    case 8:
			        System.out.println("Agosto");
			        break;
			    case 9:
			        System.out.println("Setembro");
			        break;
			    case 10:
			        System.out.println("Outubro");
			        break;
			    case 11:
			        System.out.println("Novembro");
			        break;
			    case 12:
			        System.out.println("Dezembro");
			        break;
			    default:
			        System.out.println("Número inválido.");
			}
		}
    }

    // 8. Classificação de fruta
    public static void exercicio8() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite o nome de uma fruta: ");
			String fruta = scanner.next().toLowerCase();

			switch (fruta) {
			    case "maçã":
			    case "banana":
			    case "laranja":
			        System.out.println(fruta + " é uma fruta comum.");
			        break;
			    case "kiwi":
			    case "pitaia":
			    case "mangostão":
			        System.out.println(fruta + " é uma fruta exótica.");
			        break;
			    default:
			        System.out.println("Fruta desconhecida.");
			}
		}
    }

    // 9. Verificar vogais
    public static void exercicio9() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite uma letra: ");
			char letra = scanner.next().toLowerCase().charAt(0);

			switch (letra) {
			    case 'a':
			    case 'e':
			    case 'i':
			    case 'o':
			    case 'u':
			        System.out.println("A letra " + letra + " é uma vogal.");
			        break;
			    default:
			        System.out.println("A letra " + letra + " é uma consoante.");
			}
		}
    }

    // 10. Classificação de estação do ano
    public static void exercicio10() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite um número (1-4) para a estação do ano: ");
			int estacao = scanner.nextInt();

			switch (estacao) {
			    case 1:
			        System.out.println("Verão");
			        break;
			    case 2:
			        System.out.println("Outono");
			        break;
			    case 3:
			        System.out.println("Inverno");
			        break;
			    case 4:
			        System.out.println("Primavera");
			        break;
			    default:
			        System.out.println("Número inválido.");
			}
		}
    }
}


