package Classes4;

import java.util.ArrayList;

public class Notas {
    public float media;
    public String nomeAluno;
    public ArrayList<Float> notas = new ArrayList<>();

    public void calculaMedia() {
        this.media = this.media / 5;
    }

    public void mostrarResultado() {
        System.out.println("Nome: " + this.nomeAluno);
        System.out.println("Notas: "+ this.notas);
        System.out.println("Media: " + this.media);
    }


}
