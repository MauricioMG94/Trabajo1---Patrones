package product;

public class Library implements Box{
    @Override
    public BoxDto getBox() {
        System.out.println("Haciendo biblioteca");
        return new BoxDto("Biblioteca", "200 cm", "200 cm");
    }
}
