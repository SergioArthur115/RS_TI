package Classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cadastro cad = new Cadastro();

        System.out.println("Digite seu nome: ");
        cad.nome = ler.next();
        System.out.println("Digite seu endereço: ");
        cad.endereco = ler.next();
        System.out.println("Digite sua idade: ");
        cad.idade = ler.nextInt();
        System.out.println("Digite seu RG: ");
        cad.rg = ler.nextLong();
        System.out.println("Digite seu CPF: ");
        cad.cpf = ler.nextLong();
        System.out.println("-------------------------");
        cad.CadastroUsuario();
    }
}