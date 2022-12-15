public class EvenDigits {
  public static void main(String[] args) {
    int[] nums = {12, 345, 2, 6, 7896};
    System.out.println(findNumbers(nums));
  }

  static int findNumbers(int[] nums) {
    int count = 0;
    for(int num : nums) {
      if(even(num)) {
        count++;
      }
    }
    return count;
  }

  static boolean even(int num) {
    //Negative number
    // if(num < 0) {
    //   num = num * -1;
    // }

    // to count 0
    // if(num == 0) {
    //   return 1;
    // }

    //Optimized
    // return (int)(Math.log10(num)) + 1;
    int count = 0;
    while(num > 0) {
      num /= 10;
      count++;
    }
    return count % 2 == 0;
  }
}
