package Classes2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();
        System.out.println("Digite seu nome: ");
        cadastro.nome = ler.next();
        System.out.println("Digite seu sobrenome: ");
        cadastro.sobreNome = ler.next();
        System.out.println("Digite sua idade: ");
        cadastro.idade = ler.nextInt();
        System.out.println("Digite seu telefone: ");
        cadastro.telefone = ler.next();
        System.out.println("Digite seu endereço: ");
        cadastro.endereco = ler.next();
        System.out.println("Digite sua cidade: ");
        cadastro.cidade = ler.next();
        System.out.println("Digite seu bairro: ");
        cadastro.bairro = ler.next();
        System.out.println("Digite seu estado: ");
        cadastro.estado = ler.next();
        System.out.println("Digite seu rg: ");
        cadastro.rg = ler.next();
        System.out.println("Digite seu cpf: ");
        cadastro.cpf = ler.next();
        System.out.println("------------------");
        cadastro.CadastroUsuario();
    }
}
