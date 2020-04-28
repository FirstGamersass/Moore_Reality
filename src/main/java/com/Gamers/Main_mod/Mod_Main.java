package com.Gamers.Main_mod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

@Mod(modid = Mod_Main.MODID, name = Mod_Main.MODNAME, version = Mod_Main.VERSION)
public class Mod_Main {
	
	public static final CreativeTabs tabFirstMod = new CreativeTabs("tabFirstMod") {
		public Item getTabIconItem() {
			return Item.getItemFromBlock(Mod_Main.LarchLog);
		}
	};
	
    public static final String MODID = "FstMod";
	public static final String MODNAME = "FirstMod";
    public static final String VERSION = "1.0";
	
    public static Block LarchLog;
    public static Block LarchPlanks;
    public static Block LarchLeaves;
    public static Block BigChest;
	
	@EventHandler
	public void preLoad(FMLPreInitializationEvent event){
		LarchPlanks = new BlockLarchPlanks("larch").setCreativeTab(tabFirstMod);
		LarchLog = new BlockLarchLog("larch").setCreativeTab(tabFirstMod);
		LarchLeaves = new BlockLarchLeaves("larch").setCreativeTab(tabFirstMod);

		GameRegistry.registerBlock(LarchLog, "LarchLog");
		GameRegistry.registerBlock(LarchPlanks, "LarchPlanks");
		GameRegistry.registerBlock(LarchLeaves, "LarchLeaves");
	}
}
