package schmille.assassinswheat.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class GeneralBlock extends Block {

    public GeneralBlock() {
        super(Material.ROCK);
    }

    public GeneralBlock(Material pMaterial)
    {
        super(pMaterial);
    }

    public GeneralBlock(Material pMaterial, MapColor pColor)
    {
        super(pMaterial,pColor);
    }
}
