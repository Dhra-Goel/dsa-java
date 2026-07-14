public class KeypadCombination {

    static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vw", "xyz"};
                      //keypad 0,   1   ,  2   ,   3  ,   4   ,  5  ,  6    ,  7  ,  8  ,  9

    public static void combination(String str, int idx, String combinedStr){
        if(idx == str.length()){
            System.out.println(combinedStr);
            return;
        }

        char currNum = str.charAt(idx); //will fetch number like 2 then 3 here
        String mapping = keypad[currNum - '0']; //this will change the index from char 2 to int 2 and fetch 'def' from keyboard to mapping

        for (int i = 0; i< mapping.length(); i++){
            combination(str, idx+1, combinedStr+mapping.charAt(i));
        }

    }

    public static void main(String[] args) {
        String str = "23";
        combination(str, 0, "");

    }

}
