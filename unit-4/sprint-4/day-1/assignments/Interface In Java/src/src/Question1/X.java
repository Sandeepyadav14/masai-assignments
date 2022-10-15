package Question1;

   interface X {
        void one();
       default void two(){
           System.out.println("this is the Interface X method two");
       }
       static void three(){
           System.out.println("this is the Interface X method three");
       }

}

interface Y{
     void oney();
    default void twoy(){
        System.out.println("this is the Interface Y method two");
    }
    static void threey(){
        System.out.println("this is the Interface Y method three");
    }

}
interface Z extends X,Y{
       abstract void onez();

}
class ZImpl implements Z{


    @Override
    public void one() {
        System.out.println("This is the interface X of method One");
    }


    @Override
    public void oney() {
        System.out.println("This is the interface Y of method Oney");

    }



    @Override
    public void onez() {
        System.out.println("This is the interface Z of method onez");

    }

}
class Demo{
    public static void main(String[] args) {
        ZImpl x= new ZImpl();
        x.onez();
        x.twoy();
        x.one();
        x.two();
        x.oney();
        X.three();
        Y.threey();


    }
}

