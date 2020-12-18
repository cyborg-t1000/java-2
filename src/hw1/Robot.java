package hw1;

public class Robot implements Subject {
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

    public Robot(int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean run(int distance) {
        System.out.println("Робот собирается бежать");
        return distance <= this.maxLength;
    }

    @Override
    public boolean jump(int distance) {
        System.out.println("Робот собирается прыгать");
        return distance <= this.maxHeight;
    }
}
