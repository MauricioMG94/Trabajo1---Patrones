import factory.CreateCabinet;
import factory.CreateCloset;
import factory.CreateLibrary;
import factory.Carpentry;

public class Main {
    public static void main(String[] args) {
        Carpentry closet = new CreateCloset();
        closet.obtainBox();

        Carpentry library = new CreateLibrary();
        library.obtainBox();

        Carpentry cabinet = new CreateCabinet();
        cabinet.obtainBox();
    }
}