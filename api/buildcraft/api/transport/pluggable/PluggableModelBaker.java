package buildcraft.api.transport.pluggable;

import com.google.common.collect.ImmutableList;

import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.vertex.VertexFormat;

public interface PluggableModelBaker {
    /** @return The vertex format used to generate the quads. */
    VertexFormat getVertexFormat();

    public interface Cutout<K extends PluggableModelKeyCutout<K>> extends PluggableModelBaker {
        ImmutableList<BakedQuad> bakeCutout(K key);
    }

    public interface Translucent<K extends PluggableModelKeyTranslucent<K>> extends PluggableModelBaker {
        ImmutableList<BakedQuad> bakeTranslucent(K key);
    }
}
