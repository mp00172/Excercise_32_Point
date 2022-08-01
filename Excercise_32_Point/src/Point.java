public class Point {

    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((0.0 - this.x) * (0.0 - this.x) + (0.0 - this.y) * (0.0 - this.y));
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(Point pt) {
        return Math.sqrt((pt.getX() - this.x) * (pt.getX() - this.x) + (pt.getY() - this.y) * (pt.getY() - this.y));
    }
}
