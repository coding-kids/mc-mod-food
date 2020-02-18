package codingkids.mc.ckfood.proxy;

import codingkids.mc.ckfood.FoodMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Wilson Wu on 2020/02/11.
 */
@Mod.EventBusSubscriber
public interface CommonProxy {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(FoodMod.myFood);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(FoodMod.myFood, 0, new ModelResourceLocation(FoodMod.myFood.getRegistryName(), "inventory"));
    }
}
