package exerciciosWhile;

import java.util.Scanner;

public class Exercicos_While {
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

    // 1. Imprimir números de 1 a 10
    public static void exercicio1() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    // 2. Somar números até o usuário digitar 0
    public static void exercicio2() {
        try (Scanner scanner = new Scanner(System.in)) {
			int num, soma = 0;

			System.out.print("Digite um número (0 para sair): ");
			num = scanner.nextInt();
			while (num != 0) {
			    soma += num;
			    System.out.print("Digite um número (0 para sair): ");
			    num = scanner.nextInt();
			}
			System.out.println("Soma total: " + soma);
		}
        
    }

    // 3. Contar números pares de 1 a 20
    public static void exercicio3() {
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    // 4. Verificar senha até o usuário acertar
    public static void exercicio4() {
        try (Scanner scanner = new Scanner(System.in)) {
			String senhaCorreta = "1234";
			String senha;

			System.out.print("Digite a senha: ");
			senha = scanner.nextLine();

			while (!senha.equals(senhaCorreta)) {
			    System.out.println("Senha incorreta.");
			    System.out.print("Digite a senha novamente: ");
			    senha = scanner.nextLine();
			}
		}
        System.out.println("Acesso permitido.");
    }

    // 5. Contar números ímpares de 1 a 30
    public static void exercicio5() {
        int i = 1;
        while (i <= 30) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    // 6. Tabuada de um número escolhido
    public static void exercicio6() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite um número para a tabuada: ");
			int num = scanner.nextInt();

			int i = 1;
			while (i <= 10) {
			    System.out.println(num + " x " + i + " = " + (num * i));
			    i++;
			}
		}
    }

    // 7. Somar números ímpares entre 1 e 50
    public static void exercicio7() {
        int i = 1, soma = 0;
        while (i <= 50) {
            if (i % 2 != 0) {
                soma += i;
            }
            i++;
        }
        System.out.println("Soma dos números ímpares entre 1 e 50: " + soma);
    }

    // 8. Ler números até o usuário digitar um número negativo
    public static void exercicio8() {
        try (Scanner scanner = new Scanner(System.in)) {
			int num;

			System.out.print("Digite um número (número negativo para sair): ");
			num = scanner.nextInt();

			while (num >= 0) {
			    System.out.print("Digite outro número (número negativo para sair): ");
			    num = scanner.nextInt();
			}
		}
        System.out.println("Número negativo detectado, encerrando.");
    }

    // 9. Verificar se o número é primo
    public static void exercicio9() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite um número para verificar se é primo: ");
			int num = scanner.nextInt();
			boolean primo = true;

			int i = 2;
			while (i <= num / 2) {
			    if (num % i == 0) {
			        primo = false;
			        break;
			    }
			    i++;
			}

			if (primo && num > 1) {
			    System.out.println(num + " é um número primo.");
			} else {
			    System.out.println(num + " não é um número primo.");
			}
		}
    }

    // 10. Calcular fatorial de um número
    public static void exercicio10() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite um número para calcular o fatorial: ");
			int num = scanner.nextInt();
			int fatorial = 1;

			int i = num;
			while (i > 0) {
			    fatorial *= i;
			    i--;
			}

			System.out.println("Fatorial de " + num + " é: " + fatorial);
		}
    }
}

