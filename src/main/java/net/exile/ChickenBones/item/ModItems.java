package net.exile.ChickenBones.item;

import net.exile.ChickenBones.ChickenBones;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ChickenBones.MOD_ID);

    public static final RegistryObject<Item> CHICKENBONE = ITEMS.register("chickenbone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHICKAXE = ITEMS.register("chickaxe",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
