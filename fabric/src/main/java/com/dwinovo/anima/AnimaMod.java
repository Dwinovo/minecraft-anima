package com.dwinovo.anima;

import com.dwinovo.anima.api.AnimaApi;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;

public class AnimaMod implements ModInitializer {
    
    @Override
    public void onInitialize() {
        
        // This method is invoked by the Fabric mod loader when it is ready
        // to load your mod. You can access Fabric and Common code in this
        // project.

        // Use Fabric to bootstrap the Common mod.
        Constants.LOG.info("Hello Fabric world!");
        CommonClass.init();

        ServerEntityEvents.ENTITY_LOAD.register((entity, world) -> AnimaApi.onEntityLoad(entity));
    }
}
