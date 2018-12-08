package schmille.assassinswheat.proxy;

import schmille.assassinswheat.register.ModBlocks;
import schmille.assassinswheat.register.ModItems;

public class ClientProxy implements IProxy {


    @Override
    public void initItems() {
        ModItems.init();
    }

    @Override
    public void initBlocks() {
        ModBlocks.init();
    }

    @Override
    public void registerBlockTextures() {
        ModBlocks.initTextures();
    }
}
