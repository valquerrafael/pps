package display.apple;

import display.SmartphoneDisplay;

public class AppleSmartphoneDisplay extends SmartphoneDisplay {

    public AppleSmartphoneDisplay(double inches) {
        super(inches);
    }

    @Override
    public void assemble() {
        System.out.println("Montando display para SMARTPHONE Apple");
        features = getInches() + "\" Super Retina XDR OLED Display 2532 X 1170 pixels resolution for iPhone 14";
    }

}
