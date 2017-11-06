package applicacion.android.dagger22.dagger22;

public class Programmer{
    private String name;
	private static int count = 0;

	public Programmer(String name) {
		this.name = name;
	}

	public Programmer() {
		count++;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Programmer{");
		sb.append("name='").append(name).append('\'').append(',');
		sb.append("count='").append(count).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
