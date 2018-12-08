package schmille.assassinswheat.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import schmille.assassinswheat.reference.Configuration;
import schmille.assassinswheat.reference.Reference;

public class BlockAssassinsHay extends GeneralBlock {


    public BlockAssassinsHay()
    {
        super(Material.GRASS, MapColor.YELLOW);
        this.setRegistryName("assassins_hay");
        this.setUnlocalizedName(Reference.MOD_ID+"."+"assassins_hay");
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setSoundType(SoundType.PLANT);
        this.setHardness(0.5f);
    }

    @Override
    public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance)
    {
        entityIn.fall(fallDistance, 0.0F);
        if(fallDistance >= 20) {
                worldIn.playSound(null, pos.getX(), pos.getY(), pos.getZ(), Reference.EAGLE_SOUND, SoundCategory.BLOCKS, 1, 1F);
        }
    }
}
