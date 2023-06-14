    package Ksolves;

    public class Question6 {
        // Method Overriding
        public void demo() {
            System.out.println("This From Parent Demo class");
        }
    }
    class Question7 extends Question6{
    public void demo(){
       super.demo();
        System.out.println("This From child demo ");
    }
}

    class Question6Driver{
        public static void main(String[] args) {
            Question7 question7 = new Question7();
           question7.demo();


        }


    }