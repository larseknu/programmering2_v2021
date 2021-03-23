package no.hiof.larseknu;

public class ThreadCounter extends Thread {
    private int countTo;

    public ThreadCounter(int countTo) {
        this.countTo = countTo;
    }

    @Override
    public void run() {
        for (int i = 0; i <= countTo; i++) {
            System.out.println(Thread.currentThread().getName() + " - TC - " + i);
        }
    }
}
