
class PrintLetter implements Runnable {
 
  private char letter;

 
  public PrintLetter(char letter) {
   
    this.letter = letter;
  }

 
  public void run() {
    
    for (int i = 0; i < 100; i++) {
      System.out.print(letter);
     
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {

        System.out.println(e);
      }
    }
  }
}


class Main {
 
  public static void main(String[] args) {
    
    PrintLetter p1 = new PrintLetter('A');
    PrintLetter p2 = new PrintLetter('B');

    
    Thread t1 = new Thread(p1);
    Thread t2 = new Thread(p2);

   
    t1.start();
    try {
        t1.join();
    } catch (InterruptedException e) {}
    t2.start();
    try {
        t2.join();
    } catch (InterruptedException e) {}

    }

}
