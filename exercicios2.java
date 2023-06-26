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
        System.out.println("Digite 6 para ver o programa de calcular a media:");
        System.out.println("Digite 7 para ver o programa de converter reais em dolares:");
        System.out.println("Digite 8 para ver o programa de cartao de crédito:");
        System.out.println("Digite 9 para ver o programa de cartao de crédito com taxa ajustavel:");
        System.out.println("Digite 10 para ver o programa de venda de carros:");
        System.out.println("Digite 11 para ver o programa de calcular a media com o status de aprovado ou reprovado:");
        System.out.println("Digite 12 para ver o programa que verifica se o número é par ou impar:");
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
                // mediaAluno();
                break;
            case 6:
                // conversorRealToDolar();
                break;
            case 7:
                // cartaoCredito();
                break;
            case 8:
                // cartaoCredito2();
                break;
            case 9:
                // vendaCarro();
                break;
            case 10:
                // mediaAlunoAvaliado();
                break;
            case 11:
                // verificaNum();
                break;
            case 12:
                // fruteira();
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
        String nome,sobreNome,endereco,bairro,cidade,estado,cpf,rg, telefone;
        int idade,numResidencia;

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
        telefone=leia.next();
        System.out.println("Informe seu endereco: ");
        endereco = leia.next();
        System.out.println("Informe seu bairro");
        bairro=leia.next();
        System.out.println("Informe seu cidade: ");
        cidade = leia.next();
        System.out.println("Informe o seu estado: ");
        estado=leia.next();
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
}