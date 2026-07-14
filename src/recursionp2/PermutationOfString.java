public class PermutationOfString {

    public static void perm(String str, String permutedStr){
        if(str.length()==0){
            System.out.println(permutedStr);
            return;
        }

        //iterative call for each in=dx (or character) of string
        for(int i = 0; i<str.length(); i++){

            //curr = a for first
            char curr = str.charAt(i);
            // basically newStr = ''+bc
            String newStr = str.substring(0,i) + str.substring(i+1);

            //ab jaa rha h bc as string or ans me h 'a'
            perm(newStr, permutedStr+curr);
            //ye bc vapis jaegi perm me or fir and me add hojaenge ek ek krke alg alg sequence me
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        perm(str, "");
    }
}
