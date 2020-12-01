package com.company;

public class TestDriver {
    public static void run(){
//        testLogginIn();
//        testListOfCustomer();
        testCurrentAccount();
        testSavingAccount();
    }

    private static void testSavingAccount() {
        SavingAccount savingAccount = new SavingAccount("alex", "silva", "alexsonsilva@gmail.com");
        savingAccount.deposit(10000);
        savingAccount.display();
    }

    private static void testCurrentAccount() {
        CurrentAccount currentAccount = new CurrentAccount("joe", "smith", "joe@gmail.com");
        currentAccount.deposit(100);
        currentAccount.display();
        currentAccount.withdraw(50);
        currentAccount.display();
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
