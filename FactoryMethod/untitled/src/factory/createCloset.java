package factory;

import product.Box;
import product.Closet;

public class createCloset extends Carpentry {
    @Override
    public Box makeBox() {
        return new Closet();
    }
}
