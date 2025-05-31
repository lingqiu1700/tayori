package tayori.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import tayori.item.custom.ModArmoritem;

public final class DiamondApple {
    private DiamondApple() {}

    public static final Item SHI = register("shi", new shi(new Item.Settings().food(shi.SHI_FOOD)));

    public static final Item DIAMOND_APPLE =register("diamond_apple", new Item(new Item.Settings().food(diamond_apple.DIAMOND_APPLE_FOOD)));

    public static final Item ENCHANTED_DIAMOND_APPLE = register("enchanted_diamond_apple", new enchanted_diamond_apple(new Item.Settings().food(enchanted_diamond_apple.ENCHANTED_APPLE_FOOD)));

    public static final Item LAPIS_APPLE = register("lapis_apple", new lapis_apple(new Item.Settings().food(lapis_apple.LAPIS_APPLE_FOOD)));

    public static final Item ENCHANTED_LAPIS_APPLE = register("enchanted_lapis_apple", new enchanted_lapis_apple(new Item.Settings().food(enchanted_lapis_apple.ENCHANTED_LAPIS_APPLE_FOOD)));

    public static final Item REDSTONE_APPLE = register("redstone_apple", new redstone_apple(new Item.Settings().food(redstone_apple.REDSTONE_APPLE_FOOD)));

    public static final Item ENCHANTED_REDSTONE_APPLE = register("enchanted_redstone_apple", new enchanted_redstone_apple(new Item.Settings().food(enchanted_redstone_apple.ENCHANTED_REDSTONE_APPLE)));

    public static final Item QUARTZ_APPLE = register("quartz_apple", new quartz_apple(new Item.Settings().food(quartz_apple.QUARTZ_APPLE_FOOD)));

    public static final Item ENCHANTED_QUARTZ_APPLE = register("enchanted_quartz_apple", new enchanted_quartz_apple(new Item.Settings().food(enchanted_quartz_apple.ENCHANTED_QUARTZ_APPLE_FOOD)));

    public static final Item IRON_APPLE = register("iron_apple", new iron_apple(new Item.Settings().food(iron_apple.IRON_APPLE_FOOD)));

    public static final Item ENCHANTED_IRON_APPLE = register("enchanted_iron_apple", new enchanted_iron_apple(new Item.Settings().food(enchanted_iron_apple.ENCHANTED_IRON_APPLE_FOOD)));

    public static final Item ENCHANTED_NETHERITE_APPLE = register("enchanted_netherite_apple", new enchanted_netherite_apple(new Item.Settings().food(enchanted_netherite_apple.ENCHANTED_NETHERITE_APPLE_FOOD)));

    public static final Item AMETHYST_SHARD_APPLE = register("amethyst_shard_apple", new amethyst_shard_apple(new Item.Settings().food(amethyst_shard_apple.AMETHYST_SHARD_APPLE_FOOD)));

    public static final Item ENCHANTED_AMETHYST_SHARD_APPLE = register("enchanted_amethyst_shard_apple", new enchanted_amethyst_shard_apple(new Item.Settings().food(enchanted_amethyst_shard_apple.ENCHANTED_AMETHYST_SHARD_APPLE_FOOD)));

    public static final Item ENCHANTED_DIAMOND_APPLE_HELMET = register("enchanted_diamond_apple_helmet", new ModArmoritem(ModArmor.DIAMOND_APPLE_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()));

    public static final Item ENCHANTED_DIAMOND_APPLE_CHESTPLATE = register("enchanted_diamond_apple_chestplate", new ModArmoritem(ModArmor.DIAMOND_APPLE_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()));

    public static final Item ENCHANTED_DIAMOND_APPLE_LEGGINGS = register("enchanted_diamond_apple_leggings", new ModArmoritem(ModArmor.DIAMOND_APPLE_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()));

    public static final Item ENCHANTED_DIAMOND_APPLE_BOOTS = register("enchanted_diamond_apple_boots", new ModArmoritem(ModArmor.DIAMOND_APPLE_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()));

    public static <T extends Item> T register(String path, T item) {
        return Registry.register(Registries.ITEM, Identifier.of("tayori", path), item);
    }

    public static void registerDiamondApple(){

    }
}
