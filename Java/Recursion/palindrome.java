// public class palindrome {
//     public static void main(String[] args) {
//        int n=157;
//        System.out.println(ispalindrome(n, n, 0));

        
//     }
//     public static boolean ispalindrome(int n,int m,int rev){
//         if(n==0)return m==rev;
//         rev=(rev*10)+(n%10);
//         return ispalindrome(n/10, m, rev);
//     }
// }

                        OR

public class Palindrome {
    public static void main(String[] args) {
        int n = 151;
               System.out.println(ispalindrome(n, n, 0));
 }

    public static boolean isPalindrome(int n, int rev, int original) {
        if (n == 0)
            return rev == original;
        rev = (rev * 10) + (n % 10);
        return isPalindrome(n / 10, rev, original);
    }
}