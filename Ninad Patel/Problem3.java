import java.util.*;
public class Problem3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n = sc.nextInt();
        if(n%2==0) {
            n -= 1;
        }
        for (int i = 1; i<=2*n; i+=2) {
            System.out.print(i + " ");
        }
    }
}