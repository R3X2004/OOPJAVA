class PrintThread implements Runnable {
    private String message;
    private int count;

    public PrintThread(String message, int count) {
        this.message = message;
        this.count = count;
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < count; i++) {
                System.out.println(message);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                System.out.println(e);
                }
            }
        }
    }
}
 class Main {
    public static void main(String[] args) {
        PrintThread thread1 = new PrintThread("Hello", 50);
        PrintThread thread2 = new PrintThread("Hi", 50);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start();
        t2.start();
    }
}
