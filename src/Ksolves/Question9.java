package Ksolves;

                public class Question9 {
                public static void main(String[] args) throws Exception {
                try {
                    int num1 = 10;
                    int num2 =   10;
                    int res = num1/num2;
                    System.out.println(res);

                    try {
                        String s = null;
                        System.out.println(s.length());

                    }
                        finally {
                        System.out.println("Its handle");
                    }

                    } catch (ArithmeticException e) {
                        System.out.println(e);
                        System.out.println("Don't Divide number by 0 ");

                    } catch (IndexOutOfBoundsException e) {
                    System.out.println(e);
                    System.out.println("Index Out of Bound ");

                    } catch (NullPointerException e) {
                    System.out.println(e);
                    System.out.println("It parent Exception");

                    } finally {
                        System.out.println("Handel the Exception Normally");
                    }
                }
            }




