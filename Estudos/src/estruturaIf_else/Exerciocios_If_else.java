package estruturaIf_else;

import java.util.Scanner;

public class Exerciocios_If_else {
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

    public static void exercicio1() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Insira um número: ");
			int num = scanner.nextInt();

			if (num > 0) {
			    System.out.println("O número é positivo.");
			} else if (num < 0) {
			    System.out.println("O número é negativo.");
			} else {
			    System.out.println("O número é zero.");
			}
		}
    }

    public static void exercicio2() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Insira um número: ");
			int num = scanner.nextInt();

			if (num % 2 == 0) {
			    System.out.println("O número é par.");
			} else {
			    System.out.println("O número é ímpar.");
			}
		}
    }

    public static void exercicio3() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Insira sua idade: ");
			int idade = scanner.nextInt();

			if (idade >= 0 && idade <= 12) {
			    System.out.println("Você é uma criança.");
			} else if (idade >= 13 && idade <= 17) {
			    System.out.println("Você é um adolescente.");
			} else if (idade >= 18 && idade <= 64) {
			    System.out.println("Você é um adulto.");
			} else if (idade >= 65) {
			    System.out.println("Você é um idoso.");
			} else {
			    System.out.println("Idade inválida.");
			}
		}
    }

    public static void exercicio4() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Insira o primeiro número: ");
			double num1 = scanner.nextDouble();
			System.out.print("Insira o segundo número: ");
			double num2 = scanner.nextDouble();
			System.out.print("Escolha a operação (+, -, *, /): ");
			char operacao = scanner.next().charAt(0);

			if (operacao == '+') {
			    System.out.println("Resultado: " + (num1 + num2));
			} else if (operacao == '-') {
			    System.out.println("Resultado: " + (num1 - num2));
			} else if (operacao == '*') {
			    System.out.println("Resultado: " + (num1 * num2));
			} else if (operacao == '/') {
			    if (num2 != 0) {
			        System.out.println("Resultado: " + (num1 / num2));
			    } else {
			        System.out.println("Erro: divisão por zero.");
			    }
			} else {
			    System.out.println("Operação inválida.");
			}
		}
    }

    public static void exercicio5() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Insira um ano: ");
			int ano = scanner.nextInt();

			if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			    System.out.println(ano + " é um ano bissexto.");
			} else {
			    System.out.println(ano + " não é um ano bissexto.");
			}
		}
    }

    public static void exercicio6() {
        try (Scanner scanner = new Scanner(System.in)) {
			String senhaCorreta = "12345";

			System.out.print("Insira a senha: ");
			String senha = scanner.nextLine();

			if (senha.equals(senhaCorreta)) {
			    System.out.println("Acesso permitido.");
			} else {
			    System.out.println("Senha incorreta.");
			}
		}
    }

    public static void exercicio7() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Insira o primeiro número: ");
			int num1 = scanner.nextInt();
			System.out.print("Insira o segundo número: ");
			int num2 = scanner.nextInt();
			System.out.print("Insira o terceiro número: ");
			int num3 = scanner.nextInt();

			if (num1 >= num2 && num1 >= num3) {
			    System.out.println("O maior número é: " + num1);
			} else if (num2 >= num1 && num2 >= num3) {
			    System.out.println("O maior número é: " + num2);
			} else {
			    System.out.println("O maior número é: " + num3);
			}
		}
    }

    public static void exercicio8() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Insira a nota do aluno (0-100): ");
			int nota = scanner.nextInt();

			if (nota >= 60) {
			    System.out.println("Aluno aprovado.");
			} else if (nota >= 40) {
			    System.out.println("Aluno em recuperação.");
			} else {
			    System.out.println("Aluno reprovado.");
			}
		}
    }

    public static void exercicio9() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Insira um número: ");
			int num = scanner.nextInt();

			if (num % 3 == 0 && num % 5 == 0) {
			    System.out.println("O número é divisível por 3 e por 5.");
			} else if (num % 3 == 0) {
			    System.out.println("O número é divisível por 3.");
			} else if (num % 5 == 0) {
			    System.out.println("O número é divisível por 5.");
			} else {
			    System.out.println("O número não é divisível por 3 nem por 5.");
			}
		}
    }

    public static void exercicio10() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Insira um número: ");
			int num = scanner.nextInt();
			boolean isPrimo = true;

			if (num <= 1) {
			    isPrimo = false;
			} else {
			    for (int i = 2; i <= num / 2; i++) {
			        if (num % i == 0) {
			            isPrimo = false;
			            break;
			        }
			    }
			}

			if (isPrimo) {
			    System.out.println(num + " é um número primo.");
			} else {
			    System.out.println(num + " não é um número primo.");
			}
		}
    }
}

