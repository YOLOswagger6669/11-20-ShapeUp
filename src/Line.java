// A Line object represents a line defined by a pair of Points.
public class Line
{
  Point start;
  Point end;
  public Line() {
    start.x=0;
    start.y=0;
    end.x=0;
    end.y=0;
  }
  public Line(Point startPoint, Point endPoint) {
    start=startPoint;
    end=endPoint;
  }
  public double length() {
    return start.distance(end);
  }
  public double slope() {
    return (start.y-end.y)/(start.x-end.x);
  }
  public String toString() {
    return (start.toString()+","+end.toString());
  }
  public void translate (int dx, int dy) {
    start.translate(dx, dy);
    end.translate(dx, dy);
  }
}
