
package casting01;

public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
        byte something = 127;
        
        //Declare and initialize a short with a value of 128
        //Create a print statement that casts this short to a byte
        byte casting;
        short somethingElse = 128;
        casting = (byte)somethingElse;
        System.out.println(casting);
        
        
        //Declare and initialize a byte with a value of 127
        //Add 1 to this variable and print it
        //Add 1 to this variable again and print it again
        byte cancer = 127;
        cancer = ++cancer;
        System.out.println(cancer);
        cancer = ++cancer;
        System.out.println(cancer);
        
        
    }    
}
