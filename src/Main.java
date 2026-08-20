import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Character.reverseBytes;
import static java.lang.Character.toUpperCase;
import static java.util.Collections.reverse;

class Main{
    static void main() {
        
        Scanner  teclado = new Scanner(System.in);
        System.out.println("Digite uma frase");

        StringBuilder testando = new StringBuilder();
        IPalidromo converte = (str) -> testando.reverse().isEmpty();

        System.out.println(converte.reverso("ab"));

    }
}