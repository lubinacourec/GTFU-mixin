package kvieta.gtfluidunshittifier.core;

import com.google.common.collect.Lists;
import zone.rong.mixinbooter.ILateMixinLoader;

import java.util.List;

public class GTFUMixin implements ILateMixinLoader
{

    @Override
    public List<String> getMixinConfigs() {
        return Lists.newArrayList(
                "mixins.mods.gregtech.json"
        );
    }
}
