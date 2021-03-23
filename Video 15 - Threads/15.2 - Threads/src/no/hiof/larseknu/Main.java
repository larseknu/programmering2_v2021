package no.hiof.larseknu;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        BankAccount yourBankAccount = new BankAccount("9001", 1000);

        TransactionHandler transactionHandler = new TransactionHandler(yourBankAccount);

        Thread aTransactionThread = new Thread(transactionHandler);
        Thread aTransactionThread2 = new Thread(transactionHandler);
        Thread aTransactionThread3 = new Thread(transactionHandler);

        aTransactionThread.start();
        aTransactionThread2.start();
        aTransactionThread3.start();

        aTransactionThread.join();
        aTransactionThread2.join();
        aTransactionThread3.join();

        System.out.println("End balance: " + yourBankAccount.getBalance());
    }
}
