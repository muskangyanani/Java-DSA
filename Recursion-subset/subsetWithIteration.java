
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetWithIteration {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        // List<List<Integer>> ans = subset(arr);
        List<List<Integer>> ans = subsetDuplicate(arr);
        System.out.println(ans);
    }

    // without duplications
    static List<List<Integer>> subset(int[] arr){
        // creating a list of list  
        List<List<Integer>> outer = new ArrayList<>();

        // adding an empty list to the outer list
        outer.add(new ArrayList<>());

        for (int nums: arr){
            //  
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));    //creates a copy of outter lists
                inner.add(nums);                                        //adds the next number to the copy 
                outer.add(inner);                                       //adds the copy to the outer array
            }
        }

        return outer;
    }

    // with duplications
    static List<List<Integer>> subsetDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start =0;
        int end = 0;
        for (int i=0; i<arr.length; i++){
            start =0;
            //if current and previous element is same(duplicate occurs) s=e+1;
            if(i>0 && arr[i] == arr[i-1]){
                start = end +1;
            }
            end = outer.size() -1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));   
                inner.add(arr[i]);                                       
                outer.add(inner);                                       
            }
        }

        return outer;
    }

}
