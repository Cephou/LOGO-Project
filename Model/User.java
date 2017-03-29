package Model;

import javax.swing.*;

/**
 * @author Groupe 7
 *
 */

public abstract class User {
    String firstName;
    String lastName;
    int age;
    ImageIcon picture;

    public User(String pFirstName, String pLastName, int pAge, ImageIcon pPicture) {
        firstName = pFirstName;
        lastName = pLastName;
        age = pAge;
        picture = pPicture;
    }

}