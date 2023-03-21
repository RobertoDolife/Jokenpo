package poo;

import java.util.Random;
import java.util.Scanner;

public class TestePersonagem {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int idadePersonagem, round, pontos = 0, vitorias = 0;
        int Jogo[] = new int[3];

        Jogo[0] = 1;
        Jogo[1] = 2;
        Jogo[2] = 3;

        // instanciar a classe --> criar o objeto personagem
        Personagens p1 = new Personagens("Huguinho", 8, "nao binario");

        idadePersonagem = p1.getIdade();

        if (idadePersonagem < 18)
            p1.setLife(100);
        else
            p1.setLife(75);

        System.out.println("******************************");
        System.out.println("**** Vamos comecar o jogo ****");
        System.out.println("********  Life: " + p1.getLife() + " *********");
        System.out.println("******************************");
        System.out.println("");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        System.out.println("");
        System.out.println("******************************");
        System.out.println("");

        while (p1.getLife() > 0 && vitorias < 5) {
            System.out.print("Escolha uma opcao: ");
            round = sc.nextInt();

            int numero = random.nextInt(Jogo.length) + 1;

            System.out.println("Computador: " + numero);

            if (numero == 3 && round == 1) {
                System.out.println(p1.getNome() + ", voce ganhou!");
                pontos++;
            } else if (numero == 1 && round == 3) {
                System.out.println("Voce perdeu, " + p1.getNome() + "!!!");
                p1.Vida();
                System.out.println("********  Life: " + p1.getLife() + " *********");
            } else if (numero == 3 && round == 2) {
                System.out.println(p1.getNome() + ", voce ganhou!");
                pontos++;
            } else if (numero == 2 && round == 3) {
                System.out.println("Voce perdeu, " + p1.getNome() + "!!!");
                p1.Vida();
                System.out.println("********  Life: " + p1.getLife() + " *********");
            } else if (numero == round) {
                System.out.println("Empatamos, " + p1.getNome() + "!!!");
            } else {
                System.out.println("Opcao invalida, tente novamente!");
            }

            if (p1.getLife() <= 0) {
                System.out.println("******************************");
                System.out.println("****        Game Over      ****");
                System.out.println("******************************");
            } else if (pontos == 3) {
                System.out.println("******************************");
                System.out.println("****    Parabens, voce venceu!    ****");
                System.out.println("******************************");
                pontos = 0;
                vitorias++;
            }
        }

        /*
         * p1.Andar(0); p1.Andar(1); p1.Andar(-1);
         */
    }
}
