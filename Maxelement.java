import java.util.Scanner;
public class Maxelement {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int large = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > large)
                large = a[i];
        }
        System.out.println(large);
    }
}
