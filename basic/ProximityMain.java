package pl.sdacademy.java.basic;

public class ProximityMain {
    public static void main(String[] args) {
        int result = Proximity.closestValueIndex(5, 6, 3, 2, 1);
        System.out.println(result);

        Proximity obj = new Proximity();
        result = obj.closestValueIndex(5);
        System.out.println(result);

        obj.values = new int[]{10, 3, 4, 6};

        result = obj.closestValueIndex(5);
        System.out.println(result);
    }
}
