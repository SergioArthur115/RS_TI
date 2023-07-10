package Classes3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Soma soma = new Soma();
        System.out.println("Informe o primeiro numero: ");
        soma.n1 = ler.nextInt();
        System.out.println("Informe o segundo numero: ");
        soma.n2 = ler.nextInt();

        soma.somar();
        soma.Mostrar();
    }
}
