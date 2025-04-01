package moe.ksakura;

import moe.ksakura.datagen.TNWChineseSimplifiedLanguageProvider;
import moe.ksakura.datagen.TNWEnglishUSLanguageProvider;
import moe.ksakura.datagen.TNWModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class TheNightlyWorldRedemptionDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        pack.addProvider(TNWModelProvider::new);
        pack.addProvider(TNWEnglishUSLanguageProvider::new);
        pack.addProvider(TNWChineseSimplifiedLanguageProvider::new);
    }

}

