class Ass10Q4 {
    public static void main(String[] args) {
        String days = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
        StringBuffer reversedDays = new StringBuffer();

        int lastIndex = days.lastIndexOf(" ");

        while (lastIndex != -1) {
            String word = days.substring(lastIndex + 1);
            reversedDays.append(word).append(" ");
            days = days.substring(0, lastIndex);
            lastIndex = days.lastIndexOf(" ");
        }

        reversedDays.append(days);

        System.out.println("Reversed days: " + reversedDays);
    }
}
