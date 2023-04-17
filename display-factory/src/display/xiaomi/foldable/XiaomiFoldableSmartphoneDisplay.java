package display.xiaomi.foldable;

import display.FoldableSmartphoneDisplay;

public class XiaomiFoldableSmartphoneDisplay extends FoldableSmartphoneDisplay {

    public XiaomiFoldableSmartphoneDisplay(double unfoldedInches, double foldedInches) {
        super(unfoldedInches, foldedInches);
    }

    @Override
    public void assemble() {
        System.out.println("Montando display para SMARTPHONE Xiaomi");
        features = getInches() + "\" Super Retina XDR OLED Display 2532 X 1170 pixels resolution for Redmi Note Fold 2";
    }

}
