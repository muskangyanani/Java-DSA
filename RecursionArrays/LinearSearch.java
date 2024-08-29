package RecursionArrays;

import java.util.ArrayList;

public class LinearSearch {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = { 4, 4, 6, 2, 7, 10 };
        // System.out.println(search(arr, 29, 0));
        // searchMultiple(arr, 4, 0);
        // System.out.println(list);
        // System.out.println(searchMultipleArg(arr, 4, 0, new ArrayList<>()));
        System.out.println(searchMultiple2(arr, 4, 0));

    }

    static int search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {
            return search(arr, target, index + 1);
        }
    }

    // returning an ArrayList on multiple occurence
    static void searchMultiple(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }

        if (arr[index] == target) {
            list.add(index);
        }
        searchMultiple(arr, target, index + 1);
    }

    // returning an ArrayList by taking list as argument
    static ArrayList<Integer> searchMultipleArg(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }
        return searchMultipleArg(arr, target, index + 1, list);
    }

    // returning an ArrayList without taking it in argument, create list in the body
    // of the function itself
    static ArrayList<Integer> searchMultiple2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = searchMultiple2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
