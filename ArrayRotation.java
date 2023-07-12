import java.util.Scanner;
public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(arr, n, k);
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static int[] rotate(int[] arr,int n,int k) {
        int j = n-1;
        for(int i=0;i<n/2;i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        
        int x = 0;
        int y = k-1;
        while(x<y) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
            x++;
            y--;
        }
        
        x= k;
        y = n-1;
        while(x<y) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
            x++;
            y--;
        }

        return arr;
    }
}