package intimetec_interviewPractice;

class Student{
    public String name;
    public int rollno;
    public int marks;
    Student(String name,int rollno,int marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
    public void displayDetails(){
        System.out.println("name:"+name+" "+"rollno:"+rollno+" "+"marks:"+marks);
    }
    
    public static void main(String[] args){
        Student obj =new Student("Manish",51,90);
        obj.displayDetails();
        
    }
    
    
}
