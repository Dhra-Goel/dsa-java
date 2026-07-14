public class TOH{

        public static void toweOfHanoi(int n, String src, String helper,  String destination){

            if(n==1){
                System.out.println("Transfer disk" + n + " from " + src + " to " + destination);
                return;
            }
            toweOfHanoi(n-1, src, destination, helper);
            System.out.println("Transfer disk " + n + " from " + src + " to " + destination);
            toweOfHanoi(n-1, helper, src, destination);
        }

        public static void main(String[] args) {
            int n = 3;
            toweOfHanoi(n, "S", "H", "D");
    }
}

