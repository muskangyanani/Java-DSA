import java.util.Arrays;

public class shortest_job_first {
  public static void main(String[] args) {
    int[] burstTime = {4,3,7,1,2};
    System.out.println(avgWaitingTime(burstTime));
  }

  static int avgWaitingTime(int[] burstTime){
    Arrays.sort(burstTime);
    int t=0;
    int wt=0;
    for (int i = 0; i < burstTime.length -1; i++) {
      t+= burstTime[i];
      wt += t;
    }
    return (wt/burstTime.length);
  }
}
