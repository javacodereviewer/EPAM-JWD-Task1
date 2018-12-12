package com.mrmrmr7.figure.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity class of Sphere
 * @author meow
 * @version 1.0
 */

@Entity
public class Sphere extends Point  {	
	@Id
	private double z;
	private double r;

	/**
	 * Constructor - creating new object with known parameters
	 * @param x x-orb coordinate
	 * @param y y-orb coordinate
	 * @param z z-orb coordinate
	 * @param r radius of Sphere
	 */
	public Sphere(double r, double x, double y, double z) {
		super(x, y);
		this.z = z;
		this.r = r;
	}
	
	public Sphere() {
		this(0,0,0,0);
	}
	/**
	 * Sphere.java
	 * Method to get private parameter <b>r</b>
	 * @return radius of Sphere
	 */
	public double getR() {
		return r;
	}

	/**
	 * Method to set private parameter <b>r</b>
	 * @param r new radius of Sphere
	 */
	public void setR(double r) {
		this.r = r;
	}

	/**
	 * Method to get private parameter <b>z</b>
	 * @return z coordinate of Sphere
	 */
	public double getZ() {
		return z;
	}

	/**
	 * Method to set private parameter <b>z</b>
	 * @param z new z coordinate
	 */
	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(r);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(z);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sphere other = (Sphere) obj;
		if (Double.doubleToLongBits(r) != Double.doubleToLongBits(other.r))
			return false;
		if (Double.doubleToLongBits(z) != Double.doubleToLongBits(other.z))
			return false;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sphere [z=" + z + ", r=" + r + ", x=" + x + ", y=" + y + "]";
	}
}
