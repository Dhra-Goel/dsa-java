public class MoveXAtEnd {

    public static void move(String str, int idx, int count, String newStr){
        if(idx == str.length()){
            for(int i = 0; i<count; i++){
                newStr += 'x';
            }

            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            move(str, idx+1, count+1, newStr);
        }
        else{
            newStr += currChar;
            move(str, idx+1, count, newStr);
        }
    }

    public static void main(String[] args) {
        String str = "axxabxcd";
        move(str, 0, 0, "");
    }
}
