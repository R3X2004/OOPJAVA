 class Main {
   public static void main(String[] args) {
       String days = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
       String reversedDays = "";

       int lastIndex = days.lastIndexOf(" ");

       while (lastIndex != -1) {
           
           String word = days.substring(lastIndex + 1);

           
           reversedDays += word + " ";

           
           days = days.substring(0, lastIndex);

           
           lastIndex = days.lastIndexOf(" ");
       }
              reversedDays += days;

       System.out.println("Reversed days: " + reversedDays);
   }
}
