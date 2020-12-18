package hw1;

public class Main {
    public static void main(String[] args) {
        Obstacle[] obstacles = new Obstacle[]{
                new Wall(5),
                new Track(10),
                new Wall(2),
                new Track(20),
                new Wall(3)
        };
        Subject[] subjects = new Subject[]{
                new Cat(10,10),
                new Man(1,5),
                new Robot(20, 50)
        };
        for (int i = 0; i < obstacles.length; i++) {
            for (int j = 0; j < subjects.length; j++) {
                if(subjects[j].isOnTrack()) {
                    if(!obstacles[i].action(subjects[j])) {
                        subjects[j].setOnTrack(false);
                    }
                }
            }
        }
    }
}
