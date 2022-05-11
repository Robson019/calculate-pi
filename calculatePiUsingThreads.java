public class calculatePiUsingThreads {
    public static void main(String[] args) {
        int n = 1000000;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            double portion = Math.pow(-1, (double) i)/(2*i + 1);
            sum += portion;
        }
        double pi = sum * 4;

        System.out.println("Valor: " + pi);
    }
}