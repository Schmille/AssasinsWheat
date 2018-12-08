package schmille.assassinswheat;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import schmille.assassinswheat.proxy.IProxy;
import schmille.assassinswheat.reference.Reference;
import schmille.assassinswheat.utility.ModLogger;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class AssassinsWheat {



    @Mod.Instance(Reference.MOD_ID)
    public static AssassinsWheat instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ModLogger.setLogger(event.getModLog());
        ModLogger.log(ModLogger.info,"Pre-Init Complete");
        proxy.initBlocks();
        proxy.initItems();
        proxy.registerBlockTextures();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        ModLogger.log(ModLogger.info,"Init Complete");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        ModLogger.log(ModLogger.info,"Post-Init Complete");
    }

}
