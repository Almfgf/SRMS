
package srms;

public class Person{
    
    private String name;
    private int id ;
    private int age ;
    
    public Person(String name , int id , int age){
        this.name = name ;
        this.id = id ;
        this.age = age ;
    }
    public String getName(){
        return name;
    }
    
    public int getId(){
        return id;
        
    }
    
    public int getAge(){
        return age ;
    }
    
              public void setName(String name){
        try{
            if(name == null || name.isEmpty()){
                throw new Exception("name cannot be empty!!");
            }
            this.name = name;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        }
    
    public void setId(int id){
        
        try{
            if (id <= 0 ) throw new Exception("ID be positive");
            this.id = id;
        }
        catch (Exception a){
            System.out.println(a.getMessage());
        }
    }
    
    public void setAge(int age){
        try {
            if (age < 0) throw new Exception("age cnat be negative");
            this.age = age ;
        }
        catch (Exception c){
            System.out.println(c.getMessage());
        }
    }
    
    
  
    
    public void display(){
System.out.println("student info");
        System.out.println("NAME" + name );
                System.out.println("ID " + id);
System.out.println(" AGE " + age);

}
   
}

