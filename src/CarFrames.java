public class CarFrames {
    String color;
    int width;
    boolean wrap;

    public CarFrames(){

    }

    public void printInfo() {
        System.out.println("Color of car is " + color);
        System.out.println("Width of car is " + width);
        System.out.println("Has a wrap: " + wrap);
    }
}
