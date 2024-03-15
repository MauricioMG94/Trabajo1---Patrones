package product;

public class Cabinet implements Box{
    @Override
    public BoxDto getBox() {
        System.out.println("Haciendo cabinet");
        return new BoxDto("Gabinete de cocina","80 cm", "200 cm");
    }
}
