package tk.arktech;

public class VectorSpherical {

    private Vector3D vector3D;

    public VectorSpherical(Vector3D vector) {
        this.vector3D = vector;
    }

    public Vector3D getVector3D() {
        return vector3D;
    }

    public void setVector3D(Vector3D vector3D) {
        this.vector3D = vector3D;
    }

    public VectorSpherical(double phi, double theta, double r)
    {
        double x = r*Math.cos(theta)*Math.cos(phi);
        double y = r*Math.cos(theta)*Math.sin(phi);
        double z = r*Math.sin(theta);

        this.vector3D = new Vector3D(x, y, z);
    }

    public void setPhi(double phi)
    {
        this.vector3D.setX(this.getR()*Math.cos(this.getTheta())*Math.cos(phi));
        this.vector3D.setY(this.getR()*Math.cos(this.getTheta())*Math.sin(phi));
    }

    public double getPhi()
    {
        return Math.atan(this.vector3D.getY()/this.vector3D.getX());
    }

    public void setTheta(double theta)
    {
        this.vector3D.setX(this.getR()*Math.cos(theta)*Math.cos(this.getPhi()));
        this.vector3D.setY(this.getR()*Math.cos(theta)*Math.sin(this.getPhi()));
        this.vector3D.setZ(this.getR()*Math.sin(theta));
    }

    public double getTheta()
    {
        return Math.asin(this.vector3D.getZ()/this.vector3D.getLength());
    }

    public void setR(double r)
    {
        this.vector3D.setX(r*Math.cos(this.getTheta())*Math.cos(this.getPhi()));
        this.vector3D.setY(r*Math.cos(this.getTheta())*Math.sin(this.getPhi()));
        this.vector3D.setZ(r*this.vector3D.getZ()/this.vector3D.getLength());


    }

    public double getR()
    {
        return this.vector3D.getLength();
    }

    @Override
    public String toString() {

        return "r: " + this.getR() + " φ: " + this.getPhi() + " θ: " + this.getTheta();

    }

    public double dot(Vector3D vector)
    {
        return this.vector3D.dot(vector);
    }

    public double dot(VectorSpherical vector)
    {
        return this.vector3D.dot(vector.getVector3D());
    }

    public double dot(Vector2D vector)
    {
        return this.vector3D.dot(vector);
    }

    public VectorSpherical outer(Vector3D vector)
    {
        Vector3D v3d = this.vector3D.outer(vector);
        return new VectorSpherical(v3d);
    }

    public VectorSpherical outer(VectorSpherical vector)
    {
        return this.outer(vector.getVector3D());
    }

}
