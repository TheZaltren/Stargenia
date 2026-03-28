package net.thezaltren.stargenia.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.thezaltren.stargenia.block.ModBlocks;


import java.util.Set;

public class ModBlockLootTableProvider  extends BlockLootSubProvider {

    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.COSMIC_STAR_BLOCK.get());
        dropSelf(ModBlocks.COSMIC_STAR_BLOCK_X1.get());
        dropSelf(ModBlocks.COSMIC_STAR_BLOCK_X2.get());
        dropSelf(ModBlocks.COSMIC_STAR_BLOCK_X3.get());
        dropSelf(ModBlocks.COSMIC_STAR_BLOCK_X4.get());
        dropSelf(ModBlocks.COSMIC_STAR_BLOCK_X5.get());
        dropSelf(ModBlocks.COSMIC_STAR_BLOCK_X6.get());
        dropSelf(ModBlocks.COSMIC_STAR_BLOCK_X7.get());
        dropSelf(ModBlocks.COSMIC_STAR_BLOCK_X8.get());
        dropSelf(ModBlocks.COSMIC_STAR_BLOCK_X9.get());



    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
