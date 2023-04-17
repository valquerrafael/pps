package factory.xiaomi.foldable;

import display.Display;
import display.FoldableDisplay;
import display.xiaomi.foldable.XiaomiFoldableSmartphoneDisplay;
import factory.FoldableDisplayFactory;

public class XiaomiFoldableSmartphoneDisplayFactory extends FoldableDisplayFactory {

    @Override
    protected FoldableDisplay createDisplay(double inches) {
        return null;
    }

    @Override
    protected Display createDisplay(double unfoldedInches, double foldedInches) {
        return new XiaomiFoldableSmartphoneDisplay(unfoldedInches, foldedInches);
    }

}
