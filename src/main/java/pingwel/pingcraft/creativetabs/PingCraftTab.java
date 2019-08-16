package pingwel.pingcraft.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import pingwel.pingcraft.init.ItemInit;


public class PingCraftTab extends CreativeTabs
{
    public PingCraftTab(String label) { super("pingcrafttab");
        this.setBackgroundImageName("pingcrafttabs.png"); }
        public ItemStack getTabIconItem()
        {
                return new ItemStack(ItemInit.pingcraft_ingot);
        }
}
