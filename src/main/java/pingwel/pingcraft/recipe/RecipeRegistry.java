package pingwel.pingcraft.recipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pingwel.pingcraft.init.BlockInit;
import pingwel.pingcraft.init.ItemInit;

public class RecipeRegistry

{
    public static void registerCrafting()
    {
        GameRegistry.addShapedRecipe(new ResourceLocation("pingcraft:pingcraft_ore"), new ResourceLocation("pingcraft:pingcraft_blocks"), new ItemStack(BlockInit.pingcraft_ore), "SSS","SIS","SSS",'S', Blocks.STONE, 'I', ItemInit.pingcraft_ingot);

    }

    public static void registerSmelting()
    {
        GameRegistry.addSmelting(BlockInit.pingcraft_ore, new ItemStack(ItemInit.pingcraft_ingot), 10);
    }
}
