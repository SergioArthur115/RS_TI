package Classes4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Notas notas = new Notas();
        System.out.println("Informe o nome do aluno: ");
        notas.nomeAluno = ler.next();
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe a " + (i + 1) + "ª nota:");
            notas.notas.add(ler.nextFloat());
            notas.media += notas.notas.get(i);
        }
        notas.calculaMedia();
        notas.mostrarResultado();
    }
}
