import java.util.Scanner;

public class Student_Course_Registration {

    public static boolean isValidCourse(String code) {
        return code.equalsIgnoreCase("C++") || code.equalsIgnoreCase("Java") ||
                code.equalsIgnoreCase("Calculus") || code.equalsIgnoreCase("Physics") ||
                code.equalsIgnoreCase("AI");
    }

    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t\t\t\t" + "*********WELCOME TO COURSE REGISTRATION SYSTEM*********");
        System.out.println();
        Scanner s = new Scanner(System.in);
        System.out.println("Press Enter if you want to apply");
        s.nextLine();
        System.out.println("COURSES         | CODE | SLOTS |   DESCRIPTION");
        System.out.println("     C++        |  001 |   10  |   A detailed course of C++ Programming for beginners ");
        System.out.println("     Java       |  002 |   10  |   A well-defined Java course from basic with advanced Desktop development");
        System.out.println("   Calculus     |  003 |   10  |   Derivatives , Integrations , Vectors and more");
        System.out.println("    Physics     |  004 |   10  |   A well-defined course of Classical and Modern physics");
        System.out.println("      AI        |  005 |   10  |   A well-defined course based on modern AI");
        System.out.println();
        System.out.println("Do you want to apply(Yes/No)");
        String apply = s.next();
        if (apply.equalsIgnoreCase("Yes")) {
            System.out.println("Enter your name");
            String name = s.next();
            System.out.println("Enter your ID");
            String id = s.next();
            System.out.println();
            System.out.println("You can apply for any three courses");

            // Course 1
            System.out.println("Enter the name of the first course");
            String code = s.next();
            while (!isValidCourse(code)) {
                System.out.println("Invalid input, please enter valid code");
                code = s.next();
            }

            // Course 2
            System.out.println("Enter the name of the second course");
            String code2 = s.next();
            while (!isValidCourse(code2) || code2.equalsIgnoreCase(code)) {
                System.out.println("Invalid input, please enter valid code");
                code2 = s.next();
            }

            // Course 3
            System.out.println("Enter the name of the third course");
            String code3 = s.next();
            while (!isValidCourse(code3) || code3.equalsIgnoreCase(code) || code3.equalsIgnoreCase(code2)) {
                System.out.println("Invalid input, please enter valid code");
                code3 = s.next();
            }

            System.out.println("Your name: " + name);
            System.out.println("Your id: " + id);
            System.out.println("Your registered courses are: ");
            System.out.println("1. " + code);
            System.out.println("2. " + code2);
            System.out.println("3. " + code3);

            // Option to drop courses
            System.out.println("Do you want to drop any registered courses? (Yes/No)");
            String dropCourses = s.next();
            if (dropCourses.equalsIgnoreCase("Yes")) {
                System.out.println("Enter the number of courses you want to drop (0 to 3)");
                int numCoursesToDrop = s.nextInt();
                for (int i = 0; i < numCoursesToDrop; i++) {
                    System.out.println("Enter the course code to drop");
                    String courseToDrop = s.next();
                    if (courseToDrop.equalsIgnoreCase(code)) {
                        code = "";
                    } else if (courseToDrop.equalsIgnoreCase(code2)) {
                        code2 = "";
                    } else if (courseToDrop.equalsIgnoreCase(code3)) {
                        code3 = "";
                    } else {
                        System.out.println("Invalid course code, please enter a valid code");
                        i--; // Decrement i to re-enter the course code
                    }
                }
            }

            // Display remaining registered courses
            System.out.println("Your remaining registered courses are: ");
            if (!code.isEmpty()) {
                System.out.println("1. " + code);
            }
            if (!code2.isEmpty()) {
                System.out.println("2. " + code2);
            }
            if (!code3.isEmpty()) {
                System.out.println("3. " + code3);
            }
        }
    }
}
