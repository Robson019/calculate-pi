public class calculatePiUsingThreads {

    public static void main(String[] args) throws InterruptedException {
        for (int k = 1; k <= 32; k *= 2) {
            System.out.printf("Calculando com %d thread(s)\n", k);
            System.out.println("===========================");
            int numThreads = k;
            int memorySize = k;
            long portionsOfMedia = 0;
            double numberOfElementsPerThread = 1000000/numThreads;
    
            // repetindo 5x
            for (int c = 1; c <= 5; c++) {
                long startTime = System.nanoTime(); // Dando inicio a contagem
    
                double[] memory = new double[memorySize]; // Criando area da memoria compartilhada
                for (int i = 0; i < memorySize; i++) {
                    memory[i] = i;
                }
    
                Thread[] threads = new Thread[numThreads]; // Criando thread unica
                for (int i = 0; i < numThreads; i++) {
                    int startOfRange = (int) numberOfElementsPerThread * i;
                    int endOfRange = startOfRange + (int)numberOfElementsPerThread;
                    threads[i] = new MyThreads(i, memory, startOfRange, endOfRange);
                    threads[i].start(); // Dando inicio a thread
                }
            
                waitThreads(threads); // Main espera fim das threads
        
                double pi = 0; // somando resultados de cada parte da memoria
                for (double portion : memory) {
                    pi += portion;
                }
                pi *= 4;
                System.out.printf("Valor pi: %2f\n", pi); // exibindo pi
    
                long endTime = System.nanoTime(); // marcando fim da contagem
                long duration = endTime - startTime; // calculando contagem
                portionsOfMedia += duration;
                System.out.printf("Duração[%d]: %dms\n", c, duration/1000000); // exibindo duracao
                System.out.println("===========================");
            }
            double media = portionsOfMedia/5;
            System.out.printf("Duração média: %.2fms\n", media/1000000);
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
        int startOfRange, endOfRange; 

        // Lendo informacoes sobre a thread atual

        public MyThreads(int threadId, double[] memory, int startOfRange, int endOfRange) {
            this.threadId = threadId;
            this.memory = memory;
            this.startOfRange = startOfRange;
            this.endOfRange = endOfRange;
        }
        
        // Sobrescrevendo run da thread original
        @Override
        public void run() {
            double partialSumOfPi = 0.0;
            for (int i = startOfRange; i < endOfRange; i++) {
                double portion = Math.pow(-1, (double) i) / (2 * i + 1);
                partialSumOfPi += portion; 
            }
            memory[threadId] = partialSumOfPi;
        }
    }
}
