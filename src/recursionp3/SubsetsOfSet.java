import java.util.ArrayList;

public class SubsetsOfSet {
    //similar to subsequences of a string
    //to find the subsets of a set of first n natural numbers
    //if we have n = 3 then set is {1,2,3}
    //so we can have its subsets as:{1}, {2}, {3}, {1,2}, {1,3}, {2,3}, {1,2,3},{} (not 21 or 321 or etc bcoz 12==21)
    public static void printsub(ArrayList<Integer> subset){
        for (int i = 0; i < subset.size(); i++){
            System.out.print(subset.get(i));
        }
        System.out.println();
    }

    public static void findSub(int n, ArrayList<Integer> subset){
        if (n==0){
            printsub(subset);
            return;
        }

        //add
        subset.add(n);
        findSub(n-1, subset);

        //remove
        subset.remove(subset.size()-1);
        findSub(n-1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSub(n, subset);
    }

}
