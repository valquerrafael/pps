package factory.xiaomi.foldable;

import display.Display;
import display.FoldableDisplay;
import display.xiaomi.foldable.XiaomiFoldableTabletDisplay;
import factory.FoldableDisplayFactory;

public class XiaomiFoldableTabletDisplayFactory extends FoldableDisplayFactory {

    @Override
    protected FoldableDisplay createDisplay(double inches) {
        return null;
    }

    @Override
    protected Display createDisplay(double unfoldedInches, double foldedInches) {
        return new XiaomiFoldableTabletDisplay(unfoldedInches, foldedInches);
    }

}
