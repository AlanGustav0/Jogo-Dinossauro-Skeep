package entitys;

import java.util.Scanner;

public class Menu {

    public char menuOpcoes() {

        char opcMenu;

        Scanner scan = new Scanner(System.in);

        System.out.print("Vamos brinca com nosso amigo? Escolha uma das opçoes abaixo! \n " +
                "P - Pular \n " +
                "R - Correr \n " +
                "C - Comer \n " +
                "B - Brincar \n " +
                "S - Tomar Sol \n " +
                "O - Ficar na Sombra\n " +
                "E - Encerrar o jogo\n " +
                "Escolha sua opção: ");

        String opcao = scan.nextLine().toUpperCase();
        opcMenu = opcao.charAt(0);

        return opcMenu;

    }
}
