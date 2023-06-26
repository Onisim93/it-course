package lesson5;

public class Snake {

    private boolean isAlive;
    private int length;

    private int speed;

    private int startX;
    private int startY;

    public Snake(int startX, int startY) {
        this.startX = startX;
        this.startY = startY;
        this.speed = 1;
        this.isAlive = true;
        this.length = 3;
    }

    public Snake(int startX, int startY, int speed, int length) {
        this.startX = startX;
        this.startY = startY;
        this.speed = speed;
        this.length = length;
        this.isAlive = true;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getLength() {
        return length;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStartX() {
        return startX;
    }

    public int getStartY() {
        return startY;
    }
}
