public class ProblemaZeladorEficiente {

    public static void main(String[] args) {

        float[] pesos = {1.8F, 2.2F, 0.5F, 1.1F};
        int numViagens = 0;
        int i = 0;
        int j = pesos.length - 1;

        while (i <= j) {
            if (pesos[i] + pesos[j] <= 3.00) {
                i++;
            }
            j--;
            numViagens++;
        }
        System.out.println("O zelador realizou " + numViagens + " viagens.");
    }
}