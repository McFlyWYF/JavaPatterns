
import java.util.Scanner;

public class Found {

    int left,right,mid = 0;

    public void sort(int[] a,int left,int right,int n){
        for (int i = 0;i < 10;i++){
            for (int j = i;j < 10;j++){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        mid = (left + right)/2;

        if (a[mid] < n){
            sort(a,left + 1,right,n);
        }

        if (a[mid] > n){
            sort(a,left,right - 1,n);
        }

        if (a[mid] == n)
        System.out.println(n);
    }

    public static void main(String[] args){

        int[] a = {12,2,34,42,56,60,76,81,9,0};

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Found found = new Found();
        found.sort(a,0,10,n);
    }
}