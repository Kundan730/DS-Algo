public class Search {
  public static void main(String[] args) {
    int[] arr = {-3,0,1,2,3,4,5,6,7};
  //   System.out.println(arr.length);
  //   System.out.println(arr[6]);

  int target = 7;

  int ans  = binarySearch(arr, target);

  System.out.println(ans);
  }

  //return the index
  //return -1 if the target does not exist
  static int binarySearch(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    while(start <= end) {
      //find the middle element
      //int mid = (start + end) / 2; // might be possible this integer will exceeds the range of integer in java
      int mid = start + (end - start) / 2;

      //check if the target is in left
      if(target < arr[mid]) {
        end = mid - 1;
      }else if(target > arr[mid]) {
        start = mid + 1;
      }else {
        //target found
        return mid;
      }
    }
    //target not found || Element does not exist
    return -1;
  }
}
