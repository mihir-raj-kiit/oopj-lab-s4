import java.util.Scanner;
public class lab1_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        System.out.print("Enter marks:"); marks = sc.nextInt();
        if (marks >= 90 && marks <= 100) {
            System.out.println("O");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("E");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("A");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
        sc.close();
    }
}
