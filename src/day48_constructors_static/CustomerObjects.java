package day48_constructors_static;

import day36_methods_with_return.info;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1.toString()); // print with default values that are set in no -args constructions
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike",2);//create object and assign values in same statement
        Customer cs3 = new Customer("John Ward III",4873);
        System.out.println(cs2);
        System.out.println(cs3);


        //int[nums = new int[5];
        //Customer[] customerArray = new Customer[3];

        //array of customers
        Customer[] todaysCustomers = {cs1,cs2,cs3,new Customer("Bashir", 449)};

       // List<Integer> numsList = newArrayList<>();

        //arrayList of Customer objects
        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Adam",777));
        customerList.add(new Customer("Noah",444));

        //print info of first customer object in array
        System.out.println("================================================");

        System.out.println(todaysCustomers[0].toString());
        System.out.println(customerList.get(0).toString());

        System.out.println(customerList); //print to String() info of all Customer objects

        System.out.println("=================ForLoop========================");

        for(int i=0;i<customerList.size();i++){
            System.out.println(customerList.get(i));
    }
        System.out.println("=================For Each Loop==================");
        for(Customer eachCustomer : customerList){
        System.out.println(eachCustomer);
    }
        //print only names of Customers in the list
        System.out.println("===============Names of Customers===============");
        //forEach method and lambda expression
        for(Customer eachCustomer :customerList){
            System.out.println(eachCustomer.getName());// for Each method for getting name
        }
        System.out.println("---------------------------------------------------");
       customerList.forEach(each-> System.out.println(each.getName()));//lambda expression for getting name

    }

}








