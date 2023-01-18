package net.brennhan.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.brennhan.tutorialmod.TutorialMod;
//import net.brennhan.tutorialmod.block.ModBlocks;
//import net.brennhan.tutorialmod.entity.ModEntities;
//import net.brennhan.tutorialmod.item.custom.EightBallItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;



public class ModItems {
    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new Item(new FabricItemSettings()));
    public static final Item TANZANITE = registerItem("tanzanite",
            new Item(new FabricItemSettings()));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }
    public static void addItemsToItemGroups() {
        addToItemGroup(ItemGroups.INGREDIENTS, RAW_TANZANITE);
        addToItemGroup(ItemGroups.INGREDIENTS, TANZANITE);

        addToItemGroup(ModItemGroup.TANZANITE, RAW_TANZANITE);
        addToItemGroup(ModItemGroup.TANZANITE, TANZANITE);
    }
    public static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.debug("Registering Mod Items for " + TutorialMod.MOD_ID);

        addItemsToItemGroups();
    }
}
