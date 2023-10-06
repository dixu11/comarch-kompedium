package reflection;

import java.lang.reflect.*;

public class ReflectionDemo {
    //refleksja to taki zaawansowany parser kodu javowego, pozwala wyszukiwać, metody kostruktory itp w kodzie javowym
    //nie modyfikuje tych klas
    //pozwala używać kodu javowego od kuchni
    //używa się go wtedy kiedy nie da się inaczej np programując jakąś bibliotekę/framework (Spring,Hibernate, Jackson)
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class klasa ; // podstawa refleksji: obiekt Class
        //przez typ
        Class class1 = Person.class;

        //przez referencje
        Object object = new Person("Jan", 18);
        Class class2 = object.getClass();

        //przez pełną nazwę klasy
        Class class3 = Class.forName("reflection.Person");

        System.out.println(class1);
        System.out.println(class2);
        System.out.println(class3);

        //uzyskanie metody
        Method[] methods = class1.getMethods();
        for (Method method : methods) {
            System.out.printf("Metoda zwraca %s nazwa %s i ma %d parametrów, modyfikatory: %s\n",
                    method.getReturnType(), method.getName(),method.getParameters().length, Modifier.toString(method.getModifiers()));
        }

        Method method = class1.getMethod("sayHelloTo", String.class);
        method.invoke(object,"Marcin");
       // person.sayHelloTo("Marcin");

        //uzyskanie konstruktora
        Constructor constructor = class1.getConstructor(String.class, int.class);
       Person person = (Person) constructor.newInstance("Roman", 30);
        System.out.println(person);

        //dostęp do pola
        Field field = class1.getDeclaredField("age");  //Declared -> nawet te ktorych nie powinienem tu widzieć
        field.setAccessible(true);
        field.set(person,1);
        System.out.println(person);

        //cd: adnotacje też na zasadzie refleksji
    }

}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHelloTo(String otherName) {
        System.out.println("Cześć, jestem "  + name + " co słychać " + otherName + " ?");
    }

    public void sayHelloTo() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
