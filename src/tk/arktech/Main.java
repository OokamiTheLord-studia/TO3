package tk.arktech;

public class Main {

    /*Pobieranie każdej współrzędnej
    iloczyn skalarny,
    iloczyn wektorowy,
    dekorator,
    adapter*/


    public static void main(String[] args) {

        System.out.println("Wektory 2D");

        Vector2D v1 = new Vector2D(10,15);
        Vector2D v2 = new Vector2D(5,5);

        System.out.println(v1.toString() + v2.toString() + Double.toString(v1.dot(v2)));

        System.out.println("Wektory 3D");

        Vector3D v31 = new Vector3D(v1, 4);
        Vector3D v32 = new Vector3D(v2);
        Vector3D v33 = new Vector3D(1, 2,3);

        Vector3D v34 = v31.outer(v32);

        Vector3D v35 = new Vector3D(v1).outer(v32);

        System.out.println(v31);
        System.out.println(v33);
        System.out.println(v34);
        System.out.println(v35);

        System.out.println("Wektory Sferyczne");

        VectorSpherical vs0 = new VectorSpherical(1,0.31,3);
        VectorSpherical vs1 = new VectorSpherical(v31);

        System.out.println(vs0);
        System.out.println(vs1.outer(v32).getVector3D());

        System.out.println(vs1);
        vs1.setTheta(vs1.getTheta()*0.5);
        System.out.println(vs1.getVector3D());
        System.out.println(vs1);

    }
}
