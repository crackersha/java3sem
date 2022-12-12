package prak2.task6;

/*Создать класс, описывающий модель окружности (Circle). В классе
должны быть описаны нужные свойства окружности и методы для получения и
изменения этих свойств. Добавить методы для расчета площади круга и длины
окружности, а также метод позволяющий сравнивать две окружности. При
помощи класса CircleTest, содержащего статический метод main(String[] args),
протестировать работу класcа Circle. */

public class Circle {
    private double x;
    private double y;
    private double r;
    private String color;

    public Circle(double x, double y, double r, String color){
        this.x = x;
        this.y = y;
        this.r = r;
        this.color = color;
    }

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getR(){
        return r;
    }

    public void setR(double r){
        this.r = r;
    }

    public String getColour(){
        return color;
    }

    public void setColour(String color){
        this.color = color;
    }

    public double getC(){
        return 2*Math.PI*this.getR();
    }

    public double getS(){
        return Math.PI*this.getR()*this.getR();
    }

    public String toString(){
        return "Circle{" + "x=" + x + ", y=" + y +
                ", r=" + r + ", color='" + color + '\'' + '}';
    }
}
