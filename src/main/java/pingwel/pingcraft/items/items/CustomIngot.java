package pingwel.pingcraft.items.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import pingwel.pingcraft.PingCraft;

public class CustomIngot extends Item
{
    public CustomIngot(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(PingCraft.pingcrafttab);
    }
}
