public class Factory {

    private BaseSort sort;

    public void setSort(BaseSort sort){
        this.sort = sort;
    }

    public void doSort(int[] a){
        sort.sort(a);
    }

    public void doSort(int[] a,int left,int right){
        sort.sort(a,left,right);
    }
}
