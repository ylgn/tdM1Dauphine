package Exercice_Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Object test = new Object();
        System.out.println(test.getClass().toString());
        Logger.log(test, "lol");
        classeDeTest a = new classeDeTest();
        
    }
}
