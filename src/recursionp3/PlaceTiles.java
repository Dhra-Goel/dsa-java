public class PlaceTiles {

    //we want to place tile of size 1xm into a grid of nxm
    //so we have to tell the no. of ways the tiles can be place not the number of tiles.
    //there are two base cases and two ways(vertical and horizontal)
    //vertical tile lead to decrease n as n-m while horizontal tile lead to decrease n as n-1 while m remains same

    public static int ways(int n , int m){
        if (n == m)
            return 2;

        if (n<m)
            return 1;

        int verticalPlacement = ways(n-m, m);
        int horizontalPlacements = ways(n-1, m);

        return verticalPlacement+horizontalPlacements;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 2;

        int count = ways(n,m);
        System.out.println(count);
    }

}
