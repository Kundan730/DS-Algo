import java.util.Scanner;

public class Linear {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int arr = input.nextInt();

    System.out.println(arr);

    int[] nums = {1,2,3,4,5,6,7};

    int target = 5;

    int ans = linearSearch(nums, target);

    System.out.println(ans);
  }

  static int linearSearch(int[] arr, int target) {
    //search in the array: return the index if item found
    //otherwise return -1
    if(arr.length == 0) {
      return -1;
    }

    // //run a for loop
    // for(int index = 0; index < arr.length; index++) {

    //   //Check for element at every index if it is = target
    //   int element = arr[index];
    //   if(element == target) {
    //     return index;
    //   }
    // }

    //Search the target and return the element
    for(int element : arr) {//for every element in the array 
      if(element == target) {
        return element;
      }
    }
    //target not found
    return -1;
  }

  //
  // public static void main(String[] args) {
  //   Scanner input = new Scanner(System.in);

  //   int arr = input.nextInt();

  //   System.out.println(arr);

  //   int[] nums = {1,2,3,4,5,6,7};

  //   int target = 5;

  //   boolean ans = linearSearch(nums, target);

  //   System.out.println(ans);
  // }

  // static boolean linearSearch(int[] arr, int target) {
  //   //search in the array: return the index if item found
  //   //otherwise return -1
  //   if(arr.length == 0) {
  //     return false;
  //   }

  //   //Search the target and return the element
  //   for(int element : arr) {//for every element in the array 
  //     if(element == target) {
  //       return true;
  //     }
  //   }
  //   //target not found
  //   return false;
  // }
}
