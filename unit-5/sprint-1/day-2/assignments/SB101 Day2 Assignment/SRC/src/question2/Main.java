package question2;

public  class Main {
    public static void main(String[] args) {
        X x=Integer::parseInt;
        int number=x.convertStringToNumber("3000");
        System.out.println(number);
    }
}
