package Ksolves;

    public class Question1 {
    // Method OverLoading

    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add(10,20,30));
        System.out.println(add(10,20.20));
    }

        public static int add(int a, int b){
        return a+b;

        }
        public static int add(int a, int b, int c){
        return a+b+c;

        }
        public static double add(int a, double b){
        return a+b;

        }

        }

