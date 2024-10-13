package exerciciosDo_while;

import java.util.Scanner;

public class ExerciciosDo_while {
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
	        do {
	            System.out.println(i);
	            i++;
	        } while (i <= 10);
	    }

	    // 2. Somar números até o usuário digitar 0
	    public static void exercicio2() {
	        try (Scanner scanner = new Scanner(System.in)) {
				int num, soma = 0;

				do {
				    System.out.print("Digite um número (0 para sair): ");
				    num = scanner.nextInt();
				    soma += num;
				} while (num != 0);
				
				  System.out.println("Soma total: " + soma);
			}
	      
	    }

	    // 3. Contar números ímpares de 1 a 20
	    public static void exercicio3() {
	        int i = 1;
	        do {
	            if (i % 2 != 0) {
	                System.out.println(i);
	            }
	            i++;
	        } while (i <= 20);
	    }

	    // 4. Verificar senha até o usuário acertar
	    public static void exercicio4() {
	        try (Scanner scanner = new Scanner(System.in)) {
				String senhaCorreta = "1234";
				String senha;

				do {
				    System.out.print("Digite a senha: ");
				    senha = scanner.nextLine();
				    if (!senha.equals(senhaCorreta)) {
				        System.out.println("Senha incorreta.");
				    }
				} while (!senha.equals(senhaCorreta));
			}
	        System.out.println("Acesso permitido.");
	    }

	    // 5. Somar números pares entre 1 e 50
	    public static void exercicio5() {
	        int i = 1, soma = 0;
	        do {
	            if (i % 2 == 0) {
	                soma += i;
	            }
	            i++;
	        } while (i <= 50);

	        System.out.println("Soma dos números pares de 1 a 50: " + soma);
	    }

	    // 6. Tabuada de um número escolhido
	    public static void exercicio6() {
	        try (Scanner scanner = new Scanner(System.in)) {
				System.out.print("Digite um número para a tabuada: ");
				int num = scanner.nextInt();

				int i = 1;
				do {
				    System.out.println(num + " x " + i + " = " + (num * i));
				    i++;
				} while (i <= 10);
			}
	    }

	    // 7. Contar números entre 1 e 100 que são divisíveis por 3
	    public static void exercicio7() {
	        int i = 1;
	        do {
	            if (i % 3 == 0) {
	                System.out.println(i);
	            }
	            i++;
	        } while (i <= 100);
	    }

	    // 8. Ler números até o usuário digitar um número negativo
	    public static void exercicio8() {
	        try (Scanner scanner = new Scanner(System.in)) {
				int num;

				do {
				    System.out.print("Digite um número (número negativo para sair): ");
				    num = scanner.nextInt();
				} while (num >= 0);
			}
	        System.out.println("Número negativo detectado, encerrando.");
	    }

	    // 9. Calcular o fatorial de um número
	    public static void exercicio9() {
	        try (Scanner scanner = new Scanner(System.in)) {
				System.out.print("Digite um número para calcular o fatorial: ");
				int num = scanner.nextInt();
				int fatorial = 1;

				int i = num;
				do {
				    fatorial *= i;
				    i--;
				} while (i > 0);

				System.out.println("Fatorial de " + num + " é: " + fatorial);
			}
	    }

	    // 10. Contar quantas vezes o usuário errou a senha
	    public static void exercicio10() {
	        try (Scanner scanner = new Scanner(System.in)) {
				String senhaCorreta = "password";
				String senha;
				int tentativas = 0;

				do {
				    System.out.print("Digite a senha: ");
				    senha = scanner.nextLine();
				    if (!senha.equals(senhaCorreta)) {
				        System.out.println("Senha incorreta.");
				        tentativas++;
				    }
				} while (!senha.equals(senhaCorreta));

				System.out.println("Você acertou a senha após " + tentativas + " tentativas erradas.");
			}
	    }
	}

