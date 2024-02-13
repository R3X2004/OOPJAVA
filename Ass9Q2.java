class PrintThread extends Thread {
    private String letter;
    private int count;

    public PrintThread(String letter, int count) {
        this.letter = letter;
        this.count = count;
    }

    public synchronized void printLetter() {
        for (int i = 0; i < count; i++) {
            System.out.print(letter);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
               System.out.println(e);
            }
        }
    }

    
    public void run() {
        printLetter();
    }
}

class Main {
    public static void main(String[] args) {
        PrintThread threadA = new PrintThread("A", 100);
        PrintThread threadB = new PrintThread("B", 100);

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
           System.out.println(e);
    }
}
}
