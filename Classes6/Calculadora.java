package Classes6;

public class Calculadora {
    public int opcao;
    public float n1, n2, result = 0;

    public float fazCalculo() {
        switch (opcao) {
            case 1:
                result = n1 + n2;
                break;
            case 2:
                result = n1 - n2;
                break;
            case 3:
                result = n1 * n2;
                break;
            case 4:
                result = n1 / n2;
                break;
            default:
                System.out.println("Opção inválida");
        }
        return result;
    }
}
