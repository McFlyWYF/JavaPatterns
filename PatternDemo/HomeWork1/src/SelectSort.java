import java.util.Arrays;

public class SelectSort extends BaseSort{

    public void sort(int []a){

        int i,j,k;
        for(i = 0;i < a.length - 1;i++) {
            k = i;
            for (j = i+1;j < a.length;j++){
                if(a[j] < a[k]){
                    k = j;
                }
                if(k!=i){
                    int temp = a[k];
                    a[k] = a[i];
                    a[i] = temp;
                }
            }
        }
        super.sort(a);
        System.out.println("选择排序算法");
        System.out.println(Arrays.toString(a));
    }
}
