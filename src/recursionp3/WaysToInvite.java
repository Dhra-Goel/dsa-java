public class WaysToInvite {

    public static int ways(int n){
      if (n<=1)
          return 1;

      int singleWay = ways(n-1); //1 akela aagya toh bche huye n-1 dekhlo apna
      int pairWay = (n-1) * ways(n-2); //mereko sthme pair choose krna h out of (n-1) * bche huye n-2 dekhlo apna

      return singleWay+pairWay;
    }

    public static void main(String[] args) {
        int  n = 4;
        int ans = ways(n);
        System.out.println(ans);
    }
}
