import java.util.Arrays;

public class InsertSort extends BaseSort{

    public void sort(int[] a){

        int i,j,k;
        for(i = 1;i < a.length;i++){
            j = 0;
            while (i > j && a[i] >= a[j]){
                j++;
            }
            if (i > j){
                   k = i;
                int temp = a[i];
                while (k > j){
                    a[k] = a[k-1];
                    k--;
                }
                a[k] = temp;
            }
        }
        super.sort(a);
        System.out.println("插入排序算法");
        System.out.println(Arrays.toString(a));
    }
}
