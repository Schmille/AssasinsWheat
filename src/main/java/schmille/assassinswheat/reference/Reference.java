package schmille.assassinswheat.reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public abstract class Reference {
    public static final String MOD_ID = "assassinswheat";
    public static final String MOD_NAME = "AssassinsWheat";
    public static final String MOD_VERSION = "1.12.1-1.0_Alpha";
    public static final String CLIENT_PROXY = "schmille.assassinswheat.proxy.ClientProxy";
    public static final String SERVER_PROXY = "schmille.assassinswheat.proxy.ServerProxy";
    //
    public static SoundEvent EAGLE_SOUND = new SoundEvent(new ResourceLocation("assassinswheat","eagle"));
}
