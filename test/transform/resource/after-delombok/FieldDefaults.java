class FieldDefaults1 {
	static int STATIC = 3;
	final int x;
	int y;
	FieldDefaults1(int x) {
		this.x = x;
	}
}
class FieldDefaults2 {
	static int STATIC = 3;
	int x;
	private int y;
}