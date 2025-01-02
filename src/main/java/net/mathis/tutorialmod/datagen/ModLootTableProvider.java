package net.mathis.tutorialmod.datagen;

import net.mathis.tutorialmod.datagen.loot.ModBlockLootTables;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.flag.FeatureFlags;

import java.util.List;
import java.util.Set;

public class ModLootTableProvider {
    public static LootTableProvider create(PackOutput output) {
        return new LootTableProvider(output, Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(
                        () -> new ModBlockLootTables(Set.of(), FeatureFlags.REGISTRY.allFlags()),
                        LootContextParamSets.BLOCK
                )
        ));
    }
}

