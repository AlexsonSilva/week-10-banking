package com.company;

public class Customer {
    private static char[] letters = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };
    private String fName;
    private String lName;
    private String email;

    public Customer(String _fName, String _lName, String _email) {
        fName = _fName;
        lName = _lName;
        email = _email;
        int countFName = 0;
        int countLName = 0;

            for (int i = 0; i < letters.length; i++) {
                if (_fName.charAt(0) == letters[i]) {
                    countFName = (i + 1);
                }
                if (_lName.charAt(0) == letters[i]) {
                    countLName = (i + 1);
                }

            }
            System.out.printf("The account number is: %c%c-%s-%s-%s, pin code is %s%s\n", _fName.charAt(0), _lName.charAt(0), _fName.length() + _lName.length(), countFName, countLName, countFName, countLName);

    }
}
