package factory;

import product.Box;
import product.Library;

public class CreateLibrary extends Carpentry {
    @Override
    public Box makeBox() {
        return new Library();
    }
}
