package in.co.singleimmutable;

public final class MImmutableSingleton {

	private static volatile MImmutableSingleton myinstance;

	private MImmutableSingleton() {
		if (myinstance != null) {
			throw new IllegalStateException(
					"I M SingleTon,Object Already in use");
		}

	}

	public static MImmutableSingleton getInstance() {

		if (myinstance == null) {

			synchronized (MImmutableSingleton.class) {
				if (myinstance == null) {

					myinstance = new MImmutableSingleton();

				}
			}

		}

		return myinstance;

	}
}
