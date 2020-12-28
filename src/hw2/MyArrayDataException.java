package hw2;

public class MyArrayDataException extends IllegalArgumentException {
    int x;
    int y;

    public MyArrayDataException(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
