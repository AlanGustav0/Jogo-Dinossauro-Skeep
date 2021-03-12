package entitys;

public class Skeep extends Dinossauro {

    Frases frase = new Frases();

    @Override
    public void status() {
        System.out.println("Estas são as características do nosso amigo Skeep!\n" +
                "- Sua energia inicializa com valor: " + getEnergia() + "\n" +
                "- Sua velocidade inicializa com valor: " + getVelocidade() + "\n" +
                "- Sua temperatura padrão inicia com:  " + getTemperatura() + "º\n" +
                "- E seu humor inicia como: " + getHumor());
    }

    @Override
    public void pular(char escolha) {
        if (getEnergia() == 0) {
            System.out.println("O Skeep está sem energia... Que tal ficar na sombra ou comer alguma coisa?");
        } else {
            System.out.println(frase.conversar(escolha));
            setEnergia(getEnergia() - 2);
            System.out.println("Sua Energia ---> " + getEnergia());
        }
    }

    @Override
    public void correr(char escolha) {
        if (getEnergia() == 0) {
            System.out.println("O Skeep está sem energia para correr... " +
                    "Que tal ficar na sombra ou comer alguma coisa?");
        } else {
            System.out.println(frase.conversar(escolha));
            setEnergia(getEnergia() - 2);
            setHumor("Feliz");
            System.out.println("Sua Energia ---> " + getEnergia());
            System.out.println("Seu Humor   ---> " + getHumor());
        }
    }

    @Override
    public void comer(char escolha) {
        if (getEnergia() == 10) {
            System.out.println("O Skeep já está de barriga cheia!");
        } else {
            System.out.println(frase.conversar(escolha));
            setEnergia(getEnergia() + 2);
            setHumor("Feliz");
            System.out.println("Sua Energia ---> " + getEnergia());
            System.out.println("Seu Humor   ---> " + getHumor());
        }
    }

    @Override
    public void tomaSol(char escolha) {

        if (getTemperatura() == 10) {
            System.out.println("O Skeep já está bem quentinho, ele não precisa se Sol");
        } else {
            System.out.println(frase.conversar(escolha));
            setVelocidade(getVelocidade() + 5);
            if (getEnergia() >= 1) {
                setEnergia(getEnergia() - 1);
            }
            setHumor("Feliz");
            setTemperatura(getTemperatura() + 5);
            System.out.println("Sua Velocidade  ---> " + getVelocidade());
            System.out.println("Seu Humor       ---> " + getHumor());
            System.out.println("Sua Temperatura ---> " + getTemperatura());
            System.out.println("Sua Energia     ---> " + getEnergia());
        }

    }

    @Override
    public void ficaNaSombar(char escolha) {

        if (getEnergia() == 10) {
            System.out.println("O Skeep está cheio de energia, vamos brincar!");
        } else {
            System.out.println(frase.conversar(escolha));
            setEnergia(getEnergia() + 2);
            setHumor("Triste");
            System.out.println("Sua Energia ---> " + getEnergia());
            System.out.println("Seu Humor   ---> " + getHumor());
        }
    }

    @Override
    public void brincar(char escolha) {
        if (getEnergia() == 0) {
            System.out.println("O Skeep está cansado para brincar, que tal comer alguma coisa?");
        } else {
            System.out.println(frase.conversar(escolha));
            setEnergia(getEnergia() - 2);
            setHumor("Feliz");
            System.out.println("Sua Energia ---> " + getEnergia());
            System.out.println("Seu Humor   ---> " + getHumor());
        }
    }
}
