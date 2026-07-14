public class ArraySorted {

    public static boolean checkSort(int[] arr, int idx){
        if(idx == arr.length-1){
            return true;
        }

        if(arr[idx]<arr[idx+1])
            return checkSort(arr, idx+1);
        else
            return false;




    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5};
        boolean ans = checkSort(arr, 0);
        System.out.println(ans);
    }
}
