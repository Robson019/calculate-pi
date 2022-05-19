public class main {
    public static void main(String[] args) throws InterruptedException {
        // criando laço para: 1, 2, 4, 8, 16 e 32 threads
        for (int k = 1; k <= 32; k *= 2) {
            System.out.printf("Calculando com %d thread(s)\n", k);
            System.out.println("===========================");
            int numThreads = k; // numero de threads atual
            int memorySize = k; // numero de areas da memoria compartilhada
            // vetor para armazenar calculo de cada uma das cinco execucoes
            long[] duration = new long[5];
            long sumOfMedia = 0;
            // variavel para calcular o numero de somas por thread
            double numberOfElementsPerThread = 1000000/numThreads;

            // repetindo 5x cada thread
            for (int c = 0; c < 5; c++) {
                long startTime = System.nanoTime(); // Dando inicio a contagem

                double[] memory = new double[memorySize]; // Criando area da memoria compartilhada
                for (int i = 0; i < memorySize; i++) {
                    memory[i] = i;
                }

                Thread[] threads = new Thread[numThreads]; // Criando thread
                for (int i = 0; i < numThreads; i++) {
                    int startOfRange = (int) numberOfElementsPerThread * i;
                    int endOfRange = startOfRange + (int) numberOfElementsPerThread;
                    threads[i] = new MyThreads(i, memory, startOfRange, endOfRange);
                    threads[i].start(); // Dando inicio a thread
                }

                waitThreads(threads); // Main espera fim das threads

                double pi = 0; // somando resultados da memoria compartilhada
                for (double portion : memory) {
                    pi += portion;
                }
                pi *= 4;
                System.out.printf("Valor pi: %2f\n", pi); // exibindo pi

                long endTime = System.nanoTime(); // marcando fim da contagem
                duration[c] = endTime - startTime; // calculando contagem
                sumOfMedia += duration[c]; // adicionando resultado na media
                System.out.printf("Duração[%d]: %dms\n", c + 1, duration[c]/1000000); // exibindo duracao
                System.out.println("===========================");
            }

            double media = sumOfMedia/5; // calculando media
            System.out.printf("%d - Duração média: %.2fms\n", k, media/1000000); // exibindo media

            // calculando parcelas do desvio
            double[] portionsOfDetour = new double[5];
            for (int j = 0; j < 5; j++) {
                portionsOfDetour[j] = duration[j] - media;
                Math.pow(portionsOfDetour[j], 2);
            }

            double detour = 0;
            for (double portion : portionsOfDetour) {
                detour += portion; // somando todas as parcelas
            }

            detour = Math.sqrt(detour/5); // calculando desvio da thread
            System.out.printf("%d - Desvio Padrão: %.2fns\n", k, detour); // exibindo desvio
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
            // adicionando calculo parcial de pi a memoria compartilhada
        }
    }
}
