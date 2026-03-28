package net.thezaltren.stargenia.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.thezaltren.stargenia.Stargenia;
import net.thezaltren.stargenia.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Stargenia.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        //Blocks to be Mined with Pickaxe Only
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.COSMIC_STAR_BLOCK.get())
                .add(ModBlocks.COSMIC_STAR_BLOCK_X1.get())
                .add(ModBlocks.COSMIC_STAR_BLOCK_X2.get())
                .add(ModBlocks.COSMIC_STAR_BLOCK_X3.get())
                .add(ModBlocks.COSMIC_STAR_BLOCK_X4.get())
                .add(ModBlocks.COSMIC_STAR_BLOCK_X5.get())
                .add(ModBlocks.COSMIC_STAR_BLOCK_X6.get())
                .add(ModBlocks.COSMIC_STAR_BLOCK_X7.get())
                .add(ModBlocks.COSMIC_STAR_BLOCK_X8.get())
                .add(ModBlocks.COSMIC_STAR_BLOCK_X9.get());
        //Diamond Tools and Above
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.COSMIC_STAR_BLOCK.get())
                .add(ModBlocks.COSMIC_STAR_BLOCK_X1.get())
                .add(ModBlocks.COSMIC_STAR_BLOCK_X2.get())
                .add(ModBlocks.COSMIC_STAR_BLOCK_X3.get())
                .add(ModBlocks.COSMIC_STAR_BLOCK_X4.get())
                .add(ModBlocks.COSMIC_STAR_BLOCK_X5.get())
                .add(ModBlocks.COSMIC_STAR_BLOCK_X6.get())
                .add(ModBlocks.COSMIC_STAR_BLOCK_X7.get())
                .add(ModBlocks.COSMIC_STAR_BLOCK_X8.get())
                .add(ModBlocks.COSMIC_STAR_BLOCK_X9.get());

    }
}
