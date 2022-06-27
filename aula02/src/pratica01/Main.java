package pratica01;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoaConstrutorVazio;
        Pessoa pessoaConstrutorIncompleto;
        Pessoa pessoaConstrutorCompleto;

        pessoaConstrutorVazio = new Pessoa();
        pessoaConstrutorIncompleto = new Pessoa(32, "Thomas Edson", "1234A");
        pessoaConstrutorCompleto = new Pessoa(26, "Nicholas Tesla", "4321B", 66.5, 1.8);

        //Pessoa pessoaConstrutorErro;
        //pessoaConstrutorErro = new Pessoa(32, "Errorex");

        System.out.println(pessoaConstrutorCompleto.verificaIdadeECalculaIMC());

        System.out.println(pessoaConstrutorCompleto.toString());
    }
}
