package com.Gamers.Main_mod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;

public class BlockLarchLeaves extends BlockLeaves{
	public IIcon[] icons = new IIcon[6];
	private String mod_name;
	private boolean grafic = true;
	
	protected BlockLarchLeaves (String name) {
		mod_name = name;
		this.setBlockName(name + "leaves");
	}
	
	public boolean isOpaqueCube()
	{
		return !this.grafic;
	}
	
	@SideOnly(Side.CLIENT)
	public void setGraphicsLevel(boolean p_150122_1_)
    {
        this.grafic = p_150122_1_;
    }

	
	public void registerBlockIcons(IIconRegister reg) {
		for (int i = 0; i < 6; i ++) {
		    this.icons[i] = reg.registerIcon(Mod_Main.MODID + ":leaves_" + (this.grafic ? mod_name : mod_name + "_opaque"));
		  }
	}
	
	public IIcon getIcon(int side, int meta) {
		  return this.icons[side];
		}
	
	public String[] func_150125_e() {
		
		return null;
	}

}
