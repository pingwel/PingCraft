package pingwel.pingcraft.blocks;

public class CustomOre extends CustomBlock
{
    public CustomOre(String name, float hardness, float resistrance, int harvestLevel)
    {
        super(name, hardness, resistrance);
        setHarvestLevel("pickaxe", harvestLevel);
    }
}
