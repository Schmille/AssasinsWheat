package schmille.assassinswheat.register;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import schmille.assassinswheat.items.tools.GeneralSword;
import schmille.assassinswheat.items.tools.ItemSharpWheat;
import schmille.assassinswheat.utility.ModLogger;

@Mod.EventBusSubscriber
public class ModItems {
    public static GeneralSword itemSharpWheat;

    public static void init()
    {
        itemSharpWheat = new ItemSharpWheat();
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> evt)
    {
        evt.getRegistry().registerAll(itemSharpWheat);
        ModLogger.info("Item registration complete");
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerRenders(ModelRegistryEvent evt)
    {
        ModelLoader.setCustomModelResourceLocation(itemSharpWheat,0,new ModelResourceLocation("minecraft:wheat"));
    }

    private static void registerCustomRender(Item pItem)
    {
        ModelLoader.setCustomModelResourceLocation(pItem,0,new ModelResourceLocation(pItem.getRegistryName(), "inventory"));
    }
}
