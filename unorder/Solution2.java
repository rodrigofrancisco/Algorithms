// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution2 {
    public String solution(int T) {
        // write your code in Java SE 8
        int hours = T/3600;
        int hoursModule = T % 3600;
        int minutes = hoursModule / 60;
        int segs = hoursModule % 60;

        return  hours+"h"+minutes+"m"+segs+"s";
    }
    public static void main(String args[]) {
      Solution2 s = new Solution2();
      System.out.println(s.solution(83643));
    }
}

