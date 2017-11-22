
import java.util.Scanner;

public class Test {
    public static void main(String[] args){

        int[] a = new int[10];

        Scanner in = new Scanner(System.in);
        for (int i = 0;i < 10;i++) {
            a[i] = in.nextInt();
        }

        Factory factory = new Factory();

        BaseSort select_sort = new SelectSort();
        BaseSort insert_sort = new InsertSort();
        BaseSort quick_sort = new QuickSort();

        factory.setSort(insert_sort);//插入排序
        //factory.setSort(select_sort);//选择排序
        //factory.setSort(quick_sort);//快速排序

        //factory.doSort(a,0,9);
        factory.doSort(a);
    }
}
