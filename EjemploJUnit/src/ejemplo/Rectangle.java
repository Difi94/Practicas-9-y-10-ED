package ejemplo;

public class Rectangle {

    private int width;
    private int height;

    private static final int MULTIPLIER = 2;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int surface() {
        if (!isValidDimensions()) {
            return -1;
        }
        if (isZeroDimension()) {
            return 0;
        }
        return width * height;
    }

    public int perimeter() {
        if (!isValidDimensions()) {
            return -1;
        }
        if (isZeroDimension()) {
            return 0;
        }
        return MULTIPLIER * width + MULTIPLIER * height;
    }

    // Método extraído para validaciones
    private boolean isValidDimensions() {
        return width >= 0 && height >= 0;
    }

    private boolean isZeroDimension() {
        return width == 0 || height == 0;
    }

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}