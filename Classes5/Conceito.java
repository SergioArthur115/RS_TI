package Classes5;

import java.util.ArrayList;

public class Conceito {
    public ArrayList<Double> num = new ArrayList<>();
    public Double media;

    public double calculaMedia() {
        media = 0.0;
        for (Double i : num) {
            media += i;
        }
        media /= num.size();
        return media;
    }

    public void verificaConceito() {
        if (calculaMedia() >= 7 && calculaMedia() <= 10) {
            System.out.println("Conceito A");
        } else if (calculaMedia() >= 5 && calculaMedia() < 7) {
            System.out.println("Conceito B");
        } else {
            System.out.println("Conceito C");
        }
    }
}
