package net.fabricmc.cooking;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {

	public static final Item FLOUR = new Item(new Item.Settings().group(ItemGroup.FOOD));
		//flour.json png and name not appearing in game
	public static final Item SALT = new Item(new Item.Settings().group(ItemGroup.FOOD));
	public static final Item DOUGH = new Item(new Item.Settings().group(ItemGroup.FOOD));
	public static final Item BUTTER = new Item(new Item.Settings().group(ItemGroup.FOOD));
	public static final Item CHEESE = new Item(new Item.Settings().group(ItemGroup.FOOD));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.


		Registry.register(Registry.ITEM, new Identifier("modid", "flour"), FLOUR);
		Registry.register(Registry.ITEM, new Identifier("modid" , "salt"), SALT);
		Registry.register(Registry.ITEM, new Identifier("modid" , "dough"), DOUGH);
		Registry.register(Registry.ITEM, new Identifier("modid" , "butter"), BUTTER);
		Registry.register(Registry.ITEM, new Identifier("modid" , "cheese"), CHEESE);
	}
}
