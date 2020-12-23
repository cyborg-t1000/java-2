package hw1;

public class Track implements Obstacle {
    int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean action(Subject subject) {
        if (subject.run(this.length)) {
            System.out.println("Успешно пробежал");
            return true;
        } else {
            System.out.println("Не смог пробежать");
            subject.setOnTrack(false);
            return false;
        }
    }
}
