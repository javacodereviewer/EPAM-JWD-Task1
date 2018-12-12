package com.mrmrmr7.figure.entity;

/**
 * Class of figures with fields <b>X</b> and <b>Y</b>
 * @author meow
 * @version 1.0
 */
public abstract class Figure {
	
	/** X coordinate */
	double x;
	
	/** Y coordinate */
	double y;
	
	/** constructor - creating of new object 
	 * @see Figure#Figure(double, double)
	 */
	Figure(){
		this(0,0);
	};
	
	/** constructor - creating of new object with paramethres
	 * 
	 * @param x
	 * @param y
	 * @see Figure#Figure()
	 */
	Figure(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figure other = (Figure) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	};
	
	
}
