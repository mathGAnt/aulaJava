package pratica02;

import jdk.jfr.Description;

class Participante {
    private int RG, idade;
    private int numCelular;
    private int numEmergencia;
    private int numParticipante;
    private double precoInscricao;
    private String nomeCompleto;
    private String tipoSanguineo;

    public Participante(int RG, int idade, int numCelular, int numEmergencia,
                        int numParticipante, String nome, String tipoSanguineo, double preco) {
        this.RG = RG;
        this.idade = idade;
        this.numCelular = numCelular;
        this.numEmergencia = numEmergencia;
        this.numParticipante = numParticipante;
        this.nomeCompleto = nome;
        this.tipoSanguineo = tipoSanguineo;
        this.precoInscricao = preco;
    }

    @Override
    public String toString() {
        return  "Participante numero: " + this.numParticipante + "\n" +
                "Nome: " + this.nomeCompleto + '\n' +
                "Idade: " + this.idade + "\n" +
                "RG: " + this.RG + "\n" +
                "Numero de celular: " + this.numCelular + "\n" +
                "Numero de emergencia: " + this.numEmergencia + "\n" +
                "Tipo sanguineo: " + this.tipoSanguineo + '\n' +
                "Preco a pagar: " + this.precoInscricao;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(int numCelular) {
        this.numCelular = numCelular;
    }

    public int getNumEmergencia() {
        return numEmergencia;
    }

    public void setNumEmergencia(int numEmergencia) {
        this.numEmergencia = numEmergencia;
    }

    public int getNumParticipante() {
        return numParticipante;
    }

    public void setNumParticipante(int numParticipante) {
        this.numParticipante = numParticipante;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNome(String nome) {
        this.nomeCompleto = nome;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
}
