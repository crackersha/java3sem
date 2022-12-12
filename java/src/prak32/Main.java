package prak32;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {

        //создаем наш объект
        String[] territoryInfo = {"Customer: Moscow 1119923,Arbat 68a-50"};
        String[] resourcesInfo = {"Dish: Salad - 390 good dish "};
        String[] diplomacyInfo = {"Dish: Ice cream,0 Chocolate"};
        String[] diplomacyInfos = {"Drink:WINE - Super Wine - -432,Alcohol12.4% -red"};
        String[] diplomacyInfoss = {"Table order:3"};
        prak32.SaveRestaraunt savedGame = new SaveRestaraunt(territoryInfo, resourcesInfo, diplomacyInfo,diplomacyInfos,diplomacyInfoss);

        //создаем 2 потока для сериализации объекта и сохранения его в файл
        FileOutputStream outputStream = new FileOutputStream("/Users/sofia/IdeaProjects/java/src/prak32/Menu.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // сохраняем игру в файл
        objectOutputStream.writeObject(savedGame);

        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();
    }
}