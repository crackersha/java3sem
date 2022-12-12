package prak1.task2;
//Класс - это элемент, образующий основу Java, так как он определяет форму и сущность объекта
public class Ball { //доступный и для всех других объектов в системе
    private  int radius;
    private String color;
    //Конструктор – это специальный метод класса, который имеет то же имя,
    //что используется в качестве имени класса
    public Ball(int r, String c) {
        radius = r;
        color = c;
    }
    public Ball(int r) {
        radius = r;
        color = "Red";
    }
    public Ball(String c) {
        radius = 1;
        color = c;
    }
    public Ball() {
        radius = 1;
        color = "Red";
    }
    // “get” — “метод для получения значения поля” и set — “устанавливать”
// (т.е. “метод для установки значения поля”).
    //сеттер — это полноценный метод. А в метод,
// в отличие от поля, ты можешь заложить необходимую тебе логику проверки, чтобы не допустить неприемлемых значений
    public int getRadius() {
        return radius;
    }
    //ключевое слово this, которое в данном случае укажет, что нужно вызывать переменную не метода, а класса
//Ключевое слово void в Java позволяет нам создать методы, не производящие возврат значения
    //То есть this сошлется на вызвавший объект
    public void setRadius(int radius) {
        this.radius = radius;
    }
    //Класс String в Java — это final класс, который не может иметь потомков.
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    //Каждый объект в Java может быть преобразован в строку через метод toString, унаследованный всеми Java-классами от класса Object
    public String toString() {
        return "The radius of the ball is " + radius + " the color of the ball is " + color;
    }
    public int getDiametr(){
        return 2 * radius;
    }
}