public class ParentesesBalanceados {
    public static void main(String[] args) {

        String palavra = "()())";
        int dir = 0;
        int esq = 0;

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == '(') {
                esq++;
                dir--;
            } else {
                dir++;
                esq--;
            }
        }

        if (dir != esq) {
            if (dir > esq) {
                System.out.println("Balancear os parentêses removendo " + dir + " ')'.");
            } else {
                System.out.println("Balancear os parentêses removendo " + dir + " '('.");
            }
        } else
            System.out.println("Os parênteses estão balanceados");
    }
}