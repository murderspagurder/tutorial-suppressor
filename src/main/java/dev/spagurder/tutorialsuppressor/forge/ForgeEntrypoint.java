package dev.spagurder.tutorialsuppressor.forge;

//? forge {
/*import dev.spagurder.tutorialsuppressor.TutorialSuppressor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(TutorialSuppressor.MOD_ID)
public final class ForgeEntrypoint {

    @Mod.EventBusSubscriber(modid = TutorialSuppressor.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static final class ClientEvents {
        @SubscribeEvent
        public static void onClientSetup(final FMLClientSetupEvent event) {
            TutorialSuppressor.initClient();
        }
    }

}
*///?}