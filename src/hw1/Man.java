package hw1;

public class Man implements Subject {
    int maxLength;
    int maxHeight;
    boolean onTrack = true;

    @Override
    public void setOnTrack(boolean onTrack) {
        this.onTrack = onTrack;
    }

    @Override
    public boolean isOnTrack() {
        return onTrack;
    }

    public Man(int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean run(int distance) {
        System.out.println("Человек собирается бежать");
        return distance <= this.maxLength;
    }

    @Override
    public boolean jump(int distance) {
        System.out.println("Человек собирается прыгать");
        return distance <= this.maxHeight;
    }
}
