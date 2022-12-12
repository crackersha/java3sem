package prak4_1.task4;

/*Создать класс Матрица. Класс должен иметь следующие поля: 1)
двумерный массив вещественных чисел; 2) количество строк и столбцов	в
матрице. Класс должен иметь следующие методы: 1) сложение с другой
матрицей; 2) умножение на число; 3) вывод на печать; 4) умножение матриц - по
желанию.*/

import java.util.Scanner;

public class Matrix {
    private double[][] matrix;
    private int column;
    private int row;

    public Matrix(int column, int row) {
        this.column = column;
        this.row = row;
        this.matrix = new double[row][column];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                this.matrix[i][j] = 0;
    }

    public Matrix(double[][] matrix, int column, int row) {
        this.matrix = new double[row][column];
        this.column = column;
        this.row = row;
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                this.matrix[i][j] = matrix[i][j];
    }

    public void add(Matrix m) {
        if (m.row != this.row || m.column != this.column) {
            System.out.print("Failed! Incompatible dimensions.\n");
            return;
        }
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                this.matrix[i][j] += m.matrix[i][j];
    }

    public void multiplication(double x) {
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                this.matrix[i][j] *= x;
    }

    public void print() {
        for (double[] row : matrix) {
            for (double elem : row)
                System.out.printf("%-10.3f", elem);
            System.out.print('\n');
        }
    }

    public String toString() {
        return "Matrix {" + "column = " + column + ", row = " + row + '}';
    }

    public double get(int row, int column) {
        return matrix[row][column];
    }
}