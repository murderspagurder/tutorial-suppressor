package dev.spagurder.tutorialsuppressor.neoforge;

//? neoforge {
/*import dev.spagurder.tutorialsuppressor.TutorialSuppressor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

//? >=1.20.5 {
/^import net.neoforged.fml.common.EventBusSubscriber;
^///?}

@Mod(TutorialSuppressor.MOD_ID)
public class NeoforgeEntrypoint {

    //? <1.20.5 {
    @Mod.EventBusSubscriber(modid = TutorialSuppressor.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    //?} else {
    /^@EventBusSubscriber(modid = TutorialSuppressor.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    ^///?}
    public static class ClientEvents {
        @SubscribeEvent
        public static void onClientSetup(final FMLClientSetupEvent event) {
            TutorialSuppressor.initClient();
        }
    }

}
*///?}