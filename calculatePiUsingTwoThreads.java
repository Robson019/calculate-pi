public class calculatePiUsingTwoThreads {
    private static final int numThreads = 2;
    private static final int memorySize = 2;

    // Codigo principal

    public static void main(String[] args) throws InterruptedException {
        // repetindo 5x
        for (int c = 1; c <= 5; c++) {
            long startTime = System.nanoTime(); // Dando inicio a contagem

            double[] memory = new double[memorySize]; // Criando area da memoria compartilhada
            for (int i = 0; i < memorySize; i++) {
                memory[i] = i;
            }

            Thread[] threads = new Thread[numThreads]; // Criando thread unica
            for (int i = 0; i < numThreads; i++) {
                threads[i] = new MyThreads(i, memory);
                threads[i].start(); // Dando inicio a thread
            }
        
            waitThreads(threads); // Main espera fim das threads

            double pi = 0; // somando resultados de cada parte da memoria
            for (double portion : memory) {
                pi += portion;
            }
            System.out.printf("Valor pi: %2f\n", pi); // exibindo pi

            long endTime = System.nanoTime(); // marcando fim da contagem
            long duration = endTime - startTime; // calculando contagem
            System.out.printf("Duração[%d]: %dms\n", c, duration/1000000); // exibindo duracao
            System.out.println("===========================");
        }
    }

    // Funcao para fazer o main esperar pelas threads
    public static void waitThreads(Thread[] threads) throws InterruptedException {
        for (Thread t : threads) {
            t.join();
        }
    }

    // Criando class para estender thread original
    public static class MyThreads extends Thread {
        int threadId;
        double[] memory; 

        // Lendo informacoes sobre a thread atual

        public MyThreads(int threadId, double[] memory) {
            this.threadId = threadId;
            this.memory = memory;
        }
        
        // Sobrescrevendo run da thread original
        @Override
        public void run() {
            int n = 1000000;
            double sum = 0;

            // ajustando i e n na posicao da memoria
            if (memory[threadId] == 0) {
                n = 500000;
                for (int i = 0; i < n; i++) {
                    double portion = Math.pow(-1, (double) i)/(2*i + 1);
                    sum += portion;
                }
            } else {
                for (int i = 500000; i < n; i++) {
                    double portion = Math.pow(-1, (double) i)/(2*i + 1);
                    sum += portion;
                }
            }

            double partialPi = sum * 4;
            memory[threadId] = partialPi; // Sobrescrevendo parcela de pi na memoria compartilhada
        }
    }
}
