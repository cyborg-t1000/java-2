package hw1;

public interface Subject {
    boolean run(int distance);

    boolean jump(int distance);

    void setOnTrack(boolean onTrack);

    boolean isOnTrack();
}