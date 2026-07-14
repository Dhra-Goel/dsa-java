public class RemoveDuplicate {
//can simply declare the arr as static here and remove it from parameters
//should use arr[] as map[] for better name convention

    public static void remove(String str, int idx, boolean[] arr, String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        char curr = str.charAt(idx);
        int n = curr - 'a';
        if(arr[n]){ // we could directly use arr[curr-'a']
            remove(str, idx+1, arr, newStr);
        }
        else{
            newStr += curr;
            arr[n] = true;
            remove(str, idx+1, arr, newStr);
        }
    }

    public static void main(String[] args) {
        String str = "abbcdda";
        boolean[] arr = new boolean[26];
        remove(str, 0, arr, "");

    }
}
