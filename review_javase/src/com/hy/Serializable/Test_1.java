package com.hy.Serializable;

import java.io.*;

/**
 * Created by sumimasah on 2017/9/12.
 */
public class Test_1 {
    public static void main(String[] args) throws IOException {
        String path = "d:" + File.separator + "d.txt";
        File file = new File(path);
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file));

        os.writeObject(new Person("a", 1));
        os.close();


        ObjectInputStream is = new ObjectInputStream(new FileInputStream(file));
        Person person = null;
        try {
            person = (Person) is.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(person);
    }

}

class Person implements Serializable {
    public transient String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}