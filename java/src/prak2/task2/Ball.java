package prak2.task2;

/* По UML диаграмме класса, представленной на рис. 2.5 написать
программу, которая состоит из двух классов. Один из них Ball должен
реализовывать сущность мяч, а другой с названием TestBall тестировать работу
созданного класса. Класс Ball должен содержать реализацию методов,
представленных на UML. Диаграмма на рисунке описывает сущность Мяч
написать программу. Класс Ball моделирует движущийся мяч.*/

public class Ball {
    private double x = 0.0;
    private double y = 0.0;
    public Ball(){}
    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) { //задает положение мяча
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y){ //задает скорость мяча
        this.x = x;
        this.y = y;
    }
    public void move( double xDisp, double yDisp){ //перемещает мяч, так что что увеличивает х и на данном участке на xDisp и yDisp, соответственно.
        x+=xDisp;
        y+=yDisp;
    }

    public String toString() {
        return "Ball @ ("+this.x+", "+this.y+").";
    }
}
