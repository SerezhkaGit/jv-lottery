package core.basesyntax;

public class Ball {
    public enum Colors{
        white,
        black,
        red,
        blue,
        green,
        brown,
        yellow
    }

    private  int number;
    private  Colors color;

    public void setColor(Colors color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Colors getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "number=" + number +
                ", color=" + color +
                '}';
    }

}
