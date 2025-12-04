package primeiroProjeto;

import java.util.Scanner;

public class Programacao_Back_End {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);

	        String nome = "";
	        String email = "";
	        String numero = "";
	        String cpf = "";
	        String senhaCadastro = "";
	        String resposta;
	        int opcao1;
	        String opcao2;
	        String opcao3;
	        double desconto = 0.45;
	        String tamanho;
	        double valor=0;
	        int opcao4;
	        

	  
	        System.out.println("==========================================");
	        System.out.println("1 - Cadastrar-se");
	        System.out.println("2 - Fazer login");
	        System.out.println("4 - Sair");
	        System.out.println("3 - mensagem");
	        System.out.println("==========================================");
	        System.out.print("Escolha uma opção: ");
	        opcao1 = sc.nextInt();
	        sc.nextLine(); 

	        while (opcao1 < 1 || opcao1 > 4) {
	            System.out.println("Opção inválida, tente novamente:");
	            opcao1 = sc.nextInt();
	            sc.nextLine();
	        }

	        
	        if (opcao1 == 4) {
	            System.out.println("Programa encerrado. Obrigado!");
	            return;
	        }

	        
	        if (opcao1 == 1) {
	            System.out.println("Digite seu nome completo:");
	            nome = sc.nextLine();

	            System.out.println("--------------------------------------------");
	            System.out.println("Digite seu email:");
	            email = sc.nextLine();

	            System.out.println("--------------------------------------------");
	            System.out.println("Digite seu número de celular:");
	            numero = sc.nextLine();

	            System.out.println("--------------------------------------------");
	            System.out.println("Digite seu CPF:");
	            cpf = sc.nextLine();

	            System.out.println("--------------------------------------------");
	            System.out.println("Crie uma senha:");
	            senhaCadastro = sc.nextLine();

	            System.out.println("Cadastro realizado com sucesso!");
	        }

	       
	        else if (opcao1 == 2) {

	            System.out.println("Digite seu email:");
	            String LoginEmail = sc.nextLine();

	            System.out.println("Digite sua senha:");
	            String senhaLogin = sc.nextLine();

	            System.out.println("Login realizado!");
	            System.out.println("Bem-vindo, " + LoginEmail);
	        }
	        
	        
	        
	        
	        else if (opcao1 == 3) {

	           System.out.println("mande mensagem para o  vendedor");
	           System.out.println("==============================================");
	           System.out.println("escreva aqui sua mensagem: ");
	           opcao3 = sc.next();
	           System.out.println("mensagem enviada com sucesso, aguarde o retorno");
	        }
	        
	        

	       

	       

	        do {

	            System.out.println("---------------------");
	            System.out.println("1 - Sapato  (R$ 500)");
	            System.out.println("2 - Calças  (R$ 200)");
	            System.out.println("3 - Blaze   (R$ 350)");
	            System.out.println("4 - Vestido (R$ 300)");
	            System.out.println("5 - Saia    (R$ 150)");
	            System.out.println("6 - Macacão (R$ 290)");
	            System.out.println("---------------------");
	            System.out.print("Escolha uma opção: ");

	            int produto = sc.nextInt();

	            while (produto < 1 || produto > 6) {
	                System.out.println("Opção inválida! Tente novamente:");
	                produto = sc.nextInt();
	            }

	            System.out.println("Escolha a cor do produto:");
	            System.out.println("1 - Preto");
	            System.out.println("2 - Marrom");
	            System.out.println("3 - Cinza");
	            System.out.println("4 - Bordo");
	            System.out.println("5 - Bege");
	            System.out.println("6 - Azul-marinho");

	            opcao2 = sc.next();
	            sc.nextLine();

	            if (produto == 1) {
	                System.out.println("Escolha o tamanho do sapato:");
	                System.out.println("34 35 36 37 38 39 40 41 42 43");
	                tamanho = sc.next();
	            } else {
	                System.out.println("Escolha o tamanho da roupa:");
	                System.out.println("P M G GG");
	                tamanho = sc.next();
	            }

	            switch (produto) {
	                case 1 -> { valor += 500; System.out.println("Sapato adicionado."); }
	                case 2 -> { valor += 200; System.out.println("Calça adicionada."); }
	                case 3 -> { valor += 350; System.out.println("Blaze adicionado."); }
	                case 4 -> { valor += 300; System.out.println("Vestido adicionado."); }
	                case 5 -> { valor += 150; System.out.println("Saia adicionada."); }
	                case 6 -> { valor += 290; System.out.println("Macacão adicionado."); }
	            }

	            System.out.println("Deseja comprar outro produto? (sim/nao)");
	            resposta = sc.next();

	        } while (resposta.equalsIgnoreCase("sim"));

	        System.out.println("Valor total: R$ " + valor);

	        if (valor > 200) {
	            valor = valor - (valor * desconto);
	            System.out.println("Valor com 45% de desconto: R$ " + valor);
	        }

	        System.out.println("A partir de R$ 200 você ganha 45% de desconto!");

	     
	        System.out.println("Escolha a forma de pagamento");
	        System.out.println("1 - Pix");
	        System.out.println("2 - Cartão de débito");
	        System.out.println("3 - Cartão de crédito");
	        System.out.print("Opção: ");
	        opcao4 = sc.nextInt();

	        if (opcao4 == 1) {
	            System.out.println("Gerando QRCode...");
	        } else if (opcao4 == 2 || opcao4 == 3) {
	            System.out.println("Digite as informações do cartão:");
	            System.out.print("Número: ");
	            String numC = sc.next();
	            System.out.print("Validade: ");
	            String validade = sc.next();
	            System.out.print("Código de segurança: ");
	            int codigo = sc.nextInt();
	            System.out.print("Nome do titular: ");
	            sc.nextLine();
	            String nomeTitular = sc.nextLine();

	            System.out.println("Pagamento aprovado!");
	        }

	        System.out.println("Programa encerrado. Obrigado!");
	    }

	}