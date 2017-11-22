import java.util.Arrays;

public class QuickSort extends BaseSort {

    public void sort(int[] a, int left, int right) {

        int start = left;
        int end = right;
        int key = a[left];

        while (end > start) {
            while (end > start && a[end] >= key)
                end--;
            if (a[end] <= key) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }

            while (end > start && a[start] <= key)
                start++;
            if (a[start] >= key) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }
        if (start > left) sort(a, left, start - 1);
        if (end < right) sort(a, end + 1, right);

        super.sort(a);
        System.out.println("快速排序算法");
        System.out.println(Arrays.toString(a));
    }
}