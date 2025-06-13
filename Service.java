import java.util.*;
class Service {
    Map<String,Contacts>map;

    public Service(Map<String,Contacts>map){
        this.map =map;
    }
    public  void addContact(Scanner sc){ 
        
        System.out.print("Enter the ID :");
        String id = sc.nextLine();

        System.out.print("Enter the Name  :");
        String name = sc.nextLine();
        if(map.containsKey(name)){
            System.out.println("\nThis Name is Aldredy Taken !\nTry Different Names...");
            addContact(sc);
        }else{


            System.out.print("Enter the Mobile Number :");
            String num = sc.nextLine();

            System.out.print("Enter the Email :");
            String email = sc.nextLine();

            Contacts contact = new Contacts(id,name,num,email);
            map.put(id,contact);


            System.out.println("\n"+name + "   Contact Added Success");
            contact.display();
        }


    }
    public void searchContact(Scanner sc){

        System.out.print("Enter  Search Element  :");
        String name = sc.nextLine();
        boolean found = false;

        for(Contacts contact:map.values()){

            if(name.equals(contact.getName()) || 
            name.equals(contact.getNum() ) 
            ||name.equals(contact.getEmail()) ||name.equals(contact.getId())){
                contact.display();
                found = true;
                break;
             }
        } 
        if(!found){System.out.println(name +" -> Contact Not Found!!");}
    
}

    public void updateContacts(Scanner sc){

        System.out.print("Enter the ID should be update  :");
        String sid = sc.nextLine();
        if(map.containsKey(sid)){

            Contacts contact = map.remove(sid);

            System.out.print("Enter the New ID :");
            String newId = sc.nextLine();
            System.out.print("Enter the New Name :");
            String newName =sc.nextLine();
            System.out.print("Enter the New Number :");
            String newNumber =sc.nextLine();
            System.out.print("Enter the New Email :");
            String newEmail = sc.nextLine();

            Contacts contact1 = new Contacts(newId,newName,newNumber,newEmail);
            map.put(newId,contact1);

            System.out.println("Contact updated successfully\n");
            contact.display();


        }
        else{
            System.out.println("This name Not Exist"); updateContacts(sc);
        }


    }
    public void deleteContact(Scanner sc){
        System.out.print("Enter the ID to be Delete :");
        String deleteName = sc.nextLine();

        if(map.containsKey(deleteName)){
            Contacts contact = map.get(deleteName);
            contact.display();
            System.out.print("Confirm Delete (1=yes/0=no) :");
            int op = sc.nextInt();
            sc.nextLine();

            if(op ==1){
                map.remove(deleteName);
                System.out.println(deleteName+" -> Deleted Successfully");

            }else if(op ==0){
                System.out.println("Delete Cancelled.");

            }else{System.out.println("Invalid option");}



        }else{
            System.out.println("Contact Not Found!!");
            deleteContact(sc);
        }
    }
}

