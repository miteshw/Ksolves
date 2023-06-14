        package Ksolves;
        class Question5{
        public static void main(String[] args) {

                String input = "Mitesh1234";
                separateNumbersAndCharacters(input);
            }

            public static void separateNumbersAndCharacters(String input) {
                StringBuilder numbers = new StringBuilder();
                StringBuilder characters = new StringBuilder();
                StringBuilder spe = new StringBuilder();

                for (int i = 0; i < input.length(); i++) {
                    char c = input.charAt(i);
                    if (Character.isDigit(c)) {
                        numbers.append(c);
                    } else if (Character.isLetter(c)) {
                        characters.append(c);
                    } else {

                    }

                }

                System.out.println("Numbers: " + numbers.toString());
                System.out.println("Characters: " + characters.toString());
            }
        }





