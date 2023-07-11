package Classes4;

import java.util.ArrayList;

public class Notas {
    public float media;
    public String nomeAluno;
    public ArrayList<Float> notas = new ArrayList<>();

    public float calculaMedia() {
        float returnValue = this.media / 5;
        return returnValue;
    }

    public void mostrarResultado() {
        System.out.println("Nome: " + this.nomeAluno);
        System.out.println("Notas: " + this.notas);
        System.out.println("Media: " + this.media);
        System.out.print("Status: ");
        if (calculaMedia() >= 7) {
            System.out.println("Aprovado");
        } else if (calculaMedia() >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }

}
