package hw1;

public class Cat implements Subject {
    int maxLength;
    int maxHeight;
    boolean onTrack = true;

    @Override
    public boolean isOnTrack() {
        return onTrack;
    }

    @Override
    public void setOnTrack(boolean onTrack) {
        this.onTrack = onTrack;
    }

    public Cat(int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean run(int distance) {
        System.out.println("Кот собирается бежать");
        return distance <= this.maxLength;
    }

    @Override
    public boolean jump(int distance) {
        System.out.println("Кот собирается прыгать");
        return distance <= this.maxHeight;
    }
}
