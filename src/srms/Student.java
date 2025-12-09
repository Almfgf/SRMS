
//package srms;


public class Student  extends Person {
    
    private String major ;
    private double gpa ;
    
    public Student(String name , int id , int age , String major , double gpa){
        super(name , id , age );
        this.major = major ;
        this.gpa = gpa;
    }
    
    public String getMajor(){
        return major;
    }
    
    public double getGpa(){
        return gpa;
    }
    
    public void setMajor(String major){
        try {
            if(major == null  || major.isEmpty()){
                throw new Exception("major cnnot be empty");
            }
                            this.major = major;
}
            catch (Exception m){
                    System.out.println(m.getMessage());
                    }
        
    }
    
    public void setGpa(double gpa){
        try{
            if (gpa < 0.0 || gpa > 5.0 ){
                throw new Exception ("must be between 0 and 5 ");
            }
            this.gpa = gpa;
        }
        catch (Exception g){
            System.out.println(g.getMessage());
        }
    }
    
    @Override
    public void display(){
        System.out.println("student infor");
                System.out.println("MAJPR" + major);
                        System.out.println("GPA" + gpa);


    }
}
