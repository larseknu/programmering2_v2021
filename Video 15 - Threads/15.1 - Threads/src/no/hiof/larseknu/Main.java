package no.hiof.larseknu;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadCounter threadCounter = new ThreadCounter(1000);
        RunnableCounter runnableCounter = new RunnableCounter(1000);
        Thread runnableThread = new Thread(runnableCounter);

        counter(1000);
        threadCounter.start();
        runnableThread.start();

        threadCounter.join();
        runnableThread.join();

        System.out.println("Finished!");
    }

    private static void counter(int countTo) {
        for (int i = 0; i <= countTo; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}
