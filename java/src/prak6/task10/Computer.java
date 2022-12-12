package prak6.task10;

import java.util.Scanner;

public class Computer implements Enterable {
    private Mark mark;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    public int price;

    public Computer(Mark mark, int CoreNumber, double FrequencyP, int Volume, double FrequencyM, double Diagonal) {
        this.mark = mark;
        this.processor = new Processor(CoreNumber, FrequencyP);
        this.memory = new Memory(Volume, FrequencyM);
        this.monitor = new Monitor(Diagonal);
        setPrice();
        setWidthAndHeight();
    }
    public void setPrice(){
        Scanner s = new Scanner(System.in);
        System.out.print("Price: ");
        price = s.nextInt();
    }
    public void setWidthAndHeight(){
        Scanner s = new Scanner(System.in);
        System.out.print("Width and Height: ");
        monitor.setWidth(s.nextInt());
        monitor.setHeight(s.nextInt());
    }

    public Mark getMark() {
        return mark;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public String toString() {return "Computer{" + "mark=" + mark + ", processor=" + processor +
            ", memory=" + memory + ", monitor=" + monitor + '}';
    }
}
