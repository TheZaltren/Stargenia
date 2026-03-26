package net.thezaltren.stargenia.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.thezaltren.stargenia.Stargenia;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Stargenia.MOD_ID);

    public static final DeferredItem<Item> COSMIC_STAR = ITEMS.register("cosmic_star",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
