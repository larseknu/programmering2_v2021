package no.hiof.larseknu;

public class RunnableCounter implements Runnable {
    private int countTo;

    public RunnableCounter(int countTo) {
        this.countTo = countTo;
    }

    @Override
    public void run() {
        for (int i = 0; i <= countTo; i++) {
            System.out.println(Thread.currentThread().getName() + " - RC - " + i);
        }
    }
}
