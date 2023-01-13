import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Fish fish = new Fish();
        fish.setName("Chexon");
        fish.setAge(2);
        fish.setColor("silver white");
        fish.setWeight(2);
        System.out.println("fish name -> " + fish.getName());
        System.out.println("fish age -> " + fish.getAge());
        System.out.println("fish color -> " + fish.getColor());
        System.out.println("fish weight -> " + fish.getWeight());


        System.out.println();


        Parrot parrot = new Parrot();
        parrot.setName("Pirrura");
        parrot.setAge(14);
        parrot.setColor("green-cheeken red-tailed");
        parrot.setWeight("90 gr");
        System.out.println("parrot name -> " + parrot.getName());
        System.out.println("parrot age -> " + parrot.getAge());
        System.out.println("parrot colo -> " + parrot.getColor());
        System.out.println("parrot weight -> " + parrot.getWeight());

        System.out.println();


        Cat cat = new Cat();
        cat.setName("Taiger");
        cat.setAge(4);
        cat.setColor("striped");
        cat.setWeight(4);
        System.out.println("cat name -> " + cat.getName());
        System.out.println("cat age -> " + cat.getAge());
        System.out.println("cat color -> " + cat.getColor());
        System.out.println("cat weight -> " + cat.getWeight());

        System.out.println();

        Dog dog = new Dog();
        dog.setName("Doberman");
        dog.setWeight(42);
        dog.setColor("black");
        dog.setAge(10);
        System.out.println("dog name -> " + dog.getName());
        System.out.println("dog weight -> " + dog.getWeight());
        System.out.println("dog color -> " + dog.getColor());
        System.out.println("dog age -> " + dog.getAge());


    }

}