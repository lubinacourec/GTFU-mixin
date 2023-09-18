package kvieta.gtfluidunshittifier;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(
        modid = gtfluidunshittifier.MODID,
        name = gtfluidunshittifier.NAME,
        version = gtfluidunshittifier.VERSION,
        dependencies = "required-after:forge@[14.23.5.2859,);"
        + "required-after:gregtech@[2.7.3-beta,);"
)
public class gtfluidunshittifier {
    public static final String MODID = "gtfluidunshittifier";
    public static final String NAME = "Gregtech Fluid Unshittifier";
    public static final String VERSION = "0.1";

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent preinit) {
        LOGGER.info("Preparing for unshittification...");
    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent postinit) {
        LOGGER.info("Reticulating Splines...");
    }
}
