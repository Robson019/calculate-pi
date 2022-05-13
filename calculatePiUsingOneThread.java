public class calculatePiUsingOneThread {
    public static void main(String[] args) throws InterruptedException {
        // repetindo processo 5x
        for (int i = 1; i <= 5; i++) {
            long startTime = System.nanoTime(); // Dando inicio a contagem de ms

            // Como usamos apenas uma thread,
            // Nao vamos usar memoria compartilhada

            Thread thread = new MyThread(); // Criando thread unica
            thread.start(); // Dando inicio a thread
            thread.join(); // Main espera fim das threads


            long endTime = System.nanoTime(); // marcando fim da contagem
            long duration = endTime - startTime; // calculando contagem
            System.out.printf("Duração[%d]: %dms\n", i, duration/1000000); // exibindo duracao
            System.out.println("===========================");
        }
    }
    
    // Criando class para estender thread original
    public static class MyThread extends Thread {
        public MyThread() {}
        
        // Sobrescrevendo run da thread original
        @Override
        public void run() {
            int n = 1000000;
            double sum = 0;
            for (int i = 0; i < n; i++) {
                double portion = Math.pow(-1, (double) i)/(2*i + 1);
                sum += portion;
            }
            double pi = sum * 4;
            System.out.printf("Valor pi: %2f\n", pi);
        }
    }
}

