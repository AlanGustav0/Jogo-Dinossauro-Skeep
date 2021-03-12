package entitys;

import java.util.stream.IntStream;

public class Simbolos {

    public void linhasSaudacao(String saudacao){
        IntStream.range(0, saudacao.length()).forEach(valor -> System.out.print("*"));
        System.out.println();
    }

    public void linha(){
        IntStream.range(0, 37).forEach(valor -> System.out.print("*"));
        System.out.println();
    }
}
