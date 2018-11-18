package tk.arktech;

public class Vector3D  {
    private Vector2D vector;
    private double z;

    public Vector3D(Vector2D vector, double z) {
        this.vector = vector;
        this.z = z;
    }

    public Vector3D(Vector2D vector) {
        this.vector = vector;
        this.z = 0;
    }

    public Vector3D(double x, double y, double z)
    {
        this.vector = new Vector2D(x, y);
        this.z = z;

    }

    public void setX(double x)
    {
        this.vector.setX(x);
    }

    public double getX()
    {
        return this.vector.getX();
    }

    public void setY(double y)
    {
        this.vector.setY(y);
    }

    public double getY()
    {
        return this.vector.getY();
    }

    public void setZ(double z)
    {
        this.z = z;
    }

    public double getZ()
    {
        return this.z;
    }

    @Override
    public String toString()
    {
        return "["+this.vector.getX()+"]\n["+this.vector.getY()+"]\n["+this.z+"]\n";
    }

    public double dot(Vector3D vector)
    {
        return this.vector.getX()*vector.vector.getX() + this.vector.getY()*vector.vector.getY() + this.z*vector.z;
    }

    public double dot(Vector2D vector)
    {
        return this.vector.dot(vector);
    }

    public Vector3D outer(Vector3D vector)
    {
        double x = this.getY()*vector.z - this.z*vector.getY();
        double y = this.z*vector.getX()-this.getX()*vector.z;
        double z = this.getX()*vector.getY()-this.getY()*vector.getX();
        return new Vector3D(x, y, z);
    }

    public double getLength()
    {
        double x = this.getX();
        double y = this.getY();
        double z = this.getZ();
        return Math.sqrt(x*x+y*y+z*z);
    }
}
