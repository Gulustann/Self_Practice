package day28_Encapsulation.credentials;

public class Credentials {
    private String username, password;

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        int numberOfChar = 0;
        int numberOfLetters = 0;
        int numberOfDigits = 0;
        int numberOfSpecialChar = 0;
        for (char each : password.toCharArray()) {
            if (each == ' ') {
                System.err.println("Password cannot contain any space");
                System.exit(1);
            }
            numberOfChar++;
            if (Character.isLetter(each)) {
                numberOfLetters++;
            } else if (Character.isDigit(each)) {
                numberOfDigits++;
            } else {
                numberOfSpecialChar++;
            }
        }
        if (!(numberOfChar >= 8 && numberOfLetters >= 1 && numberOfDigits >= 1 && numberOfSpecialChar >= 1)) {
            System.err.println("Invalid password. Password should contain at least 8 characters that has at least one letter, " +
                    "one special character and one digit");
            System.exit(1);
        }

        this.password = password;
    }

    public boolean isStrongPassword() {
        return true;
    }

    public String toString() {
        return "Credentials{" +
                "username='" + getUsername() + '\'' +
                ", password='" + getPassword() + '\'' +
                '}';
    }

    /*
     create a class named Credentials
            Variables:
                username, password

            Encapsulate all the fields
                    (password MUST be a strong password)


            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password, returns boolean
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                toString()





     */
}
