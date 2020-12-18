package hw1;

public class Wall implements Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean action(Subject subject) {
        if (subject.jump(this.height)) {
            System.out.println("Успешно перепрыгнул");
            return true;
        } else {
            System.out.println("Не смог перепрыгнуть");
            subject.setOnTrack(false);
            return false;
        }
    }
}
