package net.thezaltren.stargenia.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.thezaltren.stargenia.Stargenia;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Stargenia.MOD_ID);
    //Must Create an public static final DeferredItem<Item> for each item added to the mod
    //After DeferredItem<Item> the name of the item needs to match with the png name
    // Inorder for the texture to be applied correctly to the item
    public static final DeferredItem<Item> COSMIC_STAR = ITEMS.register("cosmic_star",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COSMIC_INGOT = ITEMS.register("cosmic_ingot",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
