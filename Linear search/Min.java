public class Min {
  public static void main(String[] args) {
    int[] arr = {1,2,3,-4,5,6,7,-8,9};
    System.out.println(min(arr));
  }

  // return the minimum value in the array
  // Assume that arr.length != 0
  static int min(int[] arr) {
    int ans = arr[0];
    for(int i = 1; i < arr.length; i++) {
      if(arr[i] < ans) {
        ans = arr[i];
      }
    }
    return ans;
  }
}