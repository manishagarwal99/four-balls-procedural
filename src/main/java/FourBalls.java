import processing.core.PApplet;

public class FourBalls extends PApplet {


    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 15;
    public int ballX = 1;

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        moveBalls(ballX++);
    }

    private void moveBalls(int ballXNew) {
        for (int speed = 1; speed <= 4; speed++) {
            ellipse(ballXNew * speed, speed * (HEIGHT / 5), DIAMETER, DIAMETER);
        }
    }
}
