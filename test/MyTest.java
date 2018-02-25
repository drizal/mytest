package test;

/**
 * @author drizal
 *
 * usage:
 *   java -cp bin test.MyTest
 *
 */
public class MyTest
{
  public static void main(String[] args) throws Exception
  {
    int childHug = 25000;
    int daddyHug = 20000;
    int loopNum = 0;

    // decide to take Child or Daddy hug
    if (childHug > daddyHug) {
    System.out.println("go Child");
	  loopNum = childHug;
    }
    else {
      System.out.println("go Daddy");
      loopNum = daddyHug;
    }

    // run loop using loop number
    int spaceNum = 0;
    String space = null;
    boolean isIncrease = true;
    for (int i = 0; i < loopNum; i++) {
      if (isIncrease == true) {
        spaceNum++;
      }
      else {
        spaceNum--;
      }

      // create space based on space number
      space = "";
      for (int j = 0; j < spaceNum; j++) {
        space = space + " ";
      }

      // print using created space
      System.out.println(space + "loop " + i);
      Thread.sleep(80);

      // decide to increase or decrease space
      if (spaceNum >= 50) {
        isIncrease = false;
      }
      else if (spaceNum <= 0) {
        isIncrease = true;
      }
    }
  }
}
