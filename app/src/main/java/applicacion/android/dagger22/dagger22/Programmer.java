package applicacion.android.dagger22.dagger22;

public class Programmer{
    private String name;

	public Programmer(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Programmer{" +
				"name='" + name + '\'' +
				'}';
	}
}
