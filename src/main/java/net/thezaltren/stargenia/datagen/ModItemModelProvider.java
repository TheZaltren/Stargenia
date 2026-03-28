package net.thezaltren.stargenia.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.thezaltren.stargenia.Stargenia;
import net.thezaltren.stargenia.block.ModBlocks;
import net.thezaltren.stargenia.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Stargenia.MOD_ID, existingFileHelper);

    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.COSMIC_STAR.get());
        basicItem(ModItems.COSMIC_CORE.get());
        basicItem(ModItems.COSMIC_SHARD.get());
        basicItem(ModItems.COSMIC_FRAGMENT.get());
        basicItem(ModItems.COSMIC_COIN.get());
        basicItem(ModItems.COSMIC_INGOT.get());


    }


}
