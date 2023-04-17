package display.xiaomi;

import display.SmartphoneDisplay;

public class XiaomiSmartphoneDisplay extends SmartphoneDisplay {

    public XiaomiSmartphoneDisplay(double inches) {
        super(inches);
    }

    @Override
    public void assemble() {
        System.out.println("Montando display para SMARTPHONE Xiaomi");
        features = getInches() + "\" Super Retina XDR OLED Display 2532 X 1170 pixels resolution for Redmi Note 13 Pro";
    }

}
