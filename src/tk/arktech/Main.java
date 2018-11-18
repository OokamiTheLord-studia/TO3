package tk.arktech;

public class Main {

    /*Pobieranie każdej współrzędnej
    iloczyn skalarny,
    iloczyn wektorowy,
    dekorator,
    adapter*/


    public static void main(String[] args) {

        Vector2D v1 = new Vector2D(10,10);
        Vector2D v2 = new Vector2D(5,5);

        System.out.print(v1.toString() + v2.toString() + Double.toString(v1.dot(v2)));


    }
}
