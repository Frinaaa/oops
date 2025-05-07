public class MathThreadManager {

    // MultiplicationTable task
    static class MultiplicationTable implements Runnable {
        @Override
        public void run() {
            synchronized (System.out) {
                System.out.println("Multiplication Table of 5:");
                for (int i = 1; i <= 10; i++) {
                    System.out.println("5 x " + i + " = " + (5 * i));
                }
                System.out.println(); // spacing
            }
        }
    }

    // PrimeNumbers task
    static class PrimeNumbers implements Runnable {
        private int n;

        public PrimeNumbers(int n) {
            this.n = n;
        }

        private boolean isPrime(int num) {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        }

        @Override
        public void run() {
            synchronized (System.out) {
                System.out.println("First " + n + " Prime Numbers:");
                int count = 0, num = 2;
                while (count < n) {
                    if (isPrime(num)) {
                        System.out.print(num + " ");
                        count++;
                    }
                    num++;
                }
                System.out.println("\n");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Runnable tableTask = new MultiplicationTable();
        Runnable primeTask = new PrimeNumbers(10); // Set N = 10

        Thread tableThread = new Thread(tableTask);
        Thread primeThread = new Thread(primeTask);

        tableThread.start();
        primeThread.start();

        try {
            tableThread.join();
            primeThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

