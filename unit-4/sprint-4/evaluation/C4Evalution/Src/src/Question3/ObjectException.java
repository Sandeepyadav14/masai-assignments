package Question3;

public class ObjectException {
    static void fun() {
        Object object =null;

        try {
            System.out.println(object.toString());
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
