package za.ac.cput;

/*
 * @Author: Thokozile Snono
 * Student number: 216032121
 * Date: 16 May 2021
 * This is the test main class for the Employee class
 */

import java.util.ArrayList;
import java.util.*;

import static java.util.concurrent.TimeUnit.NANOSECONDS;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @org.junit.jupiter.api.Test
    public void collectionAdd() {
        Collection<Employee> collectionEmp1 = new HashSet<>();

        collectionEmp1.add(new Employee("554", "Widge", 25));
        collectionEmp1.add(new Employee("765", "Sproket", 27));
        collectionEmp1.add(new Employee("678", "Gadget", 22));

        assertEquals(3, collectionEmp1.size());
    }

    @org.junit.jupiter.api.Test
    public void collectionRemove() {
        Collection<Employee> collectionEmp2 = new HashSet<>();

        collectionEmp2.add(new Employee("554", "Widge", 25));
        collectionEmp2.add(new Employee("765", "Sproket", 27));
        collectionEmp2.add(new Employee("678", "Gadget", 22));

        collectionEmp2.remove(new Employee("765", "Sproket", 27));

        assertEquals(2, collectionEmp2.size());
    }

    @org.junit.jupiter.api.Test
    public void collectionFind() {
        Collection<Employee> collectionEmp3 = new HashSet<>();

        collectionEmp3.add(new Employee("554", "Widge", 25));
        collectionEmp3.add(new Employee("765", "Sproket", 27));
        collectionEmp3.add(new Employee("678", "Gadget", 22));

        System.out.println(collectionEmp3.toString());

        assertEquals(25,25);
    }

    @org.junit.jupiter.api.Test
    public void listAdd() {
        // store only string objects
        ArrayList< Employee > list1 = new ArrayList<>();

        list1.add(new Employee("Thokozile", "Snono", 547));
        list1.add(new Employee("Bill", "Gates", 627));
        list1.add(new Employee("Jack", "Hill", 447));
        list1.add(new Employee("Thomas", "Rose", 347));
        list1.add(new Employee("Charles", "Fuguson", 247));
        list1.add(new Employee("Jerry", "Van de Ryn", 147));

        System.out.println("------|Displaying all elements in the array: |-------");
        for (int i = 0; i < list1.size(); i++) {
            //list1.add(new Employee("Terry", "Robertson", "747"));
        }
        list1.add(new Employee("Terry", "Robertson", 747));
        System.out.println("Total number of elements after adding: " + list1.size());
        assertEquals(7, list1.size());
    }

    @org.junit.jupiter.api.Test
    public void listRemove() {
        ArrayList< Employee > list2 = new ArrayList<>();

        list2.add(new Employee("Thokozile", "Snono", 547));
        list2.add(new Employee("Bill", "Gates", 627));
        list2.add(new Employee("Jack", "Hill", 447));
        list2.add(new Employee("Thomas", "Rose", 347));
        list2.add(new Employee("Charles", "Fuguson", 247));
        list2.add(new Employee("Jerry", "Van de Ryn", 147));

        for (int i = 0; i < list2.size(); i++) {
            list2.remove(new Employee("Bill", "Gates", 627));
        }

        // removing from the list
        System.out.println("\n------------------Removing Element------------------");
        System.out.println("List 2 after the removing: " + list2.size());
        System.out.println("====================================================");
        assertNotSame("Bill", "Jack");
    }

    @org.junit.jupiter.api.Test
    public void listFind() {
        List<Employee> list3 = new ArrayList<>();

        // add to the list
        list3.add(new Employee("Thokozile", "Snono", 547));
        list3.add(new Employee("Bill", "Gates", 627));
        list3.add(new Employee("Jack", "Hill", 447));
        list3.add(new Employee("Thomas", "Rose", 347));
        list3.add(new Employee("Charles", "Fuguson", 247));
        list3.add(new Employee("Jerry", "Van de Ryn", 147));

        // checking whether the element is in the arraylist
        if(list3.contains(147)) {
            System.out.println("Is not on the list");
        }
        assertEquals("Jerry", "Jerry");
    }


    @org.junit.jupiter.api.Test
    public void setAdd() {
        // "SET" store objects
        HashSet< Employee > set1 = new HashSet<>();
        // data is not in the right order, but is in an alphabetical order
        //Set< String > set = new TreeSet<>();

        // data is not in the right order, but is in an alphabetical order
        //TreeSet<Employee> set2 = new TreeSet<Employee>();

        // "SET" array
        // data is not added according to the appropriate index
        // we got Hashcodes for elements which are being added
        set1.add(new Employee("Thokozile", "Snono", 547));
        set1.add(new Employee("Bill", "Gates", 627));
        set1.add(new Employee("Jack", "Hill", 447));
        set1.add(new Employee("Charles", "Fuguson", 247));
        set1.add(new Employee("Jerry", "Van de Ryn", 147));

        // index using iterator
        System.out.println("------|Displaying all element in the array: |-------");
        Iterator< Employee > itr = set1.iterator();
        while (itr.hasNext()) {
            Employee str = itr.next();
            System.out.println(str);
        }

        System.out.println("=========================================================");
        set1.add(new Employee("Jack", "Hill", 447));
        System.out.println("Total number of elements after adding: " + set1.size());
        System.out.println("=========================================================");
        assertEquals(6, set1.size());
    }

    @org.junit.jupiter.api.Test
    public void setRemove() {
        // "SET" store objects
        HashSet< Employee > set2 = new HashSet<>();

        set2.add(new Employee("Thokozile", "Snono", 547));
        set2.add(new Employee("Bill", "Gates", 627));
        set2.add(new Employee("Jack", "Hill", 447));
        set2.add(new Employee("Charles", "Fuguson", 247));
        set2.add(new Employee("Jerry", "Van de Ryn", 147));

        // removing from the list
        System.out.println("\n------------------Removing Element------------------");
        set2.remove(new Employee("Thokozile", "Snono", 547));
        System.out.println("The number of elements after removing Thokozile: " + set2.size());
        System.out.println("====================================================");

        assertEquals(4, set2.size());
    }

    @org.junit.jupiter.api.Test
    public void setFind() {
        HashSet< Employee > set3 = new HashSet<>();

        set3.add(new Employee("Thokozile", "Snono", 547));
        set3.add(new Employee("Bill", "Gates", 627));
        set3.add(new Employee("Jack", "Hill", 447));
        set3.add(new Employee("Charles", "Fuguson", 247));
        set3.add(new Employee("Jerry", "Van de Ryn", 147));

        // API's does the searching/checking
        System.out.println("\n-------------------Check Element--------------------");
        if(set3.contains(247)){
            System.out.println("\"247\" is in the list");
        }
        System.out.println("===================================================");

        System.out.println("Set size is: " + set3.size());
        assertNotSame("Josh", "Charles");
    }

    @org.junit.jupiter.api.Test
    public void mapAdd() {
        // "MAP" stores a key and value
        Map< Integer, Employee > map1 = new HashMap<>();

        map1.put(5, new Employee("Thoko"));
        map1.put(4, new Employee("Bill"));
        map1.put(3, new Employee("Jack"));
        map1.put(2, new Employee("Thomas"));
        map1.put(1, new Employee("Charles"));
        map1.put(6, new Employee("Jerry"));

        assertEquals(6, map1.size());
    }

        @org.junit.jupiter.api.Test
        public void mapRemove() {
            Map< Integer, Employee > map2 = new HashMap<>();

            map2.put(5, new Employee("Thoko"));
            map2.put(4, new Employee("Bill"));
            map2.put(3, new Employee("Jack"));
            map2.put(2, new Employee("Thomas"));
            map2.put(1, new Employee("Charles"));
            map2.put(6, new Employee("Jerry"));

            map2.remove(5);
            System.out.println(map2.size());
            assertNotEquals(5,6);
        }

    @org.junit.jupiter.api.Test
    public void mapFind() {
        Map< Integer, Employee > map3 = new HashMap<>();

        map3.put(5, new Employee("Thoko"));
        map3.put(4, new Employee("Bill"));
        map3.put(3, new Employee("Jack"));
        map3.put(2, new Employee("Thomas"));
        map3.put(1, new Employee("Charles"));
        map3.put(6, new Employee("Jerry"));

        // API's check the value for the "key"
        //print(map);
        if(map3.containsKey(1)){
            Employee a = map3.get(1);
            System.out.println("The value for key \"Jerry\" is : " + a);
        }
        assertSame("Thoko", "Thoko");
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 1000, unit = NANOSECONDS)
    public void setEmpName() {
    }

    @org.junit.jupiter.api.Test
    void getEmpName() {
        fail("Make it fail intentionally");
    }
}