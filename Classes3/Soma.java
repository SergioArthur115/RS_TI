package Classes3;

public class Soma {
    public int n1, n2, soma;

    public void somar() {
        this.soma = this.n1 + this.n2;
    }

    public void Mostrar() {
        System.out.println("## Resultado da soma ## ");
        System.out.println("O primeiro número digitado foi "+this.n1);
        System.out.println("O segundo número digitado foi "+this.n2);
        System.out.println("O resultado da soma foi "+this.soma);
    }
}
