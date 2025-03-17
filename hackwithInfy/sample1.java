import java.util.Arrays;

public class sample1 {
  // Question:
  // Today you decided to go to the gym. You currently have E energy. There are N exercises in the gym. Each of these exercises drains A[i] amount of energy from your body. You feel tired if your energy reaches 0 or below. Calculate the minimum number of exercises you have to perform such that you become tired.
  // Each unique exercise can only be performed at most 2 times as others also have to use the machines.
  // If performing all the exercises does not make you feel tired, return -1.

  // E (Integer) → The first line contains an integer E, denoting the energy.
  // N (Integer) → The next line contains an integer N, denoting the number of exercises.
  // A (Integer Array) → The next N lines contain an integer describing the amount of energy drained by the i-th exercise.

  // This question asks you to determine the minimum number of exercises required to deplete your energy to 0 or below, considering each exercise can be performed at most twice. If it's not possible to reach exhaustion, return -1.
  public static void main(String[] args) {
    System.out.println(minExercise(2, 3, new int[]{1,5,2})); 
  }

  static int minExercise(int E, int N, int[] A){
    Arrays.sort(A);
    int exercises = 0;
    for (int i = N - 1; i >= 0; i--) {
        for (int j = 0; j < 2; j++) {
            E -= A[i];
            exercises++;
            if (E <= 0) {
                return exercises;
            }
        }
    }
    return -1;
  }
}
