package prak1.task1;
import java.lang.*;
//Класс - это элемент, образующий основу Java, так как он определяет форму и сущность объекта
public class Dog { //метод доступным и для всех других объектов в системе
    private String name;
    private int age;
    //Конструктор – это специальный метод класса, который имеет то же имя,
    //что используется в качестве имени класса
    public Dog(String n, int a){
        name = n;
        age = a;
    }
    public Dog(String n){
        name = n;
        age = 0;
    }
    public Dog(){
        name = "Pup";
        age = 0;
    }
    // “get” — “получать” (т.е. “метод для получения значения поля”) и set — “устанавливать”
// (т.е. “метод для установки значения поля”).
    //сеттер — это полноценный метод. А в метод,
// в отличие от поля, ты можешь заложить необходимую тебе логику проверки, чтобы не допустить неприемлемых значений
    public void setAge(int age) {
        this.age = age;
    }
    //ключевое слово this, которое в данном случае укажет, что нужно вызывать переменную не метода, а класса
//Ключевое слово void в Java позволяет нам создать методы, не производящие возврат значения
    //То есть this сошлется на вызвавший объект
    public void setName(String name) {
        this.name = name;
    }
    //Класс String в Java — это final класс, который не может иметь потомков.
    public String getName(String name){
        return name;
    }
    public int getAge() {
        return age;
    }
    public String toString(){
        return this.name+", age "+this.age;
    }
    //Каждый объект в Java может быть преобразован в строку через метод toString, унаследованный всеми Java-классами от класса Object
    public void intoHumanAge(){
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }
}

