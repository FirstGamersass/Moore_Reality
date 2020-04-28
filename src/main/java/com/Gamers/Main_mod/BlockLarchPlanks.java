package com.Gamers.Main_mod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public class BlockLarchPlanks extends Block{

	protected BlockLarchPlanks(String name) {
		super(Material.plants);
		this.setBlockName(name + "planks");
		this.setHardness(5F);
		this.setResistance(15F);
		this.setHarvestLevel("axe", 0);
		this.setBlockTextureName(Mod_Main.MODID + ":planks_" + name);
	}
	
}
