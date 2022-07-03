package pratica02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pratica02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int controleExecucao, controleOpcao;
        List<Circuito> circuitos = new ArrayList<Circuito>();


        System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- --");
        System.out.println("Sistema de controle da corrida:");
        System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- --");

        circuitos.add(new Circuito("Circuito Pequeno", "2 km pela selva e riachos", new double[]{1300.00, 1500.00}));
        circuitos.add(new Circuito("Circuito Medio", "5 km pela selva, riachos e lama", new double[]{2000.00, 2300.00}));
        circuitos.add(new Circuito("Circuito Avancado", "10 km pela selva, riachos, lama e escalada.", new double[]{2800}));

        do {
            System.out.println("\nMenu de opcoes: \n" +
                    "1 - Inserir participante\n" +
                    "2 - Exibir lista de participantes\n" +
                    "3 - Cancelar inscricao de participante\n" +
                    "4 - Sair");
            controleExecucao = Integer.parseInt(scan.nextLine());

            switch (controleExecucao){
                case 1:
                    System.out.println("\nEm qual circuito deseja inserir?\n" +
                            "1 - Circuito pequeno\n" +
                            "2 - Circuito medio\n" +
                            "3 - Circuito avancado");
                    controleOpcao = Integer.parseInt(scan.nextLine());
                    if (controleOpcao == 1) {
                        circuitos.get(0).inscreverParticipante();
                    } else if ((controleOpcao == 2)) {
                        circuitos.get(1).inscreverParticipante();
                    } else {
                        circuitos.get(2).inscreverParticipante();
                    }
                    break;
                case 2:
                    System.out.println("\nExibir lista de participantes de qual circuito?\n" +
                            "1 - Circuito pequeno\n" +
                            "2 - Circuito medio\n" +
                            "3 - Circuito avancado");
                    controleOpcao = Integer.parseInt(scan.nextLine());
                    if (controleOpcao == 1) {
                        circuitos.get(0).listarParticipantes();
                    } else if ((controleOpcao == 2)) {
                        circuitos.get(1).listarParticipantes();
                    } else {
                        circuitos.get(2).listarParticipantes();
                    }
                    break;
                case 3:
                    System.out.println("\nDe qual circuico deseja efetuar o cancelamento?\n" +
                            "1 - Circuito pequeno\n" +
                            "2 - Circuito medio\n" +
                            "3 - Circuito avancado");
                    controleOpcao = Integer.parseInt(scan.nextLine());
                    if (controleOpcao == 1) {
                        circuitos.get(0).cancelarInscricao();
                    } else if ((controleOpcao == 2)) {
                        circuitos.get(1).cancelarInscricao();
                    } else {
                        circuitos.get(2).cancelarInscricao();
                    }
                    break;
            }
            System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- --");
        } while(controleExecucao != 4);
    }
}
