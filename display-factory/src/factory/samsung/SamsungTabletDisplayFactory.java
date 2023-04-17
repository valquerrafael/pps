package factory.samsung;

import display.Display;
import display.StandardDisplay;
import display.samsung.SamsungTabletDisplay;
import factory.StandardDisplayFactory;

public class SamsungTabletDisplayFactory extends StandardDisplayFactory {

    @Override
    protected StandardDisplay createDisplay(double inches) {
        return new SamsungTabletDisplay(inches);
    }

    @Override
    protected Display createDisplay(double unfoldedInches, double foldedInches) {
        return null;
    }

}
