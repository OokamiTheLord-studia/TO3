package tk.arktech;

public class Vector2D {
    private double x;
    private double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "["+x+"]\n["+y+"]\n";
    }

    public double dot(Vector2D v)
    {
        return this.x*v.x+this.y*v.y;
    }

    public double getLength()
    {
        return Math.sqrt(x*x+y*y);
    }
}
