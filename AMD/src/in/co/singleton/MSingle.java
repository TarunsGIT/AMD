package in.co.singleton;

public final class MSingle {// MAKE CLASS FINAL

	private MSingle() {// DEFAULT CONSTRUCTOR PRIVATE
		System.out.println("Private Default");
	}

	private static MSingle myinstance=null;// PRIAVTE STATIC VARIABLE TO HOLD CLASS
										// STATE

	public static MSingle getInstance() {// PUBLIC STATIC GET INSTANCE METHOD

		if (myinstance == null) {
			myinstance = new MSingle();
		}

		return myinstance;

	}

}
