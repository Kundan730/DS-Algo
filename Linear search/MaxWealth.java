public class MaxWealth {
  public static void main(String[] args) {
    int[][] arr = {
      {1,2,3},
      {4,5,6}
    };
    int ans = max(arr);
    System.out.println(ans);
  }

  static int max(int[][] accounts) {

    //person = row
    //account = col
    int MaxWealth = Integer.MIN_VALUE;
    for(int person = 0; person < accounts.length; person++) {
      int sum = 0;
      //when you start a new col, take a new sum for that row
      for(int account = 0; account < accounts[person].length; account++) {
        sum += accounts[person][account];
      }
      if(sum > MaxWealth) {
        MaxWealth = sum;
      }
    }
    return MaxWealth;

    // int max = Integer.MIN_VALUE;
    // for(int[] rows : accounts) {
    //   int sum = 0;
    //   for(int elements : rows) {
    //     sum += elements;
    //   }
    //   if(sum > max) {
    //     max = sum;
    //   }
    // }
    // return max;

  }
}
