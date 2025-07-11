package intimetec_interviewPractice;

class MethodOverRidingDemo{
    public static void main(String[] args){
        Animal obj=new Dog();
        obj.makeSound();
    }
}
class Animal{
    public void makeSound(){
        System.out.println("Some generic Voice from Animal");
    }
}
class Dog extends Animal{
    @Override 
    public void makeSound(){
        System.out.println("Bark");
    }
}
