package net.exile.ChickenBones.item;

import net.exile.ChickenBones.ChickenBones;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChickenBones.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CHICKENBONES = CREATIVE_MODE_TABS.register("chickenbones",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHICKENBONE.get()))
                    .title(Component.translatable("creativetab.chickenbones"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.CHICKENBONE.get());
                        pOutput.accept(ModItems.CHICKAXE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
