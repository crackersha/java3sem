package prak27.task2;

/*2.	Создайте класс Map<String, String> и добавьте десять записей, которые представляют пары
 (фамилия, имя). Проверьте, сколько людей имеют одинаковое имя или фамилию. Требования к программе:
a)	Программа не должна отображать текст на экране.
b)	Программа не должна считывать значения с клавиатуры
c)	Метод createMap () должен создать и вернуть HashMap, который имеет элементы (String, String)
 и содержит 10 записей, представляющих пары (фамилия, имя).
d)	Метод getSameFirstNameCount () должен возвращать количество людей с одинаковыми именами.
e)	Метод getSameLastNameCount () должен возвращать количество людей с одинаковой фамилией
*/

public class Main {
    public static void main(String[] args) {
        Map map = new Map();
        map.Add("Yakovleva","Sofia");
        map.Add("Ivanova","Elena");
        map.Add("Sazonova","Anna");
        map.Add("Arapova","Elena");
        map.Add("Kopilova","Marina");
        map.Add("Yakovleva","Evgeniya");
        map.Add("Zarozhina","Yana");
        map.Add("Sazonova","Marina");
        map.Add("Yakovleva","Lana");
        map.Add("Zhukova","Alisa");
        System.out.println(map.getSameFirstNameCount());
        System.out.println(map.getSameLastNameCount());
        map.CreateMap();
    }
}