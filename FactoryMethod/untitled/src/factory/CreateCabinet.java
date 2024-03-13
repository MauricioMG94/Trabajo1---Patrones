package factory;

import product.Box;
import product.Cabinet;

public class CreateCabinet extends Carpentry{
    @Override
    public Box makeBox() {
        return new Cabinet();
    }
}
