package factory.apple;

import display.Display;
import display.apple.AppleTabletDisplay;
import factory.StandardDisplayFactory;
import display.StandardDisplay;

public class AppleTabletDisplayFactory extends StandardDisplayFactory {

    @Override
    protected StandardDisplay createDisplay(double inches) {
        return new AppleTabletDisplay(inches);
    }

    @Override
    protected Display createDisplay(double unfoldedInches, double foldedInches) {
        return null;
    }

}
