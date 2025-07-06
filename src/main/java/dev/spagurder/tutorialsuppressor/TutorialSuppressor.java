package dev.spagurder.tutorialsuppressor;

import net.minecraft.client.Minecraft;
import net.minecraft.client.tutorial.TutorialSteps;

public class TutorialSuppressor {

    public static final String MOD_ID = "tutorialsuppressor";

    public static void initClient() {
        Minecraft.getInstance().execute(() -> {
            Minecraft.getInstance().getTutorial().setStep(TutorialSteps.NONE);
        });
    }

}
