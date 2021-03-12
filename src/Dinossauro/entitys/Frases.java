package entitys;

import java.util.Random;

public class Frases {

    public String conversar(char escolha) {

        String[] falas = new String[3];
        Random aleatorio = new Random();

        switch (escolha) {

            case 'P':
                falas = new String[]{"Que pulo alto!", "Um verdadeiro atleta!", "Incrível!!"};
                break;
            case 'R':
                falas = new String[]{"Skeep está corredo!", "Skeep é muito rápido!", "Corra Skeep Corra!!!"};
                break;
            case 'C':
                falas = new String[]{"Humm... Skeep adora frutas isso deixa ele feliz", "Salada! Opção muito saudável.",
                        "Legumes fazem muito bem para Skeep!!!"};
                break;
            case 'B':
                falas = new String[]{"Skeep adora se esconder, tente encontrá-lo!", "Skeep está brincando de herói!",
                        "Hora de brincar de amarelinha!"};
                break;
            case 'S':
                falas = new String[]{"Ahhh como é bom tomar sol...", "Hora de tomar sol!!!",
                        "Um belo dia para tomar sol..."};
                break;
            case 'O':
                falas = new String[]{"Hora do descanso na sombra...", "Está muito calor, hora de ir para sombra!",
                        "Que sombrinha boa..."};
                break;
            case 'E':
                falas = new String[]{"Até breve!", "Tchau! Mas não demore para voltar heim!",
                        "Sempre bom brincar com você, até mais!"};
                break;

        }

        return falas[aleatorio.nextInt(falas.length)];
    }
}
