import display.Display;
import factory.DisplayFactory;
import factory.apple.AppleSmartphoneDisplayFactory;
import factory.apple.AppleTabletDisplayFactory;
import factory.samsung.SamsungSmartphoneDisplayFactory;
import factory.samsung.SamsungTabletDisplayFactory;
import factory.samsung.foldable.SamsungFoldableSmartphoneDisplayFactory;
import factory.samsung.foldable.SamsungFoldableTabletDisplayFactory;
import factory.xiaomi.XiaomiSmartphoneDisplayFactory;
import factory.xiaomi.XiaomiTabletDisplayFactory;
import factory.xiaomi.foldable.XiaomiFoldableSmartphoneDisplayFactory;
import factory.xiaomi.foldable.XiaomiFoldableTabletDisplayFactory;

public class MainFactoryMethod {

	public static void main(String[] args) {
		DisplayFactory factory = null;
		Display display = null;

		factory = new AppleSmartphoneDisplayFactory();
		display = factory.create(6.1);
		System.out.println(display);
		System.out.println();

		factory = new AppleTabletDisplayFactory();
		display = factory.create(10.2);
		System.out.println(display);
		System.out.println();

		factory = new SamsungSmartphoneDisplayFactory();
		display = factory.create(6.2);
		System.out.println(display);
		System.out.println();

		factory = new SamsungTabletDisplayFactory();
		display = factory.create(10.3);
		System.out.println(display);
		System.out.println();

		factory = new SamsungFoldableSmartphoneDisplayFactory();
		display = factory.create(6.3, 3.15);
		System.out.println(display);
		System.out.println();

		factory = new SamsungFoldableTabletDisplayFactory();
		display = factory.create(10.4, 5.2);
		System.out.println(display);
		System.out.println();

		factory = new XiaomiSmartphoneDisplayFactory();
		display = factory.create(6.4);
		System.out.println(display);
		System.out.println();

		factory = new XiaomiTabletDisplayFactory();
		display = factory.create(10.5);
		System.out.println(display);
		System.out.println();

		factory = new XiaomiFoldableSmartphoneDisplayFactory();
		display = factory.create(6.5, 3.25);
		System.out.println(display);
		System.out.println();

		factory = new XiaomiFoldableTabletDisplayFactory();
		display = factory.create(10.6, 5.3);
		System.out.println(display);
		System.out.println();

	}

}
