import static java.lang.Character.toUpperCase;

class Main{
    static void main() {

        iMultiplicacao mult = (a,b) -> a * b;
        System.out.println(mult.executar(3,5));

        //3 - Crie uma função lambda que receba uma string
        // e a converta para letras maiúsculas.
        IConvertString maisculo = (texto) -> texto.toUpperCase();
        System.out.println(maisculo.converter("teste"));
    }
}