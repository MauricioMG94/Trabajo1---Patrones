package product;

public class BoxDto {
    private String type;
    private String high;
    private String width;

    public BoxDto(String type, String high, String width) {
        this.type = type;
        this.high = high;
        this.width = width;
    }

    @Override
    public String toString() {
        return "type='" + type + '\'' +
                ", high='" + high + '\'' +
                ", width='" + width + '\'';
    }
}
