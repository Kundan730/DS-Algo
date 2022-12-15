import java.util.Arrays;

public class Strings {
  public static void main(String[] args) {
    String name = "Kundan";

    char target = 'a';

    boolean ans = Search(name, target);

    System.out.println(ans);
    System.out.println(Arrays.toString(name.toCharArray()));
  }
  static boolean Search(String str, char target) {
    if(str.length() == 0) {
      return false;
    }

    for(int i = 0; i < str.length(); i++) {
      if(target == str.charAt(i)) {
        return true;
      }
    }

    //For Each loop
    //for every element in the array check
    // for(char ch : str.toCharArray()) {
    //   if(ch == target) {
    //     return true;
    //   }
    // }
    return false;
  }
}
