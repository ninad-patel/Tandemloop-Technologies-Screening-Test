import java.util.*;
public class Problem4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size for an array: ");
        int s = sc.nextInt();
        int[] arr = new int[s];
        for (int i = 0; i<s; i++) {
            System.out.print("Enter a no. at index " + i +": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Input array: " + Arrays.toString(arr));
        HashMap<Integer , Integer> dict = new HashMap<>();
        for (int i = 1; i<=9; i++) {
            int count = 0;
            for (int j = 0; j<s; j++) {
                if (arr[j]%i==0) {
                    count++;
                }
            }
            dict.put(i,count);
        }
        System.out.println("Output Dictionary: " + dict);
    }
}