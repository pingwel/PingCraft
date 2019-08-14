package pingwel.pingcraft.init;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import pingwel.pingcraft.PingCraft;
import pingwel.pingcraft.blocks.CustomOre;

public class BlockInit
{
    public  static Block pingcraft_ore;

    public static void init()
    {
        pingcraft_ore = new CustomOre("pingcraft_ore", 2.0F, 4.0F, 2);
    }

    public static void register()
    {
        registerBlock(pingcraft_ore);
    }

    public static void registerBlock(Block block)
    {
        ForgeRegistries.BLOCKS.register(block);
        block.setCreativeTab(PingCraft.pingcrafttab);
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        ForgeRegistries.ITEMS.register(item);

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }

}
