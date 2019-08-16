package pingwel.pingcraft.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import pingwel.pingcraft.items.CustomIngot;


public class ItemInit
{
                /*Tells what items we are going to make*/
    public static Item pingcraft_ingot;

    public static void init() /*Gives items a name*/
    {
        pingcraft_ingot = new CustomIngot("pingcraft_ingot");
    }

    /*register our items*/
    public static void register()
    {
        registerItem(pingcraft_ingot);
    }



    public static void registerItem(Item item)
    {
        ForgeRegistries.ITEMS.register(item);

        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));


    }
}
