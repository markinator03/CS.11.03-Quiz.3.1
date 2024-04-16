    // Question 1 - calculateGrade
public class Main {
    public static void main(String[] args) {
        char grade = calculateGrade(90);
        System.out.println("Your grade: " + grade);

    }

    public static char calculateGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else if (score >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }
}
    // Question 2 - fizzBuzz
    public static void main(String[] args) {
        String result = fizzBuzz(3);
        System.out.println("Result: " + result);
    }
        public static String fizzBuzz(int value) {
            if (value % 3 == 0 && value % 5 == 0) {
                return "fizzbuzz";
            }
            else if (value % 3 == 0)    {
                return "fizz";
            }
            else if (value % 5 == 0)    {
                return "buzz";
            }
            else {
                return "unlucky";
            }
}
    // Question 3 - frontBack
    public static void main(String[] args) {
            String result = frontBack("Hello");
            System.out.println("Result: " + result);
        }

        public static String frontBack(String str) {
            if (str.length() < 2) {
                return str;
            } else {
                String front = str.substring(0, 2);
                return front + str + front;
            }
        }


    // Question 4 - twoAsOne
    public static void main(String[] args) {
        boolean result = twoAsOne(2, 3, 5);
        System.out.println("Result: " + result);
    }

public static boolean twoAsOne (int a, int b, int c) {
    return a + b == c || a + c == b || b + c == a;
}

    // Question 5 - endUp
public static void main(String[] args) {
    String result = endUp("hello");
    System.out.println("Result : " + result);
}
public static String endUp(String str) {
    if (str.length() <= 3) {
        return str.toUpperCase();
    } else {
        String lastThree = str.substring(str.length() - 3);
        return str.substring(0, str.length() - 3) + lastThree.toUpperCase();
    }
}
