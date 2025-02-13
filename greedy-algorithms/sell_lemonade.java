public class sell_lemonade {
  public static void main(String[] args) {
    int[] bills = {5,5,10,10,20};
    System.out.println(canSellAll(bills));
  }

  static boolean canSellAll(int[] bills){
    int five = 0; 
    int ten = 0;
    for (int i : bills) {
      if(i==5){
        five++;
      } else if(i==10){
        if(five>0){
          ten++;
          five--;
        }else{
          return false;
        }
      } else{
        if(five>=3){
          five -= 3;
        }else if(five>=1 && ten>=1){
          five--;
          ten--;
        }else{
          return false;
        }
      }
    }
    return true;
  }
}
