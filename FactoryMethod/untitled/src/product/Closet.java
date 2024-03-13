package product;

public class Closet implements Box{
    @Override
    public BoxDto getBox() {
        System.out.println("Haciendo closet");
        return new BoxDto("Closet","180 cm", "80 cm");
    }
}
