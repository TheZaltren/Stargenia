package net.thezaltren.stargenia.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.thezaltren.stargenia.Stargenia;
import net.thezaltren.stargenia.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Stargenia.MOD_ID);

    public static final Supplier<CreativeModeTab> STARGENIA_TAB = CREATIVE_MODE_TAB.register("stargenia_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COSMIC_STAR.get()))
                    .title(Component.translatable("creativetab.stargenia.stargenia_tab"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        //output.accept(ModItems.(Name of the Item); To add to the Stargenia Creative Tab
                       output.accept(ModItems.COSMIC_STAR);
                        output.accept(ModBlocks.COSMIC_STAR_BLOCK);


                    })).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
