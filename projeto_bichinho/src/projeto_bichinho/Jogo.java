package projeto_bichinho;

import java.util.Scanner;

//Classe Jogo que gerencia a interação com o usuário e a execução do programa
class Jogo {
 private Animal animal;

 // Método para iniciar o jogo e criar o bichinho
 public void iniciar() {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Crie seu novo animal");
     System.out.print("Insira o nome: ");
     String nome = scanner.nextLine();
     System.out.print("Insira a classe: ");
     String classe = scanner.nextLine();
     System.out.print("Insira a família: ");
     String familia = scanner.nextLine();

     animal = new Animal(nome, classe, familia);
     System.out.println("O animal " + nome + " nasceu!");

     executarJogo(scanner);
     scanner.close();
 }

 // Método para exibir o menu e executar ações com base na escolha do usuário
 private void executarJogo(Scanner scanner) {
     while (animal.isVivo()) {
         System.out.println("\nO que " + animal + " vai fazer agora?");
         System.out.println("1 - Comer");
         System.out.println("2 - Correr");
         System.out.println("3 - Dormir");
         System.out.println("4 - Morrer");

         System.out.print("Escolha uma opção: ");
         int opcao = scanner.nextInt();

         switch (opcao) {
             case 1:
                 animal.comer();
                 break;
             case 2:
                 animal.correr();
                 break;
             case 3:
                 animal.dormir();
                 break;
             case 4:
                 animal.morrer();
                 break;
             default:
                 System.out.println("Opção inválida!");
                 break;
         }
     }
     System.out.println("GAME OVER!");
 }
}