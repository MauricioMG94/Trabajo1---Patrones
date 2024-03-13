import factory.createCloset;
import factory.createLibrary;
import factory.Carpentry;

public class Main {
    public static void main(String[] args) {
        Carpentry closet = new createCloset();
        closet.obtainBox();

        Carpentry library = new createLibrary();
        library.obtainBox();

    }
}