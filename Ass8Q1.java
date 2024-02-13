import java.lang.Thread;
class EvenThread extends Thread {
    private int m;
    private int n;

    public EvenThread(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public void run() {
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
				try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
					
                }
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        int m = 1;
        int n = 10;

        EvenThread evenThread = new EvenThread(m, n);
        evenThread.start();

        for (int i = m; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
