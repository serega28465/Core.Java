package core.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
		Class<?> carClass = Class.forName("core.reflection.Car");
		for (Field field : carClass.getDeclaredFields()) {
			System.out.println(field.getName());
		}
		Car car = new Car();
		car.setDiam(28);
		car.setName("Daewoo Lanos");
		Field diamField = carClass.getDeclaredField("diam");
		diamField.setAccessible(true);
		int diam = diamField.getInt(car);
		System.out.println(diam);
		Field nameField = carClass.getDeclaredField("name");
		nameField.setAccessible(true);
		Object name = nameField.get(car);
		System.out.println(name);
		
		Object car1 = carClass.newInstance();
		System.out.println(car1);
		diamField.setInt(car1, diam);
		nameField.set(car1, name);
		System.out.println(car1);
		
		Method getDiam = carClass.getDeclaredMethod("getDiam");
		Method getName = carClass.getDeclaredMethod("getName");
		
		Object diam1 = getDiam.invoke(car);
		Object name1 = getName.invoke(car);
		System.out.println(diam1+" "+name1);
		
		Method setDiam = carClass.getDeclaredMethod("setDiam", int.class);
		Method setName = carClass.getDeclaredMethod("setName", String.class);
		
		Object car2 = carClass.newInstance();
		System.out.println(car2);
		
		setDiam.invoke(car2, diam1);
		setName.invoke(car2, name1);
		
		System.out.println(car2);
		
		
	}

}
