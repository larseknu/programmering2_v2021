package no.hiof.larseknu;

public class TransactionHandler implements Runnable {
    private BankAccount bankAccount;

    public TransactionHandler(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        int insertAmount = 100;

        for (int i = 0; i < 10; i++) {
            synchronized (bankAccount) {
                int startBalance = bankAccount.getBalance();

                bankAccount.insert(insertAmount);
                pauseThread(150);

                int endBalance = bankAccount.getBalance();

                System.out.printf("Start balance %d - Inserted %d - End balance %d %s%n",
                        startBalance, insertAmount, endBalance, Thread.currentThread().getName());
            }
        }
    }

    private void pauseThread(int timems) {
        try {
            Thread.sleep(timems);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
