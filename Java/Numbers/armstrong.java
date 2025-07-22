import java.util.*;

class armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int c = 0;

        // Count number of digits
        int t = n;
        while (t > 0) {
            c++;
            t /= 10;
        }

        // Calculate sum of digits raised to the power of count
        t = n;
        while (t > 0) {
            int d = t % 10;
            int p = 1;
            for (int i = 1; i <= c; i++) {
                p *= d;  // correct: multiply digit d repeatedly
            }
            sum += p;
            t /= 10;
        }

        // Final check
        if (sum == temp) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
