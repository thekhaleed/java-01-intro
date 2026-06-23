/**
 * This program is for trying out class constants
 * @version 1.0 2026-June-23
 * @author thekhaleed
 */

public class DataTypes {
    public static final int MAX_USERS = 3; //Accessible by all methods even outside this class
    private static final int MAX_ATTEMPTS =5; //Accessible just inside this class

    int add(){
        return 1+46;
    }

    public static void main(String[]args){
        System.out.println(MAX_USERS);
        System.out.println(MAX_ATTEMPTS);
    }
}
