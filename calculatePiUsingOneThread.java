public class calculatePiUsingOneThread {
    private static final int numThreads = 2;
    static double pi = 0;

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.nanoTime();

        Thread thread = new MyThread();
        thread.start();
        thread.join();

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.printf("Duração: %dms\n", duration/1000000);
    }
    
    public static class MyThread extends Thread {
        public MyThread() {}
        
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

