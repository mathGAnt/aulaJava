package pratica01;

public class Pratica01 {
    public static void main(String[] args) {

        int i, max, min, iMax, iMin;

        String cidades[] = new String[]{"Londres", "Madrid", "Nueva York", "Buenos Aires",
                                        "Asuncion", "Sao Paulo", "Lima", "Santiago de Chile",
                                        "Lisboa", "Tokio"};
        int temps[][] = new int[][]{{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43},
                                    {0, 39}, {-7, 26}, {1, 31}, {-10, 35}};

        min = temps[0][0];
        max = temps[0][1];
        iMax = 0;
        iMin = 0;

        for (i = 0; i < temps.length; i++) {
            if(temps[i][1] > max) {
                max = temps[i][1];
                iMax = i;
            }
            if (temps[i][0] < min) {
                min = temps[i][0];
                iMin = i;
            }
        }
        System.out.println("A cidade com a temperatura mais alta no período foi " + cidades[iMax] + " com a temperatura de " + temps[iMax][1] + " graus.");
        System.out.println("Ja a cidade com a temperatura mais baixa no período foi " + cidades[iMin] + " com a temperatura de " + temps[iMin][0] + " graus.");
    }
}
