package intimetec_interviewPractice;

class Main{
    public static void main(String[] args){
        car obj=new car("BMW",100,4);
        obj.displayCarInfo();
    }
}
class Vehicle{
    public String brand;
    public int speed;
    Vehicle(String brand,int speed){
        this.brand=brand;
        this.speed=speed;
    }
    void displayInfo(){
        System.out.println("Brand:"+brand+" "+"speed:"+speed);
    }
}
class car extends Vehicle{
    public int doors;
    car(String brand,int speed,int doors){
        super(brand,speed);
        this.doors=doors;
    }
    void displayCarInfo(){
        System.out.println("Brand:"+brand+" "+"speed:"+speed+" "+"doors:"+doors);
    }
}
