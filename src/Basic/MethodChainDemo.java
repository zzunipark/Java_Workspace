package Basic;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class MethodChainDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("kim").setAge(21).sayHello();
    }
}

class Person {
    String name;
    int age;

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public void sayHello() {
        System.out.println("name: " + name + "name" + age + "age");
    }
}
