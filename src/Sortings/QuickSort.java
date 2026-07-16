public class QuickSort {
    public static int partition(int[] arr, int low, int high){
        //this is the left most of every partition which is used to reference the sort to left and right of it.
        int pivot = arr[high];

        //i is basically used to make space for the placing of smaller values than pivot at the left
        int i = low-1;

        for (int j = low; j<high; j++){
            if (arr[j]<pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        //swap for pivot and its right so that right side has larger values
        i++;
        int temp = arr[high];//basically the pivot
        arr[high] = arr[i];
        arr[i] = temp;

        //returning i as it is the index of the current pivot value
        return i;

    }

    public static void quickSort(int[] arr, int low, int high){
        if(low<=high) {
            int pivIdx = partition(arr, low, high);
            // we dont include pivot as it is sorted by itself in the partition fn
            quickSort(arr, low, pivIdx-1);
            quickSort(arr, pivIdx+1, high);
        }

    }

    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};

        quickSort(arr, 0, arr.length-1);

        for (int a : arr)
            System.out.print(a);
    }
}
