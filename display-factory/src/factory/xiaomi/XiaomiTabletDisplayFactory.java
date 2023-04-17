package factory.xiaomi;

import display.Display;
import display.StandardDisplay;
import display.xiaomi.XiaomiTabletDisplay;
import factory.StandardDisplayFactory;

public class XiaomiTabletDisplayFactory extends StandardDisplayFactory {

    @Override
    protected StandardDisplay createDisplay(double inches) {
        return new XiaomiTabletDisplay(inches);
    }

    @Override
    protected Display createDisplay(double unfoldedInches, double foldedInches) {
        return null;
    }

}
