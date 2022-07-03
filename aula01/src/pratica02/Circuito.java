package pratica02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
public interface Circuito {

    void inscreverParticipante();

    String listarParticipantes();

    void cancelarInscricaoParticipante(int RG);

    boolean acitaMenorDeIdade();

}*/

public class Circuito{

    public String tipoCircuito;
    private String percurso;
    private double[] preco;
    private List<Participante> participantesDoCircuito;


    public Circuito(String tipoCircuito, String percurso, double[] preco) {
        this.tipoCircuito = tipoCircuito;
        this.percurso = percurso;
        this.preco = preco;
        this.participantesDoCircuito = new ArrayList<>();
    }

    public void inscreverParticipante(){
        Scanner scan = new Scanner(System.in);

        System.out.print("\nDigite o nome e sobrenome do participante: ");
        String nome = scan.nextLine();

        System.out.print("Digite o RG do participante: ");
        int RG = Integer.parseInt(scan.nextLine());

        System.out.print("Digite a idade do participante: ");
        int idade = Integer.parseInt(scan.nextLine());
        if (!this.aceitaMenorIdade() && idade < 18){
            System.out.println("Este circuito nao aceita menores de idade, inscricao cancelada.\n");
            return;
        }

        System.out.print("Digite o tipo sanguineo do participante: ");
        String tipoSangue = scan.nextLine();

        System.out.print("Digite o numero de telefone do participante: ");
        int nCel = Integer.parseInt(scan.nextLine());

        System.out.print("Digite o numero de telefone de emergencia do participante: ");
        int nEmerg = Integer.parseInt(scan.nextLine());

        if(this.tipoCircuito.equals("Circuito Avancado")) {
            participantesDoCircuito.add(new Participante(RG, idade, nCel, nEmerg, this.participantesDoCircuito.size() + 1, nome, tipoSangue, this.preco[0]));
        }else{
            participantesDoCircuito.add(new Participante(RG, idade, nCel, nEmerg, this.participantesDoCircuito.size() + 1, nome, tipoSangue, (idade < 18) ? this.preco[0] : this.preco[1]));
        }

        System.out.printf("Participante %s inserido no %s com o numero %d\n", nome, this.tipoCircuito, this.participantesDoCircuito.size());

    }

    public void listarParticipantes(){
        if(this.participantesDoCircuito.isEmpty()){
            System.out.println("\nEste circuito nao possui participantes");
        }else{
            System.out.println("\nParticipantes inscritos no " + this.tipoCircuito + ":");
            for (Participante p : this.participantesDoCircuito){
                System.out.println("-- --");
                System.out.println(p.toString());
            }
        }
    }

    public void cancelarInscricao(){
        System.out.println("Ver lista se participantes antes de cancelar a inscricao?\n" +
                "1 - Sim\n" +
                "2 - Nao");
        Scanner scan = new Scanner(System.in);
        int opcao = Integer.parseInt(scan.nextLine());
        if (opcao == 1){
            this.listarParticipantes();
            System.out.println("\nQual informacao voce deseja utilizar para cancelar a inscricao?\n" +
                    "1 - Numero\n" +
                    "2 - Nome");
            cancela(scan);
        }else{
            System.out.println("\nQual informacao voce deseja utilizar para excluir?\n" +
                    "1 - Numero\n" +
                    "2 - Nome");
            cancela(scan);
        }
        }

    private void cancela(Scanner scan) {
        int opcao;
        opcao = Integer.parseInt(scan.nextLine());
        if (opcao == 1) {
            System.out.println("Digite o numero do participante:");
            opcao = Integer.parseInt(scan.nextLine());
            //mudar id participantes
            for (int i = opcao; i < this.participantesDoCircuito.size(); i++) {
                this.participantesDoCircuito.get(i).setNumParticipante(i);
            }
            this.participantesDoCircuito.remove(opcao - 1);
        }else{
            System.out.println("Digite o nome do participante:");
            String aux = scan.nextLine();
            Participante pa = this.participantesDoCircuito.stream()
                    .filter(p -> p.getNomeCompleto().equals(aux))
                    .findAny().orElse(null);

            //mudar id participantes
            for (int i = pa.getNumParticipante(); i < this.participantesDoCircuito.size(); i++) {
                this.participantesDoCircuito.get(i).setNumParticipante(i);
            }
            this.participantesDoCircuito.remove(pa.getNumParticipante()-1);
        }
    }

    public boolean aceitaMenorIdade(){
        return this.tipoCircuito.equals("Circuito Avancado") ? false:true;
    }

}
