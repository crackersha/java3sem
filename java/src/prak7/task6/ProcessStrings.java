package prak7.task6;

public class ProcessStrings implements Stringable{
    private String str;

    public ProcessStrings(String str){
        this.str = str;
    }

    public int getLength(){
        return this.str.length();
    }

    public String oddCharacters() {
        String res = "";
        for (int i = 0; i < this.getLength(); i+=2){
            res += str.charAt(i);
        }
        return res;
    }

    public String invert() {
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--){
            res += str.charAt(i);
        }
        return res;
    }
}
