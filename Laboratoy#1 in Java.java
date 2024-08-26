import java.util.Scanner;

class Pattern {
    public static void main(String[] args) {

        int i, j, n, p;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        n = sc.nextInt();

        // Print the top of the pattern
        System.out.println("*");
        i = 1;
        while (i <= n) {
            System.out.print("*");

            j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }

            p = i - 1;
            while (p >= 1) {
                System.out.print(p);
                p--;
            }

            System.out.println("*");
            i++;
        }

        // Print the bottom of the pattern
        i = n - 1;
        while (i >= 1) {
            System.out.print("*");

            j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }

            p = i - 1;
            while (p >= 1) {
                System.out.print(p);
                p--;
            }

            System.out.println("*");
            i--;
        }

        System.out.println("*");

        sc.close(); // Close the scanner
    }
}
