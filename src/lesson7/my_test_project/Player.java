package lesson7.my_test_project;

public class Player {
    private char[][] matrix = new char[][]{
            {'.','.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.','.'},
            {'.','.','.','X','.','.','.','.','.','.'},
            {'.','.','.','X','.','.','.','.','.','.'},
            {'.','.','X','X','X','.','.','.','.','.'},
            {'.','.','.','X','.','.','.','.','.','.'},
            {'.','.','X','.','X','.','.','.','.','.'},
            {'.','.','X','.','X','.','.','.','.','.'}};

    private Game game;

    public Player(Game game) {
        this.game = game;
    }



    public void draw() {
        for (int x=0;x<matrix.length;x++) {
            for (int y=0;y<matrix.length;y++) {
                if (matrix[x][y] == 'X') {
                    game.getMatrix()[x][y] = 'X';
                }
            }
        }
        game.draw();
    }

    public void jump() {
        boolean isUp = true;
        char[][] newMatrix = new char[10][10];
        int counter = 2;

        while (counter > 0) {
            for (int x = 0; x < matrix.length; x++) {
                for (int y = 0; y < matrix.length; y++) {
                    if (matrix[x][y] == 'X') {
                        if (isUp) {
                            newMatrix[x][y + 2] = 'X';
                        } else {
                            newMatrix[x][y - 2] = 'X';
                        }
                    } else {
                        matrix[x][y] = '.';
                    }
                }
                isUp = !isUp;
                matrix = newMatrix;
                draw();
                counter--;
            }
        }
    }

}
