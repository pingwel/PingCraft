package pingwel.pingcraft.items.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import pingwel.pingcraft.PingCraft;
import pingwel.pingcraft.reference.Reference;

import javax.swing.text.html.parser.Entity;

public class CustomArmor extends ItemArmor
{
    String customarmor;
    public CustomArmor(String name, CustomArmor.ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(Reference.MOD_NAME + ":" + name + "_" + equipmentSlotIn.getName());
        setRegistryName(Reference.MOD_ID + ":" + name + "_" + equipmentSlotIn.getName());
        customarmor = name;
        setCreativeTab(PingCraft.pingcrafttab);
    }
    @SideOnly(Side.CLIENT)
    public EntityEquipmentSlot getEquipmentSlot()
    {
        return this.armorType;
    }
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
    {
        return Reference.MOD_ID + ":textures/models/armor/" + this.customarmor + "_layer_" + (this.renderIndex == 2 ? "2" : "1") + ".png";
    }
}
