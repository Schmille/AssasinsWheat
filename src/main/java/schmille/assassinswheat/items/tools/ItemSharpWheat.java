package schmille.assassinswheat.items.tools;

import schmille.assassinswheat.reference.Reference;

public class ItemSharpWheat extends GeneralSword {

    public ItemSharpWheat()
    {
        super(ToolMaterial.DIAMOND);
        setRegistryName("sharp_wheat");
        setUnlocalizedName(Reference.MOD_ID+"."+"sharp_wheat");
    }
}
