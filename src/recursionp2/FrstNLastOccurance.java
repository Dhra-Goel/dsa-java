public class FrstNLastOccurance {
    public static int first = -1;
    public static int last = -1;

    public static void occur(String str, int idx){
        char element = 'a';

        if(idx == str.length()){
            System.out.println(first + 1);
            System.out.println(last + 1);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element) {
            if(first==-1)
                first=idx;
            else
                last = idx;
        }

        occur(str, idx + 1);
    }

    public static void main(String[] args) {
        String str = "gadbbabakjanhahjaghhj";
        occur(str, 0);
    }
}
