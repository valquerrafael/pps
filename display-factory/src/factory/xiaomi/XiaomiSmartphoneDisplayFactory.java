package factory.xiaomi;

import display.Display;
import display.StandardDisplay;
import display.xiaomi.XiaomiSmartphoneDisplay;
import factory.StandardDisplayFactory;

public class XiaomiSmartphoneDisplayFactory extends StandardDisplayFactory {

    @Override
    protected StandardDisplay createDisplay(double inches) {
        return new XiaomiSmartphoneDisplay(inches);
    }

    @Override
    protected Display createDisplay(double unfoldedInches, double foldedInches) {
        return null;
    }

}
