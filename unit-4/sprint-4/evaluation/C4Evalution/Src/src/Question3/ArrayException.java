package Question3;

public class ArrayException {

    static void fun() {
        int[] array = new int[10];
        try {
            System.out.println(array[11] = 100);
        }
        catch (Exception e) {
            System.out.println("This is the  Exception");
        } finally {
            System.out.println("the end");
        }

    }

    public static void main (String[] args) {
        fun();
        }


}
