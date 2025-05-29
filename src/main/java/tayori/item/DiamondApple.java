package tayori.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

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



    public static <T extends Item> T register(String path, T item) {
        return Registry.register(Registries.ITEM, Identifier.of("tayori", path), item);
    }

    public static void registerDiamondApple(){

    }
}
