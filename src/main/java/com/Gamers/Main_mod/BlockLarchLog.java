package com.Gamers.Main_mod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;

public class BlockLarchLog extends BlockLog{
	public IIcon[] icons = new IIcon[6];
	private String mod_name;
	
	protected BlockLarchLog (String name) {
		mod_name = name;
		this.setBlockName(name + "log");
		this.setHardness(10F);
		this.setResistance(10F);
		this.setHarvestLevel("axe", 0);
	}
	
	public void registerBlockIcons(IIconRegister reg) {
		this.icons[0] = reg.registerIcon(Mod_Main.MODID + ":log_" + mod_name + "_top");
		this.icons[1] = reg.registerIcon(Mod_Main.MODID + ":log_" + mod_name + "_top");
		for (int i = 2; i < 6; i ++) {
		    this.icons[i] = reg.registerIcon(Mod_Main.MODID + ":log_" + mod_name);
		  }
	}
	
	public IIcon getIcon(int side, int meta) {
		  return this.icons[side];
		}
}
