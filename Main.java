    import java.util.*;
    public class Main{

        public static void main(String args[]){
            

            Map<String,Contacts>map = new HashMap<>();

            map.put("c1",new Contacts("c1","ramu", "6385686333", "ramu@gmail.com"));
            map.put("c2",new Contacts("c2","somu", "6356896333", "somu@gmail.com"));
            map.put("c3",new Contacts("c3","kabali", "6856525895", "kabali@gmail.com"));
            map.put("c4",new Contacts("c4","snakeBabu", "689547512365", "snkaeBabu@gmail.com"));

            Scanner sc = new Scanner(System.in);
            Service service = new Service(map);

            System.out.println("\nWelcome to The  Contacts Diary\n");
            while(true){
                System.out.println("\n1.Add Contancts\n2.Search Contacts\n3.Update contacts\n4.Delete contacts\n5.Exit");
                System.out.print("\nEnter your option  :");

                int op = sc.nextInt();
                sc.nextLine();
                switch(op){
                    case 1:{
                    service.addContact(sc);
                    break; 
                    }
                    case 2:{
                        service.searchContact(sc);
                        break;

                    }
                    case 3:{
                        service.updateContacts(sc);
                        break;
                    }
                    case 4:
                        service.deleteContact(sc);
                        break;

                    case 5:
                        return;
                    
                    default:
                        System.out.println("Invalid Option");


                }

            }    
        }
    }