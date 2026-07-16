public class MergeSort {
    //O(n)
    public static void conquer(int[] arr, int si, int mid, int ei){
        int[] merger = new int[ei-si+1];

        int idx1 = si;
        int idx2 = mid+1;
        int n = 0;

        while(idx1<=mid && idx2<=ei){
            if (arr[idx1]<=arr[idx2]){
                merger[n] = arr[idx1];
                n++; idx1++;
            }
            else{
                merger[n] = arr[idx2];
                n++; idx2++;
            }
        }

        while(idx1<=mid)
            merger[n++] = arr[idx1++];

        while (idx2<=ei)
            merger[n++] = arr[idx2++];

        for (int i=0,j = si; i<merger.length; i++, j++)
            arr[j] = merger[i];
    }

    //O(logn)
    public static void divide(int[] arr, int si, int ei){
        if(si>=ei)
            return;

        int mid = si +(ei-si)/2;

        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    //O(nlogn)
    public static void main(String[] args) {
        int[] arr = {9,3,6,5,2,8};
        divide(arr, 0, arr.length-1);

        for(int a : arr)
            System.out.print(a);
        System.out.println();
    }
}
