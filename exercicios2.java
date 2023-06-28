import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class exercicios2 {
    private static Scanner leia = new Scanner(System.in);

    public static void main(final String[] args) {
        int op = 99;
        System.out.println("|Sistema de sistemas de serviços faz tudo|");
        System.out.println("Digite 1 para ver o primeiro programa:");
        System.out.println("Digite 2 para ver o programa de dados pessoais:");
        System.out.println("Digite 3 para ver o programa de variaveis");
        System.out.println("Digite 4 para ver o programa de dados pessoais completos:");
        System.out.println("Digite 5 para ver o programa de somar dois numeros:");
        System.out.println("Digite 6 para ver o programa de potencia:");
        System.out.println("Digite 7 para ver o programa de calcular a media:");
        System.out.println("Digite 8 para ver o programa de converter real para dolar:");
        System.out.println("Digite 9 para ver o programa de venda de carros:");
        System.out.println("Digite 10 para ver o programa de cartao de crédito:");
        System.out.println("Digite 11 para ver o programa de cartao de cretido com taxa ajustavel: ");
        System.out.println("Digite 12 para ver o programa de venda de produtos: ");
        System.out.println("Digite 13 para ver o programa de fruteira:");
        System.out.println("Digite 14 para ver o programa de carrinho de picolé");
        System.out.println("Digite 15 para ver o programa de calculadora");
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
                variaveis();
                break;
            case 4:
                dadosPessoaisCompletos();
                break;
            case 5:
                somaNum();
                break;
            case 6:
                potencia();
                break;
            case 7:
                calculaMedia();
                break;
            case 8:
                conversorRealToDolar();
                break;
            case 9:
                vendaCarro();
                break;
            case 10:
                calculaJuros();
                break;
            case 11:
                calculaJurosAjustavel();
                break;
            case 12:
                vendaProduto();
                break;
            case 13:
                // carrinhoPicole();
                break;
            case 14:
                // calculadora();
                break;
            case 0:
                System.out.println("Fim do Programa!");
                break;
            default:
                System.out.println("Entrada Inválida!!!");
                break;
        }
    }

    private static void primeiroPrograma() {
        System.out.println("Alô mundo!!!");
        System.out.println("Meu primeiro programa em Java!!!");
    }

    private static void dadosPessoais() {
        System.out.println("Informações sobre o aluno");
        System.out.println("Meu nome é: Sérgio");
        System.out.println("Minha idade é: 23 anos");
        System.out.println("Minha residência é Aqui");
        System.out.println("Número: 2222, ap 22");
        System.out.println("Bairro: Ali");
        System.out.println("Cidade: Alá");
        System.out.println("Estado: Acolá");
    }

    private static void variaveis() {
        String nome, signo;
        int idade;

        System.out.println("Informe seu nome:");
        nome = leia.next();
        System.out.println("Informe sua idade: ");
        idade = leia.nextInt();

        leia.skip("\\R");

        System.out.println("Informe seu signo: ");
        signo = leia.nextLine();

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu signo é : " + signo);
    }

    private static void dadosPessoaisCompletos() {
        String nome, sobreNome, endereco, bairro, cidade, estado, cpf, rg, telefone;
        int idade, numResidencia;

        System.out.println("|Sistema de cadastro básico|");
        System.out.println("Informe seu nome: ");
        nome = leia.next();
        System.out.println("Informe seu sobrenome: ");
        sobreNome = leia.next();
        System.out.println("Informe sua idade: ");
        idade = leia.nextInt();
        leia.skip("\\R");
        System.out.println("Informe seu cpf: ");
        cpf = leia.next();
        System.out.println("Informe seu rg: ");
        rg = leia.next();
        System.out.println("Informe o seu número de telefone: ");
        telefone = leia.next();
        System.out.println("Informe seu endereco: ");
        endereco = leia.next();
        System.out.println("Informe seu bairro");
        bairro = leia.next();
        System.out.println("Informe seu cidade: ");
        cidade = leia.next();
        System.out.println("Informe o seu estado: ");
        estado = leia.next();
        System.out.println("Informe o número da residencia: ");
        numResidencia = leia.nextInt();

        System.out.println("-----------------------------");
        System.out.println("Seu nome é: " + nome);
        System.out.println("Seu sobrenome é: " + sobreNome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu cpf é: " + cpf);
        System.out.println("Seu rg é: " + rg);
        System.out.println("Seu telefone é: " + telefone);
        System.out.println("Seu endereco é: " + endereco);
        System.out.println("Seu bairro é: " + bairro);
        System.out.println("Sua cidade é: " + cidade);
        System.out.println("Seu estado é: " + estado);
        System.out.println("Seu número de residência é: " + numResidencia);
    }

    private static void somaNum() {
        int n1, n2, resultado;
        System.out.println("Informe o primeiro número: ");
        n1 = leia.nextInt();
        System.out.println("Informe o segundo número: ");
        n2 = leia.nextInt();
        resultado = n1 + n2;
        System.out.println("O resultado da soma foi: " + resultado);
    }

    private static void potencia() {
        int num, pot;
        System.out.println("Informe a base: ");
        num = leia.nextInt();
        System.out.println("Informe o expoente: ");
        pot = leia.nextInt();
        System.out.println("O valor da potênciação foi: " + Math.pow(num, pot));
    }

    private static void calculaMedia() {
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

    private static void conversorRealToDolar() {
        double real, cotacao;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Informe o valor em reais: ");
        real = leia.nextDouble();
        System.out.println("Informe a cotação do dolar: ");
        cotacao = leia.nextDouble();
        System.out.println("O valor em dolares é: " + df.format(real / cotacao));
    }

    public static void vendaCarro() {
        // Programa para realizar a venda de um carro
        String nomeAuto;
        double precoFabrica, porcVendedor, imposto, total;
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Informe o nome do automóvel: ");
        nomeAuto = leia.next();
        System.out.println("Informe o preço de fábrica do automóvel: ");
        precoFabrica = leia.nextDouble();
        porcVendedor = precoFabrica * 0.45;
        imposto = precoFabrica * 0.28;
        total = precoFabrica + porcVendedor + imposto;
        System.out.println("Para o automóvel: " + nomeAuto);
        System.out.println("os sub-totais foram: ");
        System.out.println("\tPorcentagem do revendedor: " + df.format(porcVendedor));
        System.out.println("\tImposto: " + df.format(imposto));
        System.out.println("Total a pagar: " + df.format(total));
    }

    public static void calculaJuros() {
        double valorPrest, total, juros;
        int qtdDias;
        System.out.println("Informe o valor da prestação: ");
        valorPrest = leia.nextDouble();
        System.out.println("Informe os dias de atraso: ");
        qtdDias = leia.nextInt();
        juros = valorPrest * 0.02 * qtdDias;
        total = juros + valorPrest;
        System.out.println("O total a pagar foi de: " + total);
        System.out.println("O valor do juros foi de: " + juros);
    }

    public static void calculaJurosAjustavel() {
        double valorPrest, total, juros, taxa;
        int qtdDias;
        System.out.println("Informe o valor da prestação: ");
        valorPrest = leia.nextDouble();
        System.out.println("Informe os dias de atraso: ");
        qtdDias = leia.nextInt();
        System.out.println("Informe a taxa: ");
        taxa = leia.nextInt();
        juros = valorPrest * ((taxa / 100) / 30) * qtdDias;
        total = juros + valorPrest;
        System.out.println("O total a pagar foi de: " + total);
        System.out.println("O valor do juros foi de: " + juros);
    }

    public static void vendaProduto() {
        String nomeProduto;
        double custoProduto, percVenda;
        System.out.println("Informe o nome do produto: ");
        nomeProduto = leia.next();
        System.out.println("Informe o custo do produto: ");
        custoProduto = leia.nextDouble();
        System.out.println("Informe o percentual de acréscimo para venda: ");
        percVenda = leia.nextDouble();
        System.out.println(
                "O produto " + nomeProduto + " custará " + (custoProduto + (custoProduto * (percVenda / 100))));
    }
}
