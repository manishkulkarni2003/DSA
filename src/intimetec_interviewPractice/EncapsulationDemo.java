package intimetec_interviewPractice;

class EncapsulationDemo{
    public static void main(String[]args){
        Encapsulation obj =new Encapsulation();
        obj.setName("Manish");
        System.out.println(obj.getName());
    }
} 
class Encapsulation{
    private String name;
    private int age;
    
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
