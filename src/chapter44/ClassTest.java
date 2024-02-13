package chapter44;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Customer customer = new Customer("짱구");
        Class claszz = customer.getClass();
//        Class claszz2 = Customer.class;

        Constructor[] constructors = claszz.getConstructors();
        for(Constructor constructor : constructors) {
//            System.out.println(constructor);
        }
        String a = null;
        Method[] methods = claszz.getMethods();

        for (Method method : methods) {
//            System.out.println(method);
        }

        Field[] fields = claszz.getDeclaredFields();
        for (Field field : fields) {
//            System.out.println(field);
        }

        Customer customer2 = (Customer) claszz.getConstructor(String.class).newInstance("신짱구"); //가장 상위타입의 오브젝트

        System.out.println(customer2);
    }
}
