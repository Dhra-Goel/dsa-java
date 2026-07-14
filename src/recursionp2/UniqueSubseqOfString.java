import java.util.HashSet;

public class UniqueSubseqOfString {

    public static void subSeq(String str, int idx, String newStr, HashSet<String> set){
        if(idx == str.length()){
            if (set.contains(newStr))
                return;
            else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char curr = str.charAt(idx);

        subSeq(str, idx + 1, newStr, set);
        subSeq(str, idx+1, newStr+curr, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();

        subSeq(str, 0, "", set);
    }

}
