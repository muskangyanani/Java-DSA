import java.util.Arrays;

// greed array - elements denoting their greeds
// size array - size of each cookie to fullfil greed of elements.
// fing how many elements can satisfy their needs provided in size array.

public class assign_cookie {
  public static void main(String[] args) {
    int[] greed = { 1, 5, 3, 3, 4 };
    int[] size = { 4, 2, 1, 2, 1, 3 };
    System.out.println(assign(greed, size));
  }

  static int assign(int[] greed, int[] size) {
    int l = 0;
    int r = 0;
    Arrays.sort(greed);
    Arrays.sort(size);

    while (l < size.length && r < greed.length) {
      if (greed[r] <= size[l]) {
        r++;
      }
      l++;
    }
    return r;

  }
}
