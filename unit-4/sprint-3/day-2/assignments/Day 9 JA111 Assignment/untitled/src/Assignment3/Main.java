package Assignment3;

public class Main {

        public static void main(String[] args) {
            Animal a=new Animal();
            Animal animal[]=new Animal[3];
            Animal a1=new Cat();
            Animal a2=new Dog();
            Animal a3=new Tiger();

            animal[0]=a1;
            animal[1]=a2;
            animal[2]=a3;
            for(int i=0;i<3;i++){
                animal[i].eat();
                animal[i].walk();
                animal[i].makeNoise();
            }

        }
    }

    class Animal {
        public void makeNoise() {
            System.out.println("Animal making Noise");
        }

        public void eat() {
            System.out.println("Animal is eating");
        }

        public void walk() {
            System.out.println("Animal is walking");
        }
    }
    class Dog extends Animal{
        @Override
        public void makeNoise(){
            System.out.println("Barking.....");
        }
    }
    class Cat extends Animal{
        @Override
        public void makeNoise(){
            System.out.println("Mew.....");
        }
    }
    class Tiger extends Animal {
        @Override
        public void makeNoise(){
            System.out.println("Roaring.....");
        }

}
