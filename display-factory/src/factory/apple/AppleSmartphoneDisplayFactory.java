package factory.apple;

import display.Display;
import display.apple.AppleSmartphoneDisplay;
import display.StandardDisplay;
import factory.StandardDisplayFactory;

public class AppleSmartphoneDisplayFactory extends StandardDisplayFactory {

    @Override
    protected StandardDisplay createDisplay(double inches) {
        return new AppleSmartphoneDisplay(inches);
    }

    @Override
    protected Display createDisplay(double unfoldedInches, double foldedInches) {
        return null;
    }

}
