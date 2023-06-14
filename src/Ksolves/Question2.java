    package Ksolves;

    public class Question2 {
    // Inheritance
    // Acquired all the property from the parent class to child class is the process of inheritance
    String name;
    int age;

    Question2(){

    }
    Question2(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println(name);
        System.out.println(age);

    }

}

        class Question3 extends Question2{
        String mail;
        int roll ;
        Question3(){

        }

     public Question3(String mail, int roll, String name, int age){
            this.name=name;
            this.age=age;
            this.mail=mail;
            this.roll=roll;

            System.out.println(name);
            System.out.println(age);
            System.out.println(mail);
            System.out.println(roll);
        }
            public void demo(){
                System.out.println(name);
                System.out.println(age);
                System.out.println();

        }
    }
        class Question2Driver{
            public static void main(String[] args) {
             Question3 question3 = new Question3("mitesh.waghmode@gmail.com",4655,"Mitesh",25);
                Question2 question2 = new Question2("Mitesh",26);
                question3.demo();
               question2=null;
            }
        }

