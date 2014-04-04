package org.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test {

	static void callVoidMethod() throws Exception {

		Class cls = Class.forName("org.reflect.Sample");
		Object ob = cls.newInstance();

		Method method = cls.getDeclaredMethod("print");
		method.invoke(ob);

	}

	static void callReturnTypeMethod() throws Exception {
		Class cls = Class.forName("org.reflect.Sample");
		Object ob = cls.newInstance();

		Method method = cls.getDeclaredMethod("getMessage");
		System.out.println(method.invoke(ob));

	}

	static void callVoidMethodWithParam() throws Exception {
		Class cls = Class.forName("org.reflect.Sample");
		Object ob = cls.newInstance();

		Class[] paramTypes = new Class[1];
		paramTypes[0] = String.class;

		Object[] paramValues = new Object[1];
		paramValues[0] = "Sudarshan !";

		Method method = cls.getDeclaredMethod("print", paramTypes);
		method.invoke(ob, paramValues);

	}

	static void callVoidMethodWithParams() throws Exception {
		Class cls = Class.forName("org.reflect.Sample");
		Object ob = cls.newInstance();

		Class[] paramTypes = new Class[2];
		paramTypes[0] = Integer.class;
		paramTypes[1] = String.class;

		Object[] paramValues = new Object[2];
		paramValues[0] = 111;
		paramValues[1] = "CMC";

		Method method = cls.getDeclaredMethod("print", paramTypes);
		method.invoke(ob, paramValues);

	}

	static void callVoidMethodWithObjParam() throws Exception {
		Class cls = Class.forName("org.reflect.Sample");
		Object ob = cls.newInstance();

		Class[] paramTypes = new Class[1];
		paramTypes[0] = Employee.class;

		Employee employee = new Employee();
		employee.setId(111);
		employee.setName("AAA");
		employee.setSalary(4500.45);

		Object[] paramValues = new Object[1];
		paramValues[0] = employee;

		Method method = cls.getDeclaredMethod("setEmployee", paramTypes);
		method.invoke(ob, paramValues);

		Method method2 = cls.getDeclaredMethod("getEmployee");
		System.out.println(method2.invoke(ob));

	}

	static void callConstructors() throws Exception {
		Class cls = Class.forName("org.reflect.Sample");

		Constructor[] constructors = cls.getDeclaredConstructors();

		System.out.println(constructors.length);
		constructors[1].newInstance(111);

	}

	public static void main(String[] args) throws Exception {

		// callVoidMethod();

		// callReturnTypeMethod();

		// callVoidMethodWithParam();

		// callVoidMethodWithParams();

		// callVoidMethodWithObjParam();

		// callConstructors();

		// Class cls = Class.forName("org.reflect.Employee");
		//
		// Field[] fields = cls.getDeclaredFields();
		//
		// System.out.println("Total Fileds : " + fields.length);
		//
		// for (Field f : fields) {
		// System.out.println(f.getName() + "\t" + f.getType());
		// }
		//
		// Method[] methods = cls.getDeclaredMethods();
		//
		// System.out.println("Total Methods : " + methods.length);
		//
		// for (Method method : methods) {
		// System.out.println(method.getName() + "\t" + method.getReturnType()
		// + "\t" + method.getParameterTypes());
		// }
		//
		// Constructor[] constructors = cls.getDeclaredConstructors();
		//
		// System.out.println("Total Constructors : " + constructors.length);
		//
		// for (int i = 0; i < constructors.length; i++) {
		// Constructor constructor = constructors[i];
		// Class[] paramTypes = constructor.getParameterTypes();
		// System.out.println(constructor.getName() + "\t");
		// for (Class c : paramTypes) {
		// System.out.println(c.getName());
		// }
		//
		// }

	}

}
