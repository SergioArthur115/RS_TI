package Classes;

public class Cadastro {
    public String nome;
    public long cpf;
    public long rg;
    public String endereco;
    public int idade;

    public void CadastroUsuario() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Idade: " + this.idade);
        System.out.println("RG: " + this.rg);
        System.out.println("CPF: " + this.cpf);
    }
}