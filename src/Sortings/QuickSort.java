public class QuickSort {
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];

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

        //swap for pivot and its right
        i++;
        int temp = arr[high];//basically the pivot
        arr[high] = arr[i];
        arr[i] = temp;

        return i;

    }

    public static void quickSort(int[] arr, int low, int high){
        if(low<=high) {
            int pivIdx = partition(arr, low, high);

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
