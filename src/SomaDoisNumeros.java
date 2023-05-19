public class SomaDoisNumeros {

    public static void main(String[] args) {

        int[] valor = {5, 26, 7, 9, 8, 16, 18};
        int obj = 17;
        int soma;

        for (int i = 0; i <= valor.length; i++) {

            for (int f = 1; f < valor.length; f++) {
                soma = valor[i] + valor[f];

                if (soma == obj) {
                    System.out.println("Objetivo alcançado: " + soma);
                    break;
                }
            }
        }
    }
}

