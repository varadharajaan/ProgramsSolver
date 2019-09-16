package DataStructuresCustomCreatedClasses.dynamicarray;

import java.util.Arrays;

public class DynamicArray {

	Object[] data;
	int size;

	public DynamicArray() {
		size = 0;
		data = new Object[size];

	}
	
	public int getSize() {
		return data.length;
	}

	public Object get(int index) {
		return data[index];
	}

	public void put(Object element) {

		ensureCapacity(size + 1);
		data[size++] = element;

	}

	public void ensureCapacity(int minCapacity) {
		int old = data.length;
		if (minCapacity > old) {
			int newCapacity = old * 2;
			if (newCapacity < minCapacity)
				newCapacity = minCapacity;
			data = Arrays.copyOf(data, newCapacity);
		}
	}
	
	public static void main(String[] args) {
		DynamicArray dy = new DynamicArray();
		System.out.println("length1 -->"+ dy.getSize());
		dy.put(4);
		System.out.println("length2 -->"+ dy.getSize());
		dy.put(30);
		System.out.println("length3 -->"+ dy.getSize());
		dy.put(23);
		System.out.println("length4 -->"+ dy.getSize());
		dy.put("33");
		dy.put(44);
		System.out.println("length5 -->"+ dy.getSize());
	}
}
