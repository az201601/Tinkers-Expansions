package TExpansions.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mantle.blocks.abstracts.InventoryBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import tconstruct.library.TConstructRegistry;

public class blockChestStation extends InventoryBlock 
{
	public blockChestStation(Material material) 
	{
		super(material);
		setCreativeTab((CreativeTabs)TConstructRegistry.blockTab);
		setHardness(2.0F);
		setStepSound(Block.soundTypeWood);
	}
	
	public String[] getTextureNames()
	{
		String[] textureNames = {};
		return textureNames;
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIIcon(int side, int meta)
	{
		
	}
	

}