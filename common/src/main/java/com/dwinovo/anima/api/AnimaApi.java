package com.dwinovo.anima.api;

import com.dwinovo.anima.Constants;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.Entity;

public final class AnimaApi {

    private AnimaApi() {
    }

    public static void onEntityLoad(Entity entity) {
        if (entity.level().isClientSide()) {
            return;
        }
        if (!(entity instanceof IAnima)) {
            return;
        }

        Constants.LOG.info(
                "Anima entity loaded: {} ({})",
                entity.getUUID(),
                BuiltInRegistries.ENTITY_TYPE.getKey(entity.getType())
        );
    }
}
