package prak6.task10;

//var10
public class Processor {
    private int CoresNum;
    private double Frequency;

    public void setCoresNum(int coresNum) {
        CoresNum = coresNum;
    }

    public void setFrequency(double frequency) {
        Frequency = frequency;
    }

    public double getFrequency() {
        return Frequency;
    }

    public int getCoresNum() {
        return CoresNum;
    }
    public Processor(int CoresNum, double Frequency) {
        this.CoresNum = CoresNum;
        this.Frequency = Frequency;
    }

    public String toString() {
        return "Processor{" + "CoresNum=" + CoresNum + ", Frequency=" + Frequency + '}';
    }
}
