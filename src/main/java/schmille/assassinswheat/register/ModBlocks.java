package schmille.assassinswheat.register;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import schmille.assassinswheat.blocks.BlockAssassinsHay;
import schmille.assassinswheat.blocks.GeneralBlock;
import schmille.assassinswheat.reference.Reference;
import schmille.assassinswheat.utility.ModLogger;

@Mod.EventBusSubscriber
public class ModBlocks {

    //Blocks
    public static GeneralBlock blockAssassinsHay;

    //BlockItems
    public static ItemBlock itemAssassinsHay;

    public static void init()
    {
        blockAssassinsHay = new BlockAssassinsHay();
        itemBlocks();
    }

    private static void itemBlocks()
    {
        itemAssassinsHay = new ItemBlock(blockAssassinsHay);
        itemAssassinsHay.setRegistryName("block_assassins_hay");
        itemAssassinsHay.setUnlocalizedName(Reference.MOD_ID+"."+"block_assassins_hay");
    }

    //Register all blocks
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> evt)
    {
        evt.getRegistry().registerAll(blockAssassinsHay);
        ModLogger.info("Block registration complete");
    }

    //Register all block items
    @SubscribeEvent
    public static void registerBlockItems(RegistryEvent.Register<Item> evt)
    {
        evt.getRegistry().registerAll(itemAssassinsHay);
        ModLogger.info("Blockitem registration complete");
    }

    //Initialise all textures
    public static void initTextures()
    {
        ModelLoader.setCustomModelResourceLocation(itemAssassinsHay,0,new ModelResourceLocation("assassinswheat:assassins_hay"));
    }

}
