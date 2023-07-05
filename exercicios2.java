import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class exercicios2 {
    private static Scanner leia = new Scanner(System.in);
    private static DecimalFormat df = new DecimalFormat("0.00");

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
        System.out.println("Digite 13 para ver o programa de verificação de idade:");
        System.out.println("Digite 14 para ver o programa de chutar a cor do time: ");
        System.out.println("Digite 15 para ver o programa de comprar trakinas: ");
        System.out.println("Digite 16 para ver o programa de indetifica par ou impar: ");
        System.out.println("Digite 17 para ver o programa de calcular a media e o status: ");
        System.out.println("Digite 18 para ver o programa de calcular a media e o status completo: ");
        System.out.println("Digite 19 para ver o programa de calculadora: ");
        System.out.println("Digite 20 para ver o programa de calculadora com simbolos: ");
        System.out.println("Digite 21 para ver o programa de comprar picoles: ");
        System.out.println("Digite 22 para ver o programa de calcular media 2: ");
        System.out.println("Digite 23 para ver o programa de escolher carro: ");
        System.out.println("Digite 24 para ver o programa de venda de imóvel: ");
        System.out.println("Digite 25 para ver o programa de compra com cartão: ");
        System.out.println("Digite 26 para ver o programa de escolher o biscoito ");
        System.out.println("Digite 0 para sair: ");
        System.out.println("Digite a opção: ");
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
                verificaIdade();
                break;
            case 14:
                acertaTime();
                break;
            case 15:
                compraTrakinas();
                break;
            case 16:
                parImpar();
                break;
            case 17:
                calculaMediaStatus();
                break;
            case 18:
                calculaMediaStatusCompleto();
                break;
            case 19:
                calculadora();
                break;
            case 20:
                calculadoraSimbolo();
                break;
            case 21:
                compraPicole();
                break;
            case 22:
                calculaMediaStatusCompleto2();
                break;
            case 23:
                escolhaCarro();
                break;
            case 24:
                vendaImovel();
                break;
            case 25:
                compraCartao();
                break;
            case 26:
                escolhaBiscoito();
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

    public static void verificaIdade() {
        int idade;
        String nome;

        System.out.println("Informe o seu nome: ");
        nome = leia.next();
        System.out.println("Informe a sua idade: ");
        idade = leia.nextInt();
        if (idade >= 18) {
            System.out.println(nome + " voce está habilitado a tirar a carteira de motorista!");
        } else {
            System.out.println(nome + " voce não está habilitado a tirar a carteira de motorista!");
        }
    }

    public static void acertaTime() {
        String nome, cor;

        System.out.println("Informe o seu nome: ");
        nome = leia.next();
        System.out.println("Informe a cor do time: ");
        cor = leia.next().toUpperCase();

        if (cor.equals("VERMELHO")) {
            System.out.println(nome + " voce acertou a cor do Inter!");
        } else {
            System.out.println(nome + " voce errou a cor do Inter!");
        }
    }

    public static void compraTrakinas() {
        int qtdTrakinas;
        double total;
        System.out.println("Informe a quantidade de trakinas a ser comprada: ");
        qtdTrakinas = leia.nextInt();
        if (qtdTrakinas >= 10) {
            total = qtdTrakinas * 3.0;
        } else {
            total = qtdTrakinas * 3.5;
        }
        System.out.println("Para a quantidade de " + qtdTrakinas + " trakinas o valor total foi de :" + df.format(total)
                + " reais");
    }

    public static void parImpar() {
        int num;
        System.out.println("Informe o numero");
        num = leia.nextInt();
        if (num % 2 == 0) {
            System.out.println("O numero informado é par!");
        } else {
            System.out.println("O numero informado é impar!");
        }
    }

    private static void calculaMediaStatus() {
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
            System.out.println("E você foi aprovado!");
        } else {
            System.out.println("E você foi reprovado!");
        }
    }

    private static void calculaMediaStatusCompleto() {
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
            System.out.println("E você foi aprovado!");
        } else if (media >= 5) {
            System.out.println("E você está em recuperação!");
        } else {
            System.out.println("E você foi reprovado!");
        }
    }

    private static void calculadora() {
        int op = 99;
        double num1, num2;
        System.out.println("Digite o primeiro número: ");
        num1 = leia.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = leia.nextDouble();
        System.out.println("Digite 1 para realizar a operação de adição");
        System.out.println("Digite 2 para realizar a operação de subtração");
        System.out.println("Digite 3 para realizar a operação de multiplicação");
        System.out.println("Digite 4 para realizar a operação de divisão");
        System.out.println("Digite a opção: ");
        op = leia.nextInt();
        switch (op) {
            case 1:
                System.out.println("O resultado da soma foi: " + (df.format(num1 + num2)));
                break;
            case 2:
                System.out.println("O resultado da subtração foi: " + (df.format(num1 - num2)));
                break;
            case 3:
                System.out.println("O resultado da multiplicação foi: " + (df.format(num1 * num2)));
                break;
            case 4:
                System.out.println("O resultado da divisão foi: " + (df.format(num1 / num2)));
                break;
            default:
                System.out.println("Opção Inválida!!!");
                break;
        }
    }

    public static void calculadoraSimbolo() {
        double num1, num2;
        String operacao;
        System.out.println("Digite o primeiro número: ");
        num1 = leia.nextDouble();
        leia.skip("\\R");
        System.out.println("Digite a operação matematica (+ - * /) : ");
        operacao = leia.nextLine();
        System.out.println("Digite o segundo número: ");
        num2 = leia.nextDouble();
        if (operacao.equals("+")) {
            System.out.println("O resultado da soma foi: " + (df.format(num1 + num2)));
        } else if (operacao.equals("-")) {
            System.out.println("O resultado da subtração foi: " + (df.format(num1 - num2)));
        } else if (operacao.equals("*")) {
            System.out.println("O resultado da multiplicação foi: " + (df.format(num1 * num2)));
        } else if (operacao.equals("/")) {
            System.out.println("O resultado da divisão foi: " + (df.format(num1 / num2)));
        } else {
            System.out.println("Opção Inválida!!!");
        }
    }

    public static void compraPicole() {
        int op = 0, qtdPicole;
        double total = 0;
        boolean status = true;
        while (status) {

            System.out.println("Digite 1 para escolher o picole de Uva R$ 1,00");
            System.out.println("Digite 2 para escolher o picole de Laranja R$ 1,25");
            System.out.println("Digite 3 para escolher o picole de Milho R$ 1,50");
            System.out.println("Digite 0 para sair");
            System.out.println("Digite a opção: ");
            qtdPicole = leia.nextInt();
            System.out.println("Informe a quantidade de picoles a ser comprada: ");
            switch (op) {
                case 1:
                    total = qtdPicole + total;
                    break;
                case 2:
                    total = qtdPicole * 1.25 + total;
                    break;
                case 3:
                    total = qtdPicole * 1.50 + total;
                    break;
                case 0:
                    status = false;
                    System.out.println("Programa Finalizado!!!");
                    break;
                default:
                    status = false;
                    System.out.println("Entrada Invalida!!!");
                    break;
            }

        }
        System.out.println("O total foi de : " + df.format(total));
    }

    public static void calculaMediaStatusCompleto2() {
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
        if (media >= 7 && media <= 10) {
            System.out.println("E você foi aprovado!");
        } else if (media >= 5) {
            System.out.println("E você está em recuperação!");
        } else if (media < 5 && media >= 0) {
            System.out.println("E você foi reprovado!");
        } else {
            System.out.println("ERROR 404!!!");
        }
    }

    private static void escolhaCarro() {
        String veiculo;
        System.out.println("Escolha qual veiculo voce acha mais bonito(Fusca, Opala, Ferrari ou Porsche)");
        veiculo = leia.next().toLowerCase();
        if (veiculo.equals("fusca") || veiculo.equals("opala")) {
            System.out.println("Voce gosta de carros antigos.");
        } else if (veiculo.equals("ferrari") || veiculo.equals("porsche")) {
            System.out.println("Voce gosta de carros esportivos.");
        } else {
            System.out.println("Carro não cadastrado");
        }
    }

    private static void vendaImovel() {
        String nome;
        double valor;
        boolean status;
        int op = 99;
        do {
            status = false;
            System.out.println("Informe seu nome:");
            nome = leia.next();
            System.out.println("Informe o valor do imóvel:");
            valor = lerNumFLOAT();
            if (valor >= 0) {
                System.out.print(nome + " sua comissão foi de: R$");
            }
            if (valor >= 100000.00) {
                System.out.println(df.format(valor * 0.2));
            } else if (valor >= 70000.00) {
                System.out.println(df.format(valor * 0.15));
            } else if (valor >= 0) {
                System.out.println(df.format(valor * 0.10));
            } else {
                System.out.println("ERROR!!!");
                System.out.println("Deseja tentar novamente?");
                System.out.println("Digite 1 para sim e 2 para não");
                op = leiaNumINT();
                if (op == 1) {
                    status = true;
                } else {
                    System.out.println("Fim do Programa!!!");
                }
            }
        } while (status);
    }

    public static int leiaNumINT() {
        int num = 99;
        boolean leu = false;
        Scanner lerNum = new Scanner(System.in);
        while (!leu) {
            try {
                num = lerNum.nextInt();
                leu = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, tente novamente!");
                lerNum.nextLine();
            }
        }
        return num;
    }

    public static float lerNumFLOAT() {
        float num = 99;
        boolean leu = false;
        Scanner lerNum = new Scanner(System.in);
        while (!leu) {
            try {
                num = lerNum.nextInt();
                leu = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, tente novamente!");
                lerNum.nextLine();
            }
        }
        return num;
    }

    public static void compraCartao() {
        String nome, forma = null;
        double valor = 0, total = 0;
        int op;
        do {
            System.out.println("1 Venda a vista - desconto 10%");
            System.out.println("2 Venda a prazo 30 dias- desconto 5%");
            System.out.println("3 Venda a prazo 60 dias- sem desconto");
            System.out.println("4 Venda a prazo 90 dias - acréscimo 5%");
            System.out.println("5 Venda com cartão de débito - desconto 8%");
            System.out.println("6 Venda com cartão de crédito - desconto 7%");
            System.out.println("o - Sair");
            op = leiaNumINT();
            System.out.println("Informe o nome do cliente: ");
            nome = leia.next();
            System.out.println("Informe o valor da compra: ");
            valor = lerNumFLOAT();
            switch (op) {
                case 1:
                    total = valor * 0.9;
                    forma = "Á Vista 10%";
                    op = 0;
                    break;
                case 2:
                    total = valor * 0.95;
                    forma = "Á Prazo 30 dias - desconto 5%";
                    op = 0;
                    break;
                case 3:
                    total = valor;
                    forma = "Á Prazo 60 dias - sem desconto";
                    op = 0;
                    break;
                case 4:
                    total = valor * 1.05;
                    forma = "Á Prazo 90 dias - acréscimo 5%";
                    op = 0;
                    break;
                case 5:
                    total = valor * 0.92;
                    forma = "Débito - desconto 8%";
                    op = 0;
                    break;
                case 6:
                    total = valor * 0.93;
                    forma = "Crédito - desconto 7%";
                    op = 0;
                    break;
                default:
                    System.out.println("Entrada Invalida!!!");
                    break;
            }
        } while (op != 0);
        System.out.println("Cliente: " + nome);
        System.out.println("Forma de Pagamento: " + forma);
        System.out.println("Valor: R$" + df.format(total));
    }

    public static void escolhaBiscoito() {
        String nome;
        System.out.println("Escolha  seu biscoito favorito (Atenados, Cartoon, Oreo ou Bono)");
        nome = leia.next().toLowerCase();
        if (nome.equals("atenados") || nome.equals("cartoon")) {
            System.out.println("Voce escolheu os biscoitos mais baratos.");
        } else if (nome.equals("oreo") || nome.equals("bono")) {
            System.out.println("Voce escolheu os biscoitos mais caros.");
        } else {
            System.out.println("O biscoito escolhido não está na lista!");
        }
    }
}
