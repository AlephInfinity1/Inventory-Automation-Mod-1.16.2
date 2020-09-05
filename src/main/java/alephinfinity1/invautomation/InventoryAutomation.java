package alephinfinity1.invautomation;

import alephinfinity1.invautomation.item.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = InventoryAutomation.MOD_ID)
public class InventoryAutomation {

	public static final String MOD_ID = "invautomation";
	
	public InventoryAutomation() {
		ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}

}
