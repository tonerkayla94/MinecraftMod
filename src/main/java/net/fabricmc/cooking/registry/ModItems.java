package net.fabricmc.cooking.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item FLOUR = new Item(new Item.Settings().group(ItemGroup.FOOD));
    public static final Item SALT = new Item(new Item.Settings().group(ItemGroup.FOOD));
    public static final Item DOUGH = new Item(new Item.Settings().group(ItemGroup.FOOD));
    public static final Item BUTTER = new Item(new Item.Settings().group(ItemGroup.FOOD));
    public static final Item CHEESE = new Item(new Item.Settings().group(ItemGroup.FOOD));
    public static final Item CREAM = new Item(new Item.Settings().group(ItemGroup.FOOD));

    public static final BlockItem SALT_ORE = new BlockItem(ModBlocks.SALT_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));


    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("cook", "flour"), FLOUR);
        Registry.register(Registry.ITEM, new Identifier("cook" , "salt"), SALT);
        Registry.register(Registry.ITEM, new Identifier("cook" , "dough"), DOUGH);
        Registry.register(Registry.ITEM, new Identifier("cook" , "butter"), BUTTER);
        Registry.register(Registry.ITEM, new Identifier("cook" , "cheese"), CHEESE);
        Registry.register(Registry.ITEM, new Identifier("cook", "cream"), CREAM);
        Registry.register(Registry.ITEM, new Identifier("cook", "salt_ore"), SALT_ORE);
    }

}
