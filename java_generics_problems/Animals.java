import java.util.*;
class Animal{ public String toString(){return getClass().getSimpleName();} }
class Dog extends Animal{}
class Cat extends Animal{}
class AnimalPrinter{
    public static void printAnimals(java.util.List<? extends Animal> animals){
        for(Animal a:animals)System.out.println(a);
    }
}
class AnimalDemo{
    public static void main(String[] args){
        java.util.List<Dog> dogs=java.util.Arrays.asList(new Dog(),new Dog());
        java.util.List<Cat> cats=java.util.Arrays.asList(new Cat(),new Cat());
        AnimalPrinter.printAnimals(dogs);
        AnimalPrinter.printAnimals(cats);
    }
}
