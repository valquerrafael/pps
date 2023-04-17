package factory;

import display.Display;

import java.util.concurrent.TimeUnit;

public abstract class DisplayFactory {

    public Display create(double inches) {
        Display display = createDisplay(inches);
        display.assemble();
        qualityTest(display);
        return display;
    }

    public Display create(double unfoldedInches, double foldedInches) {
        Display display = createDisplay(unfoldedInches, foldedInches);
        display.assemble();
        qualityTest(display);
        return display;
    }

    public void qualityTest( Display display ) {
        System.out.print("Teste de Qualidade: ");
        for (int i = 1; i < 4; i++) {
            System.out.print(  "[*] ");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" OK (passed)");

    }

    // Metodo de fabrica
    protected abstract Display createDisplay(double inches);

    protected abstract Display createDisplay(double unfoldedInches, double foldedInches);

}
