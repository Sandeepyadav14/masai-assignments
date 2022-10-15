package question5;

public class MethodRefrences {
//Q5.
//    - Explain about the Method Reference, How many ways we can refer to an existing
//      implementation explain with examples.

//    Java provides a new feature called method reference in Java 8. Method reference is used to refer method of functional interface.
//    It is compact and easy form of lambda expression. Each time when you are using lambda expression to just referring a method,
//    you can replace your lambda expression with method reference.


//    There are three types of methods refrences
//    1.Reference to a static method.
//    2.Reference to an instance method.
//    3.Reference to a constructor.


//   1. Static Method:-
    //You can refer to static method defined in  Main the class.
    // Following is the syntax and example which describe the process of referring static method in Java
//  Syntax:
//            ContainingClass::staticMethodName

//    Examples:-
//           interface Sayable{
//              void say();
//            }
//              public class MethodReference {
//                  public static void saySomething(){
//                     System.out.println("Hello, this is static method.");
//              }
//                     public static void main(String[] args) {
//                      // Referring static method
//                           Sayable sayable = MethodReference::saySomething;
//                    // Calling interface method
//                     sayable.say();
//        }
//    }
//Output:Hello this is static method.


//    2 Non-Static Methods
//    like static methods, you can refer Non-static  methods also.
//    In the following example, we are describing the process of referring the instance method.

//    Syntax:-    containingObject::instanceMethodName\


//    Examples:-
//interface Sayable{
//    void say();
//}
//    public class InstanceMethodReference {
//        public void saySomething(){
//            System.out.println("Hello, this is non-static method.");
//        }
//        public static void main(String[] args) {
//            InstanceMethodReference methodReference = new InstanceMethodReference(); // Creating object
//            // Referring non-static method using reference
//            Sayable sayable = methodReference::saySomething;
//            // Calling interface method
//            sayable.say();
//        }
//}
//    Output:-  This is,non-static Methods



//    3   Cunstructor
//              You can refer a constructor by using the new keyword.
//              Here, we are referring constructor with the help of functional interface.
//              Syntax   ClassName::new

//    Examples:-

//    interface Messageable{
//        Message getMessage(String msg);
//    }
//    class Message{
//        Message(String msg){
//            System.out.print(msg);
//        }
//    }
//    public class ConstructorReference {
//        public static void main(String[] args) {
//            Messageable hello = Message::new;
//            hello.getMessage("Hello");
//        }
//    }
//    Output:-Hello
}


