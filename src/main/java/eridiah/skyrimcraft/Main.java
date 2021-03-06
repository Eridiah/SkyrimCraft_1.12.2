package eridiah.skyrimcraft;

import eridiah.skyrimcraft.init.NetworkInit;
import eridiah.skyrimcraft.proxy.CommonProxy;
import eridiah.skyrimcraft.tabs.TabBlocks;
import eridiah.skyrimcraft.tabs.TabItems;
import eridiah.skyrimcraft.tabs.TabWeapons;
import eridiah.skyrimcraft.util.Reference;
import eridiah.skyrimcraft.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Main 
{
	@Instance
	public static Main instance;
	
	public static final CreativeTabs TAB_ITEMS = new TabItems("test_tab_items");
	public static final CreativeTabs TAB_BLOCKS = new TabBlocks("tab_blocks");
	public static final CreativeTabs TAB_WEAPONS = new TabWeapons("tab_weapons");
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.preInitRegistries();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		RegistryHandler.initRegistries();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
