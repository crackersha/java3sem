package prak5.task2;

import prak5.task2.Shape;

import java.awt.Color;
import java.awt.Graphics;

class Circle extends Shape {
    protected int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = new Color((int)(Math.random() * 255.0), (int)(Math.random() * 255.0), (int)(Math.random() * 255.0));
    }

    public void Draw(Graphics g) {
        g.setColor(this.color);
        g.fillOval(this.x, this.y, this.radius, this.radius);
    }
}