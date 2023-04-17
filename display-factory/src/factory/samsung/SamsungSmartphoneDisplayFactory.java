package factory.samsung;

import display.Display;
import display.StandardDisplay;
import display.samsung.SamsungSmartphoneDisplay;
import factory.StandardDisplayFactory;

public class SamsungSmartphoneDisplayFactory extends StandardDisplayFactory {

    @Override
    protected StandardDisplay createDisplay(double inches) {
        return new SamsungSmartphoneDisplay(inches);
    }

    @Override
    protected Display createDisplay(double unfoldedInches, double foldedInches) {
        return null;
    }

}
