package Classes7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        
        System.out.println("Informe o primeiro número: ");
        calc.n1=sc.nextFloat();

        System.out.println("Menu Calculadora");
        System.out.println("+  Adição");
        System.out.println("-  Subtração");
        System.out.println("*  Multiplicação");
        System.out.println("/  Divisão");
        System.out.println("Escolha a opção: ");
        calc.opcao=sc.next();

        System.out.println("Informe o segundo número: ");
        calc.n2=sc.nextFloat();
        calc.fazCalculo();
        System.out.println("Resultado: "+calc.result);
    }
}
