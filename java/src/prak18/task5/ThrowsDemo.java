package prak18.task5;

public class ThrowsDemo {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.printMessage(null);
    }
}
//Причиной ошибки, может является, например неправильное
//значение для параметра. Может было бы лучше, если бы метод вызывал
//getDetails() и там решалась бы эта проблема.

/*
public class ThrowsDemo {
 public void getDetails(String key) {
 if(key == null) {
throw newNullPointerException("null key in
getDetails" );
 }
 // do something with the key
 }
}
*/