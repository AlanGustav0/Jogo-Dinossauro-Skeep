package view;

import entitys.*;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();
        Simbolos simbolo = new Simbolos();
        Dinossauro skeep = new Skeep();
        Frases frase = new Frases();
        String saudacao = "SEJA MUITO BEM VINDO AO MUDO DE SKEEP";
        char opc = '\u0000';

        simbolo.linhasSaudacao(saudacao);
        System.out.println(saudacao);
        simbolo.linhasSaudacao(saudacao);

        skeep.status();
        simbolo.linha();

        while (opc != 'E') {

            opc = menu.menuOpcoes();
            simbolo.linha();

            switch (opc) {

                case 'P':
                    skeep.pular(opc);
                    simbolo.linha();
                    break;
                case 'R':
                    skeep.correr(opc);
                    simbolo.linha();
                    break;
                case 'C':
                    skeep.comer(opc);
                    simbolo.linha();
                    break;
                case 'B':
                    skeep.brincar(opc);
                    simbolo.linha();
                    break;
                case 'S':
                    skeep.tomaSol(opc);
                    simbolo.linha();
                    break;
                case 'O':
                    skeep.ficaNaSombar(opc);
                    simbolo.linha();
                    break;

                case 'E':
                    System.out.printf("%s%n ", frase.conversar(opc));
                    simbolo.linha();
                    System.out.printf("%25s", "JOGO FINALIZADO");
                    break;
                default:
                    System.out.println("Ops! Está opção não é válida...");
                    simbolo.linha();
                    break;

            }

        }

    }
}

