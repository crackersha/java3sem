package prak6.task10;

public class Memory {
    private int Volume;
    private double Frequency;

    public double getFrequency() {
        return Frequency;
    }

    public int getVolume() {
        return Volume;
    }

    public void setFrequency(double frequency) {
        Frequency = frequency;
    }

    public void setVolume(int volume) {
        Volume = volume;
    }
    public Memory(int Volume, double Frequency) {
        this.Volume = Volume;
        this.Frequency = Frequency;
    }

    public String toString() {
        return "Memory{" + "Volume=" + Volume + ", Frequency=" + Frequency + '}';
    }
}
