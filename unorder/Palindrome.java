class Palindrome {
  String palindromeCutting(String s) {
      String sub = s.substring(0, 1);
      int i = 2;
      while(isSubstringPalindrome(sub)) {
          sub = s.substring(0,i);
          i++;
      }
      if(sub.length() >= 2) {
          String newS = s.substring(sub.length()-1);
          if(isSubstringPalindrome(newS)) {
              return "";
          } else {
              return newS;
          }
      } else {
          return s;
      }
  }

  boolean isSubstringPalindrome(String s) {
      int i = 0;
      int j = s.length() - 1;
      while ( j > i && j != i ) {
        if( s.charAt(i) != s.charAt(j) ) {
          return false;
        }
        i++;
        j--;
      }
      
      return true;
  }

  public static void main(String args[]) {
    Palindrome p = new Palindrome();
    String res = p.palindromeCutting("aaacodedoc");

    System.out.println(res);
  }

}
