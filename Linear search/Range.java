public class Range {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    int target = 8;

    int start = 3;

    int end = 9;

    System.out.println(linearSearch(arr, target, start, end));
  }

  
  static int linearSearch(int[] arr, int target, int start, int end) {
    if(arr.length == 0) {
      return -1;
    }

    for(int index = start; index <= end; index++) {

      //Check for element at every index if it is = target
      int element = arr[index];
      if(element == target) {
        return index;
      }
    }
    //target not found
    return -1;
  }
}
