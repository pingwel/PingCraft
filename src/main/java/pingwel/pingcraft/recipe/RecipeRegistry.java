package pingwel.pingcraft.recipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pingwel.pingcraft.init.ArmorInit;
import pingwel.pingcraft.init.BlockInit;
import pingwel.pingcraft.init.ItemInit;
import pingwel.pingcraft.init.ToolInit;

public class RecipeRegistry

{
    public static void registerCrafting()
    {
        GameRegistry.addShapedRecipe(new ResourceLocation("pingcraft:pingcraft_ore"), new ResourceLocation("pingcraft:pingcraft_blocks"), new ItemStack(BlockInit.pingcraft_ore), "SSS","SIS","SSS",'S', Blocks.STONE, 'I', ItemInit.pingcraft_ingot);
        registerArmorCrafting(ArmorInit.pingcraft_helmet, ArmorInit.pingcraft_chestplate, ArmorInit.pingcraft_leggings, ArmorInit.pingcraft_boots, ItemInit.pingcraft_ingot);
        registerToolCrafting(ToolInit.pingcraft_axe, ToolInit.pingcraft_hoe, ToolInit.pingcraft_pickaxe, ToolInit.pingcraft_shovel,ToolInit.pingcraft_sword, ItemInit.pingcraft_ingot);

    }

    public static void registerSmelting()
    {
        GameRegistry.addSmelting(BlockInit.pingcraft_ore, new ItemStack(ItemInit.pingcraft_ingot), 10);
    }

    private static void registerToolCrafting(Item axe, Item hoe, Item pickaxe, Item shovel, Item sword, Item ingot)
    {
        GameRegistry.addShapedRecipe(new ResourceLocation("" + axe.getRegistryName()), new ResourceLocation("pingcraft:pingcraft:items_tools"), new ItemStack(axe), "II ", "IS ", " S ", 'S', Items.STICK, 'I', ItemInit.pingcraft_ingot);
        GameRegistry.addShapedRecipe(new ResourceLocation("" + hoe.getRegistryName()), new ResourceLocation("pingcraft:pingcraft:items_tools"), new ItemStack(hoe), "II ", " S ", " S ", 'S', Items.STICK, 'I', ItemInit.pingcraft_ingot);
        GameRegistry.addShapedRecipe(new ResourceLocation("" + pickaxe.getRegistryName()), new ResourceLocation("pingcraft:pingcraft:items_tools"), new ItemStack(pickaxe), "III", " S ", " S ", 'S', Items.STICK, 'I', ItemInit.pingcraft_ingot);
        GameRegistry.addShapedRecipe(new ResourceLocation("" + shovel.getRegistryName()), new ResourceLocation("pingcraft:pingcraft:items_tools"), new ItemStack(shovel), " I ", " S ", " S ", 'S', Items.STICK, 'I', ItemInit.pingcraft_ingot);
        GameRegistry.addShapedRecipe(new ResourceLocation("" + sword.getRegistryName()), new ResourceLocation("pingcraft:pingcraft:items_tools"), new ItemStack(sword), " I ", " I ", " S ", 'S', Items.STICK, 'I', ItemInit.pingcraft_ingot);
    }

    private static void registerArmorCrafting(Item helmet, Item chestplate, Item leggings, Item boots, Item ingot)
    {
        GameRegistry.addShapedRecipe(new ResourceLocation("" + helmet.getRegistryName()), new ResourceLocation("pingcraft:pingcraft:items_armor"), new ItemStack(helmet), "III", "I I", "   ", 'I', ItemInit.pingcraft_ingot);
        GameRegistry.addShapedRecipe(new ResourceLocation("" + chestplate.getRegistryName()), new ResourceLocation("pingcraft:pingcraft:items_armor"), new ItemStack(chestplate), "I I", "III", "III", 'I', ItemInit.pingcraft_ingot);
        GameRegistry.addShapedRecipe(new ResourceLocation("" + leggings.getRegistryName()), new ResourceLocation("pingcraft:pingcraft:items_armor"), new ItemStack(leggings), "III", "I I", "I I", 'I', ItemInit.pingcraft_ingot);
        GameRegistry.addShapedRecipe(new ResourceLocation("" + boots.getRegistryName()), new ResourceLocation("pingcraft:pingcraft:items_armor"), new ItemStack(boots), "   ", "I I", "I I", 'I', ItemInit.pingcraft_ingot);
    }
}
