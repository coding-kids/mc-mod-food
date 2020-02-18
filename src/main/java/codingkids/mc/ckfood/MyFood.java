package codingkids.mc.ckfood;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MyFood extends ItemFood {
    public MyFood(int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        setAlwaysEdible();
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 2400, 5, false, true));
    }

    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
}
