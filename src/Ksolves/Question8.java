    package Ksolves;

    public class Question8 {
    // Separate the char and digit into the String.
         public static void main(String[] args) {
        splitCharAndDigit("Mitesh@#1234");

         }



        public static void splitCharAndDigit(String str) {
        StringBuilder cha = new StringBuilder();
        StringBuilder num = new StringBuilder();
        StringBuilder spe = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num.append(str.charAt(i));

            } else if (Character.isAlphabetic(str.charAt(i))) {
                cha.append(str.charAt(i));
            }else {
                spe.append(str.charAt(i));

            }
        }
        System.out.println(cha);
        System.out.println(num);
        System.out.println(spe);
    }
}