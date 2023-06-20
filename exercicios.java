import java.util.Scanner;

public class exercicios {
    public static void main(final String[] args) {
        Scanner leia = new Scanner(System.in);
        int op = 99;
        System.out.println("|Menu|");
        System.out.println("Digite 1 para ver o primeiro programa:");
        System.out.println("Digite 2 para ver o programa de dados pessoais:");
        System.out.println("Digite 3 para ver o programa de dados pessoais completos:");
        System.out.println("Digite 4 para ver o programa de somar dois numeros:");
        System.out.println("Digite 5 para ver o programa de calcular a media:");
        System.out.println("Digite 0 para sair: ");
        op = leia.nextInt();
        switch (op) {
            case 1:
                primeiroPrograma();
                break;

            case 2:
                dadosPessoais();
                break;
            case 3:
                dadosPessoaisCompletos();
                break;
            case 4:
                somaNum();
                break;
            case 5:
                mediaAluno();
                break;
            case 0:
                System.out.println("Fim do Programa!");
                break;
            default:
                System.out.println("Entrada Inválida!!!");
                break;
        }
    }

    public static void primeiroPrograma() {
        // primeiro programa em java
        // Disciplina : [Linguagem e Lógica de Programação]
        // Professor : Miguel Matiolla
        // Descrição : Primeiro programa utilizando o Portugol
        // Autor(a) : eu mesmo
        // Data atual : 19/06/2023

        // Inicio do nosso programa para imprimir textos na tela
        // Comando System.out.println - ele escreve na tela e já quebra a linha

        System.out.println("Hello World!!!");
        System.out.println("Meu primeiro programa em java");
        System.out.println("Que emoção kkkkk!!!");

        // Comando System.out.print - ele escreve na tela mas não quebra a linha
        System.out.print("Hello World!!!");
        System.out.print("Meu primeiro programa em java!!!");
        System.out.print("Que emoção kkkkk!!!");

        System.out.print("\nMeu nome é ");
        System.out.print("Sérgio");
    }

    public static void dadosPessoais() {
        // Programa para realizar um cadastro básico
        Scanner leia = new Scanner(System.in);
        String nome, sobrenome;
        int idade;
        System.out.println("|Sistema de cadastro básico|");
        System.out.println("Informe seu nome: ");
        nome = leia.nextLine();
        System.out.println("Informe seu sobrenome: ");
        sobrenome = leia.nextLine();
        System.out.println("Informe sua idade: ");
        idade = leia.nextInt();
        System.out.println("-----------------------------");
        System.out.println("Seu nome é: " + nome);
        System.out.println("Seu sobrenome é: " + sobrenome);
        System.out.println("Sua idade é: " + idade);
    }

    public static void dadosPessoaisCompletos() {
        // Programa para realizar um cadastro básico
        Scanner leia = new Scanner(System.in);
        String nome, sobrenome, cpf, sexo, rg, endereco, cidade;
        int idade;
        System.out.println("|Sistema de cadastro básico|");
        System.out.println("Informe seu nome: ");
        nome = leia.nextLine();
        System.out.println("Informe seu sobrenome: ");
        sobrenome = leia.nextLine();
        System.out.println("Informe seu sexo: ");
        sexo = leia.nextLine();
        System.out.println("Informe seu cpf: ");
        cpf = leia.nextLine();
        System.out.println("Informe seu rg: ");
        rg = leia.nextLine();
        System.out.println("Informe seu endereco: ");
        endereco = leia.nextLine();
        System.out.println("Informe seu cidade: ");
        cidade = leia.nextLine();
        System.out.println("Informe sua idade: ");
        idade = leia.nextInt();
        System.out.println("-----------------------------");
        System.out.println("Seu nome é: " + nome);
        System.out.println("Seu sobrenome é: " + sobrenome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu sexo é: " + sexo);
        System.out.println("Seu cpf é: " + cpf);
        System.out.println("Seu rg é: " + rg);
        System.out.println("Seu endereco é: " + endereco);
        System.out.println("Sua cidade é: " + cidade);
    }

    public static void somaNum() {
        // Programa para somar dois numeros inteiros
        Scanner leia = new Scanner(System.in);
        int num1, num2, soma;
        System.out.println("Informe o primeiro número: ");
        num1 = leia.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = leia.nextInt();
        soma = num1 + num2;
        System.out.println("A soma dos numeros solicitados é: " + soma);
    }

    public static void mediaAluno() {
        Scanner leia = new Scanner(System.in);
        float notas[] = {0,0,0,0,0}, media = 0;
        String nomeAluno;

        System.out.println("Informe o nome do aluno: ");
        nomeAluno = leia.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe a " + (i + 1) + "ª nota:");
            notas[i] = leia.nextInt();
            media += notas[i];
        }
        media = media / 5;
        System.out.println(nomeAluno + " para as notas: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(notas[i]);
        }
        System.out.println("Sua media foi de :"+media);
    }
}
