class Animal
{
public void animalSound()
{
System.out.println("the animal makes a sound");
}
}
class Pig extends Animal
{
public void animalSound()
{
System.out.println("the pig says: boo boo");
}
}
class Dog extends Animal
{
public void animalSound()
{
System.out.println("the dog says: baw baw");
}
}
class MyMainClass
{
public static void main(String args[])
{
Animal myAnimal=new Animal();
Animal myPig=new Pig();
Animal myDog=new Dog();
myAnimal.animalSound();
myPig.animalSound();
myDog.animalSound();
}
}