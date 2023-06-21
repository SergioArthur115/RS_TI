import java.util.ArrayList;
import java.util.Scanner;

public class exercicios {
    private static Scanner leia = new Scanner(System.in);

    public static void main(final String[] args) {
        int op = 99;
        System.out.println("|Sistema de sistemas de serviços faz tudo|");
        System.out.println("Digite 1 para ver o primeiro programa:");
        System.out.println("Digite 2 para ver o programa de dados pessoais:");
        System.out.println("Digite 3 para ver o programa de dados pessoais completos:");
        System.out.println("Digite 4 para ver o programa de somar dois numeros:");
        System.out.println("Digite 5 para ver o programa de calcular a media:");
        System.out.println("Digite 6 para ver o programa de converter reais em dolares:");
        System.out.println("Digite 7 para ver o programa de cartao de crédito:");
        System.out.println("Digite 8 para ver o programa de cartao de crédito com taxa ajustavel:");
        System.out.println("Digite 9 para ver o programa de venda de carros:");
        System.out.println("Digite 10 para ver o programa de calcular a media com o status de aprovado ou reprovado:");
        System.out.println("Digite 11 para ver o programa que verifica se o número é par ou impar:");
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
            case 6:
                conversorRealToDolar();
                break;
            case 7:
                cartaoCredito();
                break;
            case 8:
                cartaoCredito2();
                break;
            case 9:
                vendaCarro();
                break;
            case 10:
                mediaAlunoAvaliado();
                break;
            case 11:
                verificaNum();
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
        String nome, sobrenome;
        int idade;
        System.out.println("|Sistema de cadastro básico|");
        System.out.println("Informe seu nome: ");
        nome = leia.next();
        System.out.println("Informe seu sobrenome: ");
        sobrenome = leia.next();
        System.out.println("Informe sua idade: ");
        idade = leia.nextInt();
        System.out.println("-----------------------------");
        System.out.println("Seu nome é: " + nome);
        System.out.println("Seu sobrenome é: " + sobrenome);
        System.out.println("Sua idade é: " + idade);
    }

    public static void dadosPessoaisCompletos() {
        // Programa para realizar um cadastro básico
        String nome, sobrenome, cpf, sexo, rg, endereco, cidade;
        int idade;
        System.out.println("|Sistema de cadastro básico|");
        System.out.println("Informe seu nome: ");
        nome = leia.next();
        System.out.println("Informe seu sobrenome: ");
        sobrenome = leia.next();
        System.out.println("Informe seu sexo: ");
        sexo = leia.next();
        System.out.println("Informe seu cpf: ");
        cpf = leia.next();
        System.out.println("Informe seu rg: ");
        rg = leia.next();
        System.out.println("Informe seu endereco: ");
        endereco = leia.next();
        System.out.println("Informe seu cidade: ");
        cidade = leia.next();
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
        int num1, num2, soma;
        System.out.println("Informe o primeiro número: ");
        num1 = leia.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = leia.nextInt();
        soma = num1 + num2;
        System.out.println("A soma dos numeros solicitados é: " + soma);
    }

    public static void mediaAluno() {
        // Programa para calcular a media de um aluno
        float media = 0;
        String nomeAluno;
        ArrayList<Float> notas = new ArrayList<>();

        System.out.println("Informe o nome do aluno: ");
        nomeAluno = leia.next();
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe a " + (i + 1) + "ª nota:");
            notas.add(leia.nextFloat());
            media += notas.get(i);
        }
        media = media / 5;
        System.out.println(nomeAluno + " para as notas: " + notas);
        System.out.println("Sua media foi de :" + media);
    }

    public static void conversorRealToDolar() {
        // Programa para coverter de real para dolar
        float real, cotacao;
        System.out.println("Informe o valor em reais: ");
        real = leia.nextFloat();
        System.out.println("Informe a cotação do dolar: ");
        cotacao = leia.nextFloat();
        System.out.println("O valor em dolares é: " + Math.round(real / cotacao));
    }

    public static void cartaoCredito() {
        // Programa para calcular os juros do cartao de credito
        int tempo;
        double total, prestacao, taxa, juros;
        System.out.println("Informe o valor da prestação: ");
        prestacao = leia.nextFloat();
        System.out.println("Informe quantos dias a prestação está vencida: ");
        tempo = leia.nextInt();
        taxa = 0.02;
        total = prestacao + (prestacao * taxa * tempo);
        juros = total - prestacao;
        System.out.println("Total de taxa de juros: " + juros);
        System.out.println("Total da prestação: " + total);
    }

    public static void cartaoCredito2() {
        // Programa para calcular os juros do cartao de credito
        int tempo;
        double total, sub, prestacao, taxa, juros;
        System.out.println("Informe o valor da prestação: ");
        prestacao = leia.nextFloat();
        System.out.println("Informe quantos dias a prestação está vencida: ");
        tempo = leia.nextInt();
        System.out.println("Informe o valor da taxa de juros mensal: ");
        taxa = leia.nextFloat();
        sub = (taxa / 30) / 100;
        total = prestacao + (prestacao * sub * tempo);
        juros = total - prestacao;
        System.out.println("Total de taxa de juros: " + juros);
        System.out.println("Total da prestação: " + total);
    }

    public static void vendaCarro() {
        // Programa para realizar a venda de um carro
        String nomeAuto;
        double precoFabrica, porcVendedor, imposto, total;

        System.out.println("Informe o nome do automóvel: ");
        nomeAuto = leia.next();
        System.out.println("Informe o preço de fábrica do automóvel: ");
        precoFabrica = leia.nextDouble();
        porcVendedor = precoFabrica * 0.45;
        imposto = precoFabrica * 0.28;
        total = precoFabrica + porcVendedor + imposto;
        System.out.println("Para o automóvel: " + nomeAuto);
        System.out.println("os sub-totais foram: ");
        System.out.println("\tPorcentagem do revendedor: " + Math.round(porcVendedor));
        System.out.println("\tImposto: " + Math.round(imposto));
        System.out.println("Total a pagar: " + Math.round(total));
    }

    public static void mediaAlunoAvaliado() {
        // Programa para calcular a media de um aluno e o status de aprovado ou
        // reprovado
        float media = 0;
        String nomeAluno;
        ArrayList<Float> notas = new ArrayList<>();

        System.out.println("Informe o nome do aluno: ");
        nomeAluno = leia.next();
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe a " + (i + 1) + "ª nota:");
            notas.add(leia.nextFloat());
            media += notas.get(i);
        }
        media = media / 5;
        System.out.println(nomeAluno + " para as notas: " + notas);
        System.out.println("Sua media foi de :" + media);
        if (media >= 7) {
            System.out.println("Voce foi aprovado!!!");
        } else {
            System.out.println("Voce foi reprovado!!!");
        }
    }

    public static void verificaNum() {
        // Programa que verifica se o numero informado é par ou impar
        int num;
        System.out.println("Informe um número: ");
        num = leia.nextInt();
        if (num % 2 == 0) {
            System.out.println("O número " + num + " é par!");
        } else if (num % 3 == 0) {
            System.out.println("O número " + num + " é impar!");
        } else {
            System.out.println("ERROR 404");
        }
    }
}
