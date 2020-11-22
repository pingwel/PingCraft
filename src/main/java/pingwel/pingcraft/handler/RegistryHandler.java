package pingwel.pingcraft.handler;


import pingwel.pingcraft.init.BlockInit;
import pingwel.pingcraft.init.ItemInit;
import pingwel.pingcraft.recipe.RecipeRegistry;

public class RegistryHandler
{
    public static void Client()  /* Register stuff for the client side items, armor and so on */
    {
        RecipeRegistry.registerCrafting();
        RecipeRegistry.registerSmelting();

    }

    public static void Common()
    {
        ItemInit.init();
        ItemInit.register();

        BlockInit.init();
        BlockInit.register();

    }
}
