package Classes5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Conceito c = new Conceito();

        for (int i = 0; i < 3; i++) {
            System.out.println("Informe a " + (i + 1) + "ª nota:");
            c.num.add(ler.nextDouble());
        }

        System.out.println("----------------------");
        System.out.println("Média: " + c.calculaMedia());
        c.verificaConceito();
    }
}
