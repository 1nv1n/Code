/**
 * Class that contains the logic & implementation for the provided problem's solution.
 */
class CodeGoesHere {
  double r;
  double x;
  double y;

  public CodeGoesHere(double radius, double x_center, double y_center) {
    this.r = radius;
    this.x = x_center;
    this.y = y_center;
  }

  public double[] randPoint() {
    double area = (double)Math.random()*Math.PI*r*r;
    double cur_r = Math.sqrt(area/Math.PI);
    double rad = Math.random()*2*Math.PI;
    return new double[]{Math.cos(rad)*cur_r+x, Math.sin(rad)*cur_r+y};
    }
}

/**
 * This is the driver of the solution.
 * This class is not expected to hold any logic,
 *  but rather to call into the method(s) from {@link CodeGoesHere} to perform the expected actions.
 */
public class SolutionDriver {
	public static void main(String[] args) {
		CodeGoesHere cGH = new CodeGoesHere(1, 0, 0);
		System.out.println(cGH.randPoint());
	}
}