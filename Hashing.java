import java.util.*;     // It contains all the packages required for hashing

class HashTechniques 
{
    void Hashtable()
    {
        Hashtable<Integer, String> t = new Hashtable<Integer,String>(); // Creation of HashTable
        t.put(100,"Shrey");     // Inserting the values
        t.put(101,"Aryan");
        t.put(102,"Tanishq");
        t.put(103,"Yash");
        System.out.println(t);
        
        System.out.println(t.get(102));     // Searching the key
        
        t.remove(102);      // Deleting a key
        System.out.println(t);
        
        System.out.println(t.containsKey(100));  //Gives boolean value - true (Key is found)
        System.out.println(t.containsKey(106));  //Gives boolean value - false (Key is not found)
        
        System.out.println(t.containsValue("Shrey"));  //Searching a value - true
        System.out.println(t.containsValue("Y"));      //Searching a value - false
        
        System.out.println(t.keySet());     // Prints only keys
        System.out.println(t.values());     // Prints on values
        
        for (int k:t.keySet())              // Iterating K across the keys
        {
            System.out.println(k+"   "+t.get(k));       // Prints the key and the corresponding value
        }
        
    }

    void Hashmap()
    {
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println("");
    
        //Insertion into the HashMap
        //Storing names and roll no.
        map.put("Shrey", 93);       // Inserting values
        map.put("Tanishq", 112);
        map.put("Aryan", 92);
        map.put("Yash", 71);
        System.out.println("***** REQUIRED HASHMAP *****\n");
        System.out.println(map);            // Printing hashmap
        System.out.println("");

        System.out.println(map.containsKey("Jay")); // Boolean value
    
        //Searching whether a particular subject exists in the marksheet or not
        if(map.containsKey("Jay"))
        {
            System.out.println("Jay is present in the map");
        } else
        {
            System.out.println("Jay is not present in the map");
        }

        System.out.println("");
    
        // We can find out the value of a entered key. If the key is present, it will print its value
        System.out.println("Shrey's Roll No : " + map.get("Shrey")); 
        System.out.println("\nTanishq's Roll No : " + map.get("Tanishq")); 
        System.out.println("\nAryan's Roll No : " + map.get("Aryan")); 
        System.out.println("\nYash's Roll No : " + map.get("Yash")); 
        System.out.println("\nJay's Roll No : " + map.get("Jay"));        //null

        System.out.println("");
    
        // We can also print the contents using specialised for loop 
        for( Map.Entry<String, Integer> e : map.entrySet())
        {
            System.out.print(e.getKey() + " ");
            System.out.println(e.getValue());
        }

        System.out.println("");
    
        // We can also remove a certain content from the map
        map.remove("Shrey");
        map.put("Jay",98);
        
        System.out.println("***** UPDATED HASHMAP IS *****\n");
        // Printing the new map
        System.out.println(map);
        System.out.println("");
    }

    void LinkedHashmap()
    {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        System.out.println("");
    
        //Insertion into the HashMap
        //Storing names and roll no.
        map.put("Shrey", 93);
        map.put("Tanishq", 112);
        map.put("Aryan", 92);
        map.put("Yash", 71);
        System.out.println("***** REQUIRED HASHMAP *****\n");
        System.out.println(map);
        System.out.println("");
    
        //Searching whether a particular subject exists in the marksheet or not
        if(map.containsKey("Jay"))
        {
            System.out.println("Jay is present in the map");
        } else
        {
            System.out.println("Jay is not present in the map");
        }

        System.out.println("");
    
        // We can find out the value of a entered key. If the key is present, it will print its value
        System.out.println("Shrey's Roll No : " + map.get("Shrey")); 
        System.out.println("\nTanishq's Roll No : " + map.get("Tanishq")); 
        System.out.println("\nAryan's Roll No : " + map.get("Aryan")); 
        System.out.println("\nYash's Roll No : " + map.get("Yash")); 
        System.out.println("\nJay's Roll No : " + map.get("Jay"));        //null

        System.out.println("");
    
        // We can also print the contents using for loop
        for( Map.Entry<String, Integer> e : map.entrySet())
        {
            System.out.print(e.getKey() + " ");
            System.out.println(e.getValue());
        }

        System.out.println("");
    
        // We can also remove a certain content from the map
        map.remove("Shrey");
        map.put("Jay",98);
        System.out.println("***** UPDATED HASHMAP IS *****\n");

        // Printing the new map
        System.out.println(map);
        System.out.println("");
    }

    

    void Hashset()
    {
        HashSet<String> set = new HashSet<>();
      
       //Insertion
       set.add("SHREY");
       set.add("TANISHQ");
       set.add("ARYAN");
       set.add("YASH");
       set.add(null);           // Hashset can store null values
 
       //Size
       System.out.println("Size of set is : " + set.size());

       System.out.println("THE REQUIRED SET IS : " + set);      // Printing the set
 
       //Searching - Checking value present in the set
       if(set.contains("SHREY"))
       {
           System.out.println("\nELEMENT IS PRESENT IN THE SET");
       }
       else
       {
        System.out.println("\nELEMENT IS NOT PRESENT IN THE SET");
       }
 
       //Checking a value missing from the set
       if(!set.contains("JAY"))
       {
           System.out.println("\nELEMENT IS NOT PRESENT IN THE SET");
       }
 
       //Deletion
       set.remove("SHREY");
 
       //Print all elements
       System.out.println("\nSET AFTER DELETION : " + set);     // Updated set
 
       //Iteration - Printing elements using iterator
       Iterator it = set.iterator();
       while (it.hasNext())
       {
            System.out.print(it.next() + ", ");
       }
       System.out.println();
 
       //CHECKING IF SET IS EMPTY
       if(!set.isEmpty())
       {
           System.out.println("\nSET IS NOT EMPTY");
       }
    }
}

public class Hashing
{
    public static void main(String[] args)
    {
        HashTechniques obj = new HashTechniques();          // Declaring the object for the HashTechniques class
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("***** MAIN MENU *****\n1. Hashtable\n2. Hashmap\n3. Linked Hashmap\n4. Hashsets\n5. Exit");
        do
        {
            System.out.print("Enter your choice : ");
            choice=sc.nextInt();

            switch(choice)
            {
                case 1 : System.out.println("***** IMPLEMENTING HASHTABLES *****");
                            obj.Hashtable();        // Calling the functions through object
                            break;
                
                case 2 : System.out.println("***** IMPLEMENTING HASHMAPS *****");
                            obj.Hashmap();
                            break;

                case 3 : System.out.println("***** IMPLEMENTING LINKED HASHMAPS *****");
                            obj.LinkedHashmap();
                            break;
                
                case 4 : System.out.println("***** IMPLEMENTING HASHSETS *****");
                            obj.Hashset();
                            break;

                case 5 : break;

                default : System.out.println("INVALID CHOICE...!!!");
                            break;
            }
        }while(choice<5);
    }
}
