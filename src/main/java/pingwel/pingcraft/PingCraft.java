package pingwel.pingcraft;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.SidedProxy;
import pingwel.pingcraft.creativetabs.PingCraftTab;
import pingwel.pingcraft.proxy.CommonProxy;
import pingwel.pingcraft.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class PingCraft
{
    public static final CreativeTabs pingcrafttab = new PingCraftTab("pingcrafttab");

    @SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public static void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}