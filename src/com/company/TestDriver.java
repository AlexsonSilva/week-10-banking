package com.company;

public class TestDriver {
    public static void run(){
        testLogginIn();
        testListOfCustomer();
    }

    private static void testListOfCustomer() {
        ListOfCustomer listOfCustomer = new ListOfCustomer();
        Customer c1 = new Customer("joe", "smith", "joe@gmail.com");
        listOfCustomer.addCustomer(c1);

        Customer c2 = new Customer("alexson", "silva", "alexsonsilva@gmail.com");
        listOfCustomer.addCustomer(c2);



    }

    private static void testLogginIn() {
        LoggingIn li = new LoggingIn();


    }
}
