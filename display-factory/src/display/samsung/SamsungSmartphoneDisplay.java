package display.samsung;

import display.SmartphoneDisplay;

public class SamsungSmartphoneDisplay extends SmartphoneDisplay {

    public SamsungSmartphoneDisplay(double inches) {
        super(inches);
    }

    @Override
    public void assemble() {
        System.out.println("Montando display para SMARTPHONE Samsung");
        features = getInches() + "\" Super Retina XDR OLED Display 2532 X 1170 pixels resolution for Galaxy S22Ultra";
    }

}
