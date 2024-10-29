public class RollsRoyce {

    String location;
    int sqft;
    boolean isOpen;


    public static void main(String[] args) {
        RollsRoyce myStore; // declare
        myStore = new RollsRoyce();
        myStore.location = "Milton";
        myStore.sqft = 10000;
        myStore.isOpen = true;

        System.out.println("My " +myStore.sqft + " sqft store is in " +myStore.location + " and is " + myStore.isOpen + " right now.");

        CarFrames myFrame; // declare
        myFrame = new CarFrames(); // contruct
        myFrame.color = "Black";
        myFrame.width = 1000;
        myFrame.wrap = true;

        myFrame.printInfo();

        Wheels AnsonLi; // declare
        AnsonLi = new Wheels(); // contruct
        AnsonLi.color = "Red";
        AnsonLi.diameter = 10;
        AnsonLi.road = true;

        AnsonLi.printInfo();



    }

    public RollsRoyce() {

    }
}
