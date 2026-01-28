package com.dwinovo.anima;


import com.dwinovo.anima.api.AnimaApi;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;

@Mod(Constants.MOD_ID)
public class AnimaMod {

    public AnimaMod(IEventBus eventBus) {

        // This method is invoked by the NeoForge mod loader when it is ready
        // to load your mod. You can access NeoForge and Common code in this
        // project.

        // Use NeoForge to bootstrap the Common mod.
        Constants.LOG.info("Hello NeoForge world!");
        CommonClass.init();

        NeoForge.EVENT_BUS.addListener(AnimaMod::onEntityJoinLevel);
    }

    private static void onEntityJoinLevel(EntityJoinLevelEvent event) {
        AnimaApi.onEntityLoad(event.getEntity());
    }
}
