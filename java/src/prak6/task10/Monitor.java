package prak6.task10;

public class Monitor {
    private double Diagonal;
    private int width;
    private int height;

    public double getDiagonal() {
        return Diagonal;
    }

    public void setDiagonal(double diagonal) {
        Diagonal = diagonal;
    }
    public Monitor(double Diagonal) {
        this.Diagonal = Diagonal;
    }

    public String toString() {
        return "Monitor{" + "Diagonal=" + Diagonal + '}';
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }
    public void setWidth(int w){
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }
}
