public class PalavraComposta {

    public static void main(String[] args) {

        int n = 22;

        for (int i = 1; i <= n; i++) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("DesenvolvimentoSoftware");
            } else if (n % 3 == 0) {
                System.out.println("Desenvolvimento");
                break;
            } else if (n % 5 == 0) {
                System.out.println("Software");
                break;
            } else {
                System.out.println(n + " não é divisível por 3 ou 5.");
            }
            i = n;
        }
    }
}