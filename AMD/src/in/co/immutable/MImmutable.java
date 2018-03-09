package in.co.immutable;

public final class MImmutable {// MAKE CLASS FINAL

	private final String name;// PRIAVTE FINAL ATTRIBUTE
	private final String mobile;

	public MImmutable(String name, String mobile) {// PARAMETERIZED CONSTRUCTOR
													// TO INITIZLE FINAL
													// ATTRIBUTE
		this.name = name;
		this.mobile = mobile;

	}

	public String getName() {// THERE SHOULD ONLY BE GETTER METHODS
		return name;
	}

	public String getMobile() {
		return mobile;
	}

}
