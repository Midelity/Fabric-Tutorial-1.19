package net.brennhan.tutorialmod;

import net.brennhan.tutorialmod.block.ModBlocks;
import net.brennhan.tutorialmod.item.ModItems;
import net.brennhan.tutorialmod.item.ModItemGroup;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comments
public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroup();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
