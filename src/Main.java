import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Character.reverseBytes;
import static java.lang.Character.toUpperCase;
import static java.util.Collections.reverse;

class Main{
    static void main() {



        StringBuilder testando = new StringBuilder();
        IPalidromo converte = str -> str.equals(new StringBuilder(str).reverse().toString());
        System.out.println(converte.reverso("radar"));
        System.out.println(converte.reverso("java"));
    }
}