package eu.elfring.mekanismimc;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;

@Mod(modid = MekanismIMC.MODID, version = MekanismIMC.VERSION)
public class MekanismIMC {
    public static final String MODID = "mekanismimc";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        NBTTagCompound recipeTag = new NBTTagCompound();
        recipeTag.setTag("input", new ItemStack(Blocks.COBBLESTONE).writeToNBT(new NBTTagCompound()));
        recipeTag.setTag("output", new ItemStack(Items.DIAMOND).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "EnrichmentChamberRecipe", recipeTag);
    }
}
