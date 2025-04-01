package moe.ksakura.items;

import moe.ksakura.TheNightlyWorldRedemption;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public final class ModItems {
    private ModItems() {}

    public static final Item BLOODMOON_TOKEN = register("bloodmoon_token", Item::new, new Item.Settings());

    public static Item register(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TheNightlyWorldRedemption.MOD_ID, path));
        return Items.register(registryKey, factory, settings);
    }

    // Java 的类加载机制会确保静态变量在类被 **首次主动使用** 时完成初始化
    public static void initialize() {}
}
