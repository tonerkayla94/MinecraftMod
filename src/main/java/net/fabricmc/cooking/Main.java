package net.fabricmc.cooking;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.cooking.registry.ModBlocks;
import net.fabricmc.cooking.registry.ModItems;


public class Main implements ModInitializer {
	//

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItems.registerItems();
		ModBlocks.registerItems();


	}
}











