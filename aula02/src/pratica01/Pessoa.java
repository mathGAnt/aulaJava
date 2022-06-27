package pratica01;

public class Pessoa {
    private int idade;
    private String nome, ID;
    private double peso, altura;


    public Pessoa() {
    }

    public Pessoa(int idade, String nome, String ID) {
        this.idade = idade;
        this.nome = nome;
        this.ID = ID;
    }

    public Pessoa(int idade, String nome, String ID, double peso, double altura) {
        this.idade = idade;
        this.nome = nome;
        this.ID = ID;
        this.peso = peso;
        this.altura = altura;
    }

    private int calcularIMC(double peso, double altura){
        double IMC = peso/(Math.pow(altura, 2));
        if(IMC < 20){
            return -1;
        }else{
            return (IMC > 20 && IMC <25) ? 0:1;
        }
    }

    private boolean ehMaiorIdade(){
        return (this.idade >= 18) ? true:false;
    }

    @Override
    public String toString() {
        return  "Dados completos:\n" +
                "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nID:" + ID +
                "\nPeso: " + peso + "Kg" +
                "\nAltura: " + altura + "m" +
                "\n" + this.verificaIdadeECalculaIMC() ;
    }

    protected String verificaIdadeECalculaIMC(){
        int IMC = this.calcularIMC(this.peso, this.altura);
        if(IMC == -1){
            return this.ehMaiorIdade() ? this.nome + " eh maior de idade e estah abaixo do peso":this.nome + " eh menor de idade e estah abaixo do peso.";
        }else if(IMC == 0) {
            return this.ehMaiorIdade() ? this.nome + " eh maior de idade e possui um peso saudavel.":this.nome + " eh menor de idade e possui um peso saudavel.";
        }else{
            return this.ehMaiorIdade() ? this.nome + " eh maior de idade e possui sobrepeso.":this.nome + " eh menor de idade e possui sobrepeso.";
        }
    }


}
