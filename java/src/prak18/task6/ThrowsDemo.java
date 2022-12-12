package prak18.task6;

public class ThrowsDemo {
    public static void printMessage(String key) {
        String message = null;
        try{
            message = getDetails(key);
        }catch (Exception e){
            System.out.println("key is null!");
            return;
        }
        System.out.println( message );
    }
    public static String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for" + key;
    }
    public static void main(String[] args) {
        String key = null;
        printMessage(key);
    }
}