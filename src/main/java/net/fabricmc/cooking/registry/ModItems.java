package net.fabricmc.cooking.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item FLOUR = new Item(new Item.Settings().group(ItemGroup.FOOD));
    //flour.json png not appearing in game
    public static final Item SALT = new Item(new Item.Settings().group(ItemGroup.FOOD));
    public static final Item DOUGH = new Item(new Item.Settings().group(ItemGroup.FOOD));
    public static final Item BUTTER = new Item(new Item.Settings().group(ItemGroup.FOOD));
    public static final Item CHEESE = new Item(new Item.Settings().group(ItemGroup.FOOD));
    public static final Item CREAM = new Item(new Item.Settings().group(ItemGroup.FOOD));
    public static final Block SALT_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(3.0f, 15.0f)
            .sounds(BlockSoundGroup.STONE));
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("cook", "flour"), FLOUR);
        Registry.register(Registry.ITEM, new Identifier("cook" , "salt"), SALT);
        Registry.register(Registry.ITEM, new Identifier("cook" , "dough"), DOUGH);
        Registry.register(Registry.ITEM, new Identifier("cook" , "butter"), BUTTER);
        Registry.register(Registry.ITEM, new Identifier("cook" , "cheese"), CHEESE);
        Registry.register(Registry.ITEM, new Identifier("cook", "cream"), CREAM);
        Registry.register(Registry.BLOCK, new Identifier("cook", "salt_ore"), SALT_ORE);
    }

}
