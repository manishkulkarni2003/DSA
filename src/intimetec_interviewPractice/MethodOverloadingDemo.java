package intimetec_interviewPractice;

class MethodOverloadingDemo{
    public static void main(String[]args){
        MethodA obj=new MethodA();
        int res=obj.add(4,5,7);
        System.out.println(res);
    }
}
class MethodA{
    
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}

