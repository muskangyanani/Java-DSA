public class jump_game {
  // You are given an array. Each number tells how far you can jump. Can you reach the last index? Return true or false.
  public static void main(String[] args) {
    int[] arr = {3,2,1,0,4};
    System.out.println(canJump(arr));    
  }

  static boolean canJump(int[] arr){
    int maxIndex = 0;
    for (int i = 0; i < arr.length; i++) {
      if(maxIndex < i){
        return false;
      }
      maxIndex = Math.max(maxIndex, i+arr[i]);
    }

    return true;
  }
}
