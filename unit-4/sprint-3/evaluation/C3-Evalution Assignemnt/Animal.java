abstract class Animal {
    void eat(){
        System.out.println("I am eating food");
    }
}

 class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog are eating food");
        super.eat();
    }

    public static void main(String[] args) {
        Animal obj=new Dog();
        obj.eat();
    }
}
