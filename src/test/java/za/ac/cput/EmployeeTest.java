package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.*;

import static java.util.concurrent.TimeUnit.NANOSECONDS;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    // 1. "LIST" store only string objects
    ArrayList< String > list1 = new ArrayList<>();
    //store any types of Objects
    //ArrayList list2 = new ArrayList();

    // 2. "SET" store objects
    //HashSet< String > set = new HashSet< String >();
    // data is not in the right order, but is in an alphabetical order
    TreeSet< String > set = new TreeSet<>();

    //3. "MAP" stores a key and value
    HashMap< String, Integer > map = new HashMap<>();

    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
        //3. "LIST" array
        list1.add("Thokozile");
        list1.add("Charles");
        list1.add("Judy");
        list1.add("Jack");
        list1.add("Thomas");
        list1.add("Charles");

        //add to the list2
//        list2.add("Codes");
//        list2.add(5);
//        list2.add(6);
//        list2.add(7);
//        list2.add(8);

        //4. "SET" array
        //data is not added according to the appropriate index
        //we got Hashcodes for elements which are being added
        set.add("Thokozile");
        set.add("James");
        //set.add("Charley");
        set.add("Kim");
        set.add("Rayvan");
        set.add("William");
        set.add("Charley");

        //5. "MAP" array
        //"print(map)" will be empty because printing without doing anything
        map.put("Charely", 654);
        map.put("James", 664);
        //map.put("Kim", 897);
        map.put("Thokozile", 654);
        map.put("Williams", 347);
        map.put("Kim", 765);
        map.put("Rayvan", 598);
    }

    @org.junit.jupiter.api.Test
    public void testListEquality() {
        System.out.println("------|Displaying all elements in the array: |-------");
        for (int i = 0; i < list1.size(); i++) {
            String empSurname = "Jerry" + 1;
            //Employee a = new Employee(empSurname);
            //list1.add(a);
            System.out.println(list1.get(i));
        }

        //6. duplicates are not eliminated in the list
        System.out.println("====================================================");
        System.out.println("Total number of Elements is: " + list1.size());
        System.out.println("====================================================");
        //assertEquals("Thokozile", "Thokozile", "It is equal");
        assertEquals(6, list1.size());
    }

    @org.junit.jupiter.api.Test
    public void setSetNotEqual() {
        //7. index using iterator
        System.out.println("------|Displaying all element in the array: |-------");
        Iterator< String > itr = set.iterator();
        while (itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
        }

        //8. remove element
        System.out.println("\n-------------|Removing Element: |----------------");
        set.remove("James");
        System.out.println("After removing James: \n" + set);
        //set.remove("Charley");
        //set.remove("Kim");
        System.out.println("===================================================");

        System.out.println("\n-------------|Number of Elements: |----------------");
        //9. does not include duplicates
        System.out.println("The total number of Elements is: " + set.size());
        System.out.println("!!!!Duplicate elements eliminated!!!!");
        System.out.println("===================================================");
        assertNotEquals("James", "Kim");
        //assertSame("Rudy", "James");
    }

    @org.junit.jupiter.api.Test
    public void testMapIdentity() {
        //10. the "key" is a duplicate it will not be part of the index output. It must be unique
        map.put("Kim", 765);

        //11. the "value" is a duplicate it will be part of the index output. A value must have unique key
        map.put("Jacky", 654);

        System.out.println("-------------------|Displaying all number of elements: |-----------------------");
        System.out.println(map);
        System.out.println("Map size is: " + map.size());
        System.out.println("===============================================================================");

        //12. API's check the value for the "key"
        System.out.println("\n--------------------------|Check Element (VALUE): |--------------------------");
        print(map);
        if (map.containsKey("Kim")) {
            Integer a = map.get("Kim");
            System.out.println("The value for key \"Kim\" is : " + a);
        }
        //map.clear();
        //print(map);
        System.out.println("==============================================================================");

        //13. API's check the key for the "value"
        System.out.println("\n-----------------------|Check Element (KEY): |------------------------------");
        print(map);
        if (map.containsValue(654)) {
            Integer b = map.get(654);
            System.out.println("The key for the value \"654\" is : " + b);
            System.out.println("!!!!The key is null because the value has duplicates values!!!!");
        }
        //print(map);
        System.out.println("============================================================================");
        assertNotSame("Bill-", "Thokozile");
        //assertEquals(650, map.size());
    }

    public static void print(Map< String, Integer > map) {
        if (map.isEmpty()) {
            System.out.println("Map is empty");
        } else {
            System.out.println(map);
        }
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 1000, unit = NANOSECONDS)
    public void setEmpName(){
    }
}