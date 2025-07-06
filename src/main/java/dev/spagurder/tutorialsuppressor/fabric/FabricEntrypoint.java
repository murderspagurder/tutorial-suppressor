package dev.spagurder.tutorialsuppressor.fabric;

//? fabric {
import dev.spagurder.tutorialsuppressor.TutorialSuppressor;
import net.fabricmc.api.ClientModInitializer;

public class FabricEntrypoint implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        TutorialSuppressor.initClient();
    }

}
//?}
