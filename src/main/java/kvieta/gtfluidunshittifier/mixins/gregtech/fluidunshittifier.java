package kvieta.gtfluidunshittifier.mixins.gregtech;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import kvieta.gtfluidunshittifier.gtfluidunshittifier;
import gregtech.api.GregTechAPI;
import gregtech.api.unification.material.Material;
import gregtech.api.fluids.MetaFluids;
import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.unification.ore.OrePrefix;


@Mixin(value=MetaFluids.class, remap=false)
public class fluidunshittifier {

    @Inject(method = "init", at = @At("TAIL"))
    private static void onInit(CallbackInfo info) {
        UnshittifyMoltenMetal();
    }

    @Unique
    private static void UnshittifyMoltenMetal() {
        for (Material material : GregTechAPI.materialManager.getRegisteredMaterials()) {
            if(OrePrefix.ingot.doGenerateItem(material)) {
                if (material.hasFluid() && !material.getFluid().isGaseous())  {
//                    gtfluidunshittifier.LOGGER.info("Unshittifying Fluid for "+material.getName());
//                    TODO: stuff
                }
            }
        }
    }
}
