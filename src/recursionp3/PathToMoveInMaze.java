public class PathToMoveInMaze {
    //the question is to find out the number of paths from (0,0) to (n,m)(basically the right bottom corner of the matrix)
    //there are to conditions only: either move right side or downward
    //in this the middle ones has the options to move in both directions but the corner one can move right(or down) only

    public static int countPaths(int i, int j, int n, int m){
        if(i==n || j==m){
            return 0;
        }

        if(i == n-1 && j == m-1 ){
            return 1;
        }

        int downPaths = countPaths(i+1, j, n, m);
        int rightPaths = countPaths(i, j+1, n, m);

        return downPaths+rightPaths;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 4;

        int count = countPaths(0, 0, n, m);
        System.out.println(count);
    }
}
