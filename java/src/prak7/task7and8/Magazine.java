package prak7.task7and8;

/*Создать статический метод printMagazines(Printable[] printable) в
классе Magazine, который выводит на консоль названия только журналов.*/

public class Magazine implements Printable {
    String mag_name;
    public Magazine(String name){
        mag_name = name;
    }

    public void print(){
        System.out.println(mag_name);
    }
}
