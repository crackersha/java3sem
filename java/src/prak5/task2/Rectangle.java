package prak5.task2;

import prak5.task2.Shape;

import java.awt.Color;
import java.awt.Graphics;

class Rectangle extends Shape {
    protected int width;
    protected int length;

    public Rectangle(int x, int y, int width, int length) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.length = length;
        this.color = new Color((int)(Math.random() * 255.0), (int)(Math.random() * 255.0), (int)(Math.random() * 255.0));
    }

    public void Draw(Graphics g) {
        g.setColor(this.color);
        g.fillRect(this.x, this.y, this.width, this.length);
    }
}
