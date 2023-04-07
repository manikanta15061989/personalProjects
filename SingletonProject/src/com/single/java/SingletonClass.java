package com.single.java;

public class SingletonClass implements Cloneable {

	private static SingletonClass singleton;
	private int x, y;

//	public static SingletonClass getInstance() {
//		if (singleton == null) {
//			synchronized (SingletonClass.class) {
//				if (singleton == null) {
//					singleton = new SingletonClass();
//
//				}
//			}
//		}
//		return singleton;
//	}

	private static class SingletonHelper {
		private static final SingletonClass instance = new SingletonClass();
	}

	private SingletonClass() {
	}

	public SingletonClass getInstance() {
		return SingletonHelper.instance;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		SingletonClass that = (SingletonClass) o;
		return x == that.x && y == that.y;
	}

	@Override
	public int hashCode() {
		return 22 * 82 + (21);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException();
	}

	public static void main(String[] args) {

		SingletonClass c1 = new SingletonClass();
		System.out.println("hashcode 1 " + c1.getInstance().hashCode());
		SingletonClass c2 = new SingletonClass();
		System.out.println("hashcode 2 " + c2.getInstance().hashCode());
	}

}
