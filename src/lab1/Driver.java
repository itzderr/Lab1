package lab1;

public class Driver {
    public static void main(String[] args) {
        Model susan = new Model("Susan", "Smith", 70, 120, true, false);
        susan.printDetails();
        System.out.println();
        susan.displayModelDetails();
        System.out.println();

        Model tiger = new Model("Tiger",
                "Woods", 72, 190, true, false);
        tiger.displayModelDetails();
    }
}
