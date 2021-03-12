package entitys;

public class Dinossauro {

    private int energia = 0;
    private int velocidade = 0;
    private int temperatura = 0;
    private String humor = "sério";

    public Dinossauro() { }


    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public String getHumor() {
        return humor;
    }

    public void setHumor(String humor) {
        this.humor = humor;
    }

    public void pular(char escolha){ }

    public void correr(char escolha){ }

    public void comer(char escolha){ }

    public void tomaSol(char escolha){ }

    public void ficaNaSombar(char escolha){ }

    public void brincar(char escolha){ }

    public void status(){}
}
