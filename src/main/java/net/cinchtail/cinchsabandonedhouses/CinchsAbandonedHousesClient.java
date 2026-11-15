package net.cinchtail.cinchsabandonedhouses;

import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value = CinchsAbandonedHouses.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = CinchsAbandonedHouses.MODID, value = Dist.CLIENT)
public class CinchsAbandonedHousesClient {
    public CinchsAbandonedHousesClient(ModContainer container) {
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        CinchsAbandonedHouses.LOGGER.info("HELLO FROM CLIENT SETUP");
        CinchsAbandonedHouses.LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
    }
}
