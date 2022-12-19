public class Order {
  public static void main(String[] args) {
    // int[] arr = {-3,0,1,2,3,4,5,6,7,30};

    //descending order array
    int[] arr = {8,7,6,5,4,3,2,1};

    int target = 7;

    int ans = orderAgnostic(arr, target);

    System.out.println(ans);
  }
  static int orderAgnostic(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    //find if the sorted array is in ascending or descending order
    boolean isAsc  = arr[start] < arr[end];
    // if(arr[start] < arr[end]) {
    //   isAsc = true;
    // }else {
    //   isAsc = false;
    // }

    while(start <= end) {
      //find the middle element
      //int mid = (start + end) / 2; // might be possible this integer will exceeds the range of integer in java
      int mid = start + (end - start) / 2;

      if(arr[mid] == target) {
        return mid;
      }

      if(isAsc) {
        //check if the target is in left
        if(target < arr[mid]) {
          end = mid - 1;
        }else if(target > arr[mid]) {
          start = mid + 1;
        }
      }else {
        if(target > arr[mid]) {
          end = mid - 1;
        }else{
          start = mid + 1;
        }
      }
    }
    //target not found || Element does not exist
    return -1;
  }
}
