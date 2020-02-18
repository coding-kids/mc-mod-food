package codingkids.mc.ckfood;

import codingkids.mc.ckfood.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Wilson Wu on 2020/02/11.
 */
@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME,
        acceptedMinecraftVersions = Reference.ACCEPTED_VERSION)
public class FoodMod {

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    public static MyFood myFood;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        myFood = new MyFood(5, 0.3f, false);
        myFood.setRegistryName("my_food");
        myFood.setTranslationKey("ckfood.my_food");
        myFood.setCreativeTab(CreativeTabs.FOOD);
    }

    @EventHandler
    public void init(FMLInitializationEvent event){

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }

}
