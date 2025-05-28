package tayori.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModitemGroup {

    public static final ItemGroup TAYORI = Registry.register(Registries.ITEM_GROUP,
            new Identifier("tayori", "tayori"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable( "itemGroup.tayori.Apple"))
                    .icon(() -> new ItemStack(DiamondApple.DIAMOND_APPLE))
                    .entries(((displayContext, entries) -> {
                        entries.add(DiamondApple.SHI);
                        entries.add(DiamondApple.DIAMOND_APPLE);
                        entries.add(DiamondApple.ENCHANTED_DIAMOND_APPLE);
                        entries.add(DiamondApple.LAPIS_APPLE);
                        entries.add(DiamondApple.ENCHANTED_LAPIS_APPLE);
                        entries.add(DiamondApple.REDSTONE_APPLE);
                        entries.add(DiamondApple.ENCHANTED_REDSTONE_APPLE);
                        entries.add(DiamondApple.QUARTZ_APPLE);
                        entries.add(DiamondApple.ENCHANTED_QUARTZ_APPLE);
                    }))

                    .build());
    public static void registerItemGroups() {

    }
}
