public class SubsequenceOfString {
    public static void subString(String str, int idx, String newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char curr = str.charAt(idx);

        subString(str, idx+1, newStr+curr);
        subString(str, idx+1, newStr);
    }

    public static void main(String[] args) {
        String str = "abc";
        subString(str, 0, "");
    }


}
