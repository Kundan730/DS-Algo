import java.util.Arrays;

public class Search2d {
  public static void main(String[] args) {
    int[][] arr = {
      {1,2},
      {3,4,5,6},
      {7,8,9}
    };
    int target = 7;
    int[] ans = search(arr, target);//Format of return value {row, col}
    System.out.println(Arrays.toString(ans));
    System.out.println(max(arr));
  }

  static int[] search(int[][] arr, int target) {
    for(int row = 0; row < arr.length; row++) {
      for(int col = 0; col < arr[row].length; row++) {
        if(arr[row][col] == target) {
          return new int[]{row, col};
        }
      }
    }
    return new int[]{-1, -1};
  }

  // static int max(int[][] arr) {
  //   int ans = arr[0][0];
  //   for(int row = 0; row < arr.length; row++) {
  //     for(int col = 0; col < arr[row].length; col++) {
  //       if(arr[row][col] > ans) {
  //         ans = arr[row][col];
  //       }
  //     }
  //   }
  //   return ans;
  // }

  static int max(int[][] arr) {
    int max = Integer.MIN_VALUE;
    for(int[] rows : arr) {
      for(int elements : rows) {
        if(elements > max) {
          max = elements;
        }
      }
    }
    return max;
  }
}
