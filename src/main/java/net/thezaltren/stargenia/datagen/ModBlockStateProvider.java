package net.thezaltren.stargenia.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.thezaltren.stargenia.Stargenia;
import net.thezaltren.stargenia.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFilehelper) {
        super (output, Stargenia.MOD_ID, exFilehelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.COSMIC_STAR_BLOCK);
        blockWithItem(ModBlocks.COSMIC_STAR_BLOCK_X1);
        blockWithItem(ModBlocks.COSMIC_STAR_BLOCK_X2);
        blockWithItem(ModBlocks.COSMIC_STAR_BLOCK_X3);
        blockWithItem(ModBlocks.COSMIC_STAR_BLOCK_X4);
        blockWithItem(ModBlocks.COSMIC_STAR_BLOCK_X5);
        blockWithItem(ModBlocks.COSMIC_STAR_BLOCK_X6);
        blockWithItem(ModBlocks.COSMIC_STAR_BLOCK_X7);
        blockWithItem(ModBlocks.COSMIC_STAR_BLOCK_X8);
        blockWithItem(ModBlocks.COSMIC_STAR_BLOCK_X9);


    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

}
