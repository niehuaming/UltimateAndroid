package com.fss.Common.uiModule.tileView.tileview.tiles.selector;

import com.fss.Common.uiModule.tileView.tileview.detail.DetailLevel;
import com.fss.Common.uiModule.tileView.tileview.detail.DetailLevelSet;

public interface TileSetSelector {
    public DetailLevel find(double scale, DetailLevelSet levels);
}
