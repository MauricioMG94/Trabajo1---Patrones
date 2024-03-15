package factory;

import product.Box;
import product.BoxDto;

public abstract class Carpentry {
    public void obtainBox(){
    Box box = makeBox();
    var boxDto = box.getBox();

    savingCloset(boxDto);
    }

    private void savingCloset(BoxDto boxDto){
        System.out.println("Empacando cajon: "+boxDto);
    }
    public abstract Box makeBox();
}
