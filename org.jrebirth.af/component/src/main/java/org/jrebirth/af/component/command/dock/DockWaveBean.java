package org.jrebirth.af.component.command.dock;

import org.jrebirth.af.api.key.UniqueKey;
import org.jrebirth.af.api.ui.Model;
import org.jrebirth.af.api.wave.WaveBean;
import org.jrebirth.af.component.ui.beans.DockConfig;
import org.jrebirth.af.component.ui.beans.TabConfig;

public class DockWaveBean implements WaveBean {

    private String dockHolderKey;

    private DockConfig dockConfig;

    private Model[] model;

    private UniqueKey<? extends Model>[] modelKey;

    private TabConfig[] tab;

    public static DockWaveBean create() {
        return new DockWaveBean();
    }

    /**
     * @return Returns the dockHolderKey.
     */
    public String dockHolderKey() {
        return this.dockHolderKey;
    }

    /**
     * @param dockHolderKey The dockHolderKey to set.
     */
    public DockWaveBean dockHolderKey(final String dockHolderKey) {
        this.dockHolderKey = dockHolderKey;
        return this;
    }

    /**
     * @return Returns the model.
     */
    public Model[] model() {
        return this.model;
    }

    /**
     * @param model The tab to set.
     */
    public DockWaveBean model(final Model... model) {
        this.model = model;
        return this;
    }

    /**
     * @return Returns the modelKey.
     */
    public UniqueKey<? extends Model>[] modelKey() {
        return this.modelKey;
    }

    /**
     * @param modelKey The modelKey to set.
     */
    @SafeVarargs
    public final DockWaveBean modelKey(final UniqueKey<? extends Model>... modelKey) {
        this.modelKey = modelKey;
        return this;
    }

    /**
     * @return Returns the tab.
     */
    public TabConfig[] tab() {
        return this.tab;
    }

    /**
     * @param tab The tab to set.
     */
    public DockWaveBean tab(final TabConfig... tab) {
        this.tab = tab;
        return this;
    }

    public DockConfig dockConfig() {
        return this.dockConfig;
    }

    public DockWaveBean dockConfig(final DockConfig dockConfig) {
        this.dockConfig = dockConfig;
        return this;
    }

}
