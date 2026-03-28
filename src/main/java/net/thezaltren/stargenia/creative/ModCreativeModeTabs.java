package net.thezaltren.stargenia.creative;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.thezaltren.stargenia.Stargenia;
import net.thezaltren.stargenia.block.ModBlocks;
import net.thezaltren.stargenia.item.ModItems;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Stargenia.MOD_ID);

    //Stargenia Creative Tab
    public static final Supplier<CreativeModeTab> STARGENIA_TAB = CREATIVE_MODE_TAB.register("stargenia_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COSMIC_COIN.get()))
                    .title(Component.translatable("creativetab.stargenia.stargenia_tab"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        //output.accept(ModItems.(Name of the Item); To add to the Stargenia Creative Tab
                        //This is where all misc items and blocks will go
                       output.accept(ModItems.COSMIC_COIN);
                        output.accept(ModItems.COSMIC_FRAGMENT);
                        output.accept(ModItems.COSMIC_SHARD);
                        output.accept(ModItems.COSMIC_CORE);


                    })).build());
    //Stargenia Materials Creative Tab
    public static final Supplier<CreativeModeTab> STARGENIA_MATERIALS = CREATIVE_MODE_TAB.register("stargenia_materials",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COSMIC_INGOT.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Stargenia.MOD_ID,"stargenia_tab"))
                    .title(Component.translatable("creativetab.stargenia.stargenia_materials"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        //output.accept(ModItems.(Name of the Item); To add to the Stargenia Materials Creative Tab
                        output.accept(ModItems.COSMIC_INGOT);
                    })).build());
    //Stargenia Blocks Creative Tab
    public static final Supplier<CreativeModeTab> STARGENIA_BLOCKS = CREATIVE_MODE_TAB.register("stargenia_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.COSMIC_STAR_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Stargenia.MOD_ID,"stargenia_materials"))
                    .title(Component.translatable("creativetab.stargenia.stargenia_blocks"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        //output.accept(ModBlocks.(Name of the Item); To add to the Stargenia Blocks Creative Tab
                        output.accept(ModBlocks.COSMIC_STAR_BLOCK);
                        output.accept(ModBlocks.COSMIC_STAR_BLOCK_X1);
                        output.accept(ModBlocks.COSMIC_STAR_BLOCK_X2);
                        output.accept(ModBlocks.COSMIC_STAR_BLOCK_X3);
                        output.accept(ModBlocks.COSMIC_STAR_BLOCK_X4);
                        output.accept(ModBlocks.COSMIC_STAR_BLOCK_X5);
                        output.accept(ModBlocks.COSMIC_STAR_BLOCK_X6);
                        output.accept(ModBlocks.COSMIC_STAR_BLOCK_X7);
                        output.accept(ModBlocks.COSMIC_STAR_BLOCK_X8);
                        output.accept(ModBlocks.COSMIC_STAR_BLOCK_X9);

                    })).build());
    //Stargenia Stars Creative Tab
    public static final Supplier<CreativeModeTab> STARGENIA_STARS = CREATIVE_MODE_TAB.register("stargenia_stars",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COSMIC_STAR.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Stargenia.MOD_ID,"stargenia_blocks"))
                    .title(Component.translatable("creativetab.stargenia.stargenia_stars"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        //output.accept(ModItems.(Name of the Item); To add to the Stargenia Stars Creative Tab
                        output.accept(ModItems.COSMIC_STAR);
                    })).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
