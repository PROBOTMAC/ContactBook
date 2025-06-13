import java.util.*;
public class Contacts {
    private String id;
    private String name;
    private String num;
    private String email;


    public Contacts(String id,String name,String num,String email){
        this.id = id;
        this.name = name;
        this.num = num;
        this.email =email;

    }

    public void display(){
        System.out.println("************");
        System.out.println("ID  :"+id);
        System.out.println("Name :"+name);
        System.out.println("PhoneNumber :"+num);
        System.out.println("Email :"+email);
        System.out.println("************");
    }
    public void setName(String name) { this.name = name;}
    
    public void setNum(String num) { this.num = num; }

    public void setEmail(String email) { this.email = email; }

    public void setId(String id){this.id = id;}

    public String getName() { return name; }
    public String getNum() { return num; }
    public String getEmail() { return email; }
    public String getId(){return id;}
}

