import java.util.Arrays;

class Interval {
  int start;
  int end;

  public Interval() {
    this(0, 0);
  }

  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }
}

class CodeGoesHere {
  public boolean canAttendMeetings(Interval[] intervalList) {
    int[] sArr = new int[intervalList.length];
    int[] eArr = new int[intervalList.length];

    for(int idx = 0; idx < intervalList.length; idx++) {
      sArr[idx] = intervalList[idx].start;
      eArr[idx] = intervalList[idx].end;
    }

    Arrays.sort(sArr);
    Arrays.sort(eArr);

    for(int idx = 0; idx < sArr.length-1; idx++) {
      if(sArr[idx+1] < eArr[idx]) {
        return false;
      }
    }

    return true;
  }
}

public class SolutionDriver {
  public static void main(String[] args) {
    CodeGoesHere cGH = new CodeGoesHere();
    Interval[] intArr = new Interval[3];
    intArr[0] = new Interval(0, 30);
    intArr[1] = new Interval(5, 10);
    intArr[2] = new Interval(15, 20);

    System.out.println(cGH.canAttendMeetings(intArr));
  }
}