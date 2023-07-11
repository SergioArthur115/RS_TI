package Classes7;

public class Calculadora {
    public String opcao;
    public float n1, n2, result = 0;

    public float fazCalculo() {
        switch (opcao) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                result = n1 / n2;
                break;
            default:
                System.out.println("Opção inválida");
        }
        return result;
    }
}
