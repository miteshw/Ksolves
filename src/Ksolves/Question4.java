    package Ksolves;

    import java.util.Scanner;

    public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A String");
        String s1 = scanner.nextLine();
        String s2 = "";

        for (int i = s1.length()-1; i>=0; i--){
            s2 = s2 + s1.charAt(i);

        }
        System.out.println(s2);

        if (s2.equals(s2)){
            System.out.println(s2 + " Its palindrome");
        }else {
            System.out.println(s2 + " Its Not a Palindrome");
        }

    }

}
