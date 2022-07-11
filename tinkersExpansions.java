package TExpansions;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = tinkersExpansions.modid, name = tinkersExpansions.name, version = tinkersExpansions.version)


public class tinkersExpansions 
{
	public static final String modid = "te";
	public static final String name = "TExpansions";
	public static final String version = "1.0";
	
	@Instance("tinkersExpansions")
	public static tinkersExpansions instance;

	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
