package Classes2;

public class Cadastro {
    public String nome;
    public String sobreNome;
    public int idade;
    public String telefone;
    public String endereco;
    public String cidade;
    public String bairro;
    public String estado;
    public String rg;
    public String cpf;

    public void CadastroUsuario() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Sobrenome: " + this.sobreNome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Bairro: " + this.bairro);
        System.out.println("Estado: " + this.estado);
        System.out.println("RG: " + this.rg);
        System.out.println("CPF: " + this.cpf);
    }
}
