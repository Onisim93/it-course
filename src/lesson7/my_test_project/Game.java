package lesson7.my_test_project;

public class Game {
    private char[][] matrix = new char[10][10];


    public void init() {
        for (int x=0;x<matrix.length;x++) {
            for (int y=0;y<matrix.length;y++) {
                matrix[x][y] = '.';
            }
        }
    }

    public void draw() {
        for (int x=0;x<matrix.length;x++) {
            for (int y=0;y<matrix.length;y++) {
                System.out.print(matrix[x][y]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public char[][] getMatrix() {
        return matrix;
    }


}
