package prak7.task7and8;

/*Создать статический метод printBooks(Printable[] printable) в классе
Book, который выводит на консоль названия только книг. Используем оператор
instanceof.*/

public class Book implements Printable{
    String book_name;
    public Book(String name){
        book_name = name;
    }

    public void print(){
        System.out.println(book_name);
    }

    public static void printBooks(Printable[] printables){
        for (Printable p: printables){
            if (p instanceof Book)
                p.print();
        }
    }
}
