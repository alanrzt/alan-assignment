import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
      
class Employee
{
     public String firstname ;
     public String lastname ;
    
     Employee(String firstname , String lastname)
     {
        this.firstname = firstname;
        this.lastname = lastname;
     }
}


public class TrippleEssToys {
       public static void main(String[] args) {
              ArrayList<Employee> list = new ArrayList<Employee>();
              list.add(new Employee("Narendra","Modi"));
              list.add(new Employee("Sachin","Tendulkar"));
              list.add(new Employee("Indira","Gandhi"));
              list.add(new Employee("Barak","Obama"));
              list.add(new Employee("Barak","Bush"));
              list.add(new Employee("Donald","Trump"));
             
             
              // Prining the random employee
              Employee e = findRandomEmployee(list);
              System.out.println("Free toy is for :");
              System.out.println("Firstname: "+e.firstname + "\t Lastname: "+e.lastname);
             
              // preparing the unique name list
              prepareUniqueListName(list);
             
              // finding the popular list of employees
              findpopularEmployeeName(list);
             
       }
      

       // function to find the popular Employee name
       private static void findpopularEmployeeName(ArrayList<Employee> list) {
      
              Map<String, Integer> frequency = new HashMap<String, Integer>();
              ArrayList<String> templist = new ArrayList<String>();
             
              for(Employee e : list)
              {
                     Employee temp = e;
                     templist.add(temp.firstname.toLowerCase());
              }
             
             
              for (String element : templist) {
                  if (frequency.containsKey(element)) {
                      frequency.put(element, frequency.get(element) + 1);
                  }
                  else {
                      frequency.put(element, 1);
                  }
              }
             
             
              for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
                  System.out.print(entry.getKey() + " = " + entry.getValue() + " ");
              }
             
              System.out.println();
       }

      
    // Function to prepare the unique first name list of the employee
       private static void prepareUniqueListName(ArrayList<Employee> list) {
             
              // Customized Comparator to implement the ignore case unique element
              final Comparator<String> IGNORE_CASE = new Comparator<String>() {
                      public int compare(String s1, String s2) {
                          return s1.compareToIgnoreCase(s2);
                      }
                  };
        
              SortedSet<String>  uniquefirstname = new TreeSet<String>( IGNORE_CASE);
             
              for(Employee e : list)
              {
                     Employee temp = e;
                     uniquefirstname.add(temp.firstname);
              }
             
              System.out.println("Unique First Name : ");
             
              for( String s : uniquefirstname )
              {
                     System.out.println(s);
              }
             
    }
      
   
       //  Function to find the random employee from the list
       private static Employee findRandomEmployee(ArrayList<Employee> list) {
              int size = list.size();
              //System.out.println("size "+size);
              int rand = new Random().nextInt(size);
              //System.out.println(rand);
              Employee e =list.get(rand);
              return e;
       }
}
