package reflection;

import java.util.Arrays;

/**
 * @author summer
 * @create 2022-08-15 15:38
 * @Description  获取 class 方法练习
 */
public class Test01 {

    public static void main(String[] args) throws ClassNotFoundException {

        // Persoon
        Person person = new Person();
        System.out.println(person.name);

        // Student
        Student student = new Student();
        System.out.println(student.name);
        System.out.println(student.hashCode());

        // 通过全路径类名称获取类
        // Class<?> aClass = Class.forName("reflection.Student");
        Class c1 = Class.forName("reflection.Student");
        System.out.println(c1.hashCode());


        // 直接通过类型获取类
        Class c2 = Student.class;
        // Class<Student> c2 = Student.class; 已经明确知道是Student类
        System.out.println(c2.hashCode());

        // 通过对象获取对应的类calss
        Class c3 = student.getClass();
        System.out.println(c3.hashCode());


        // 内置基本类型直接使用 Type 获取
        Class c4 = Integer.TYPE;
        System.out.println(c4);

        Class c5 = Long.TYPE;
        System.out.println(c5);

        Class c6 = Float.TYPE;
        System.out.println(c6);

        Class c7= Double.TYPE;
        System.out.println(c7);

        Class c8 = Boolean.TYPE;
        System.out.println(c8);

        Class c9 = Character.TYPE;
        System.out.println(c9);

    }
}


class Person{

    /**
     * 名称
     */
    public String name;

    /**
     * 年龄
     */
    public int age;

    /**
     * 昵称
     */
    public String nickName;

    /**
     * 无参构造
     */
    public Person(){}

    /**
     * 有参构造
     * @param name  名称
     * @param age   年龄
     * @param nickName  昵称
     */
    public Person(String name,int age,String nickName){
        this.name = name;
        this.age = age;
        this.nickName = nickName;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}

class Student extends Person{

    /**
     * 学号
     */
    private int studentNum;

    /**
     * 课程数组
     */
    public String[] courses;

    /**
     * 无参构造
     */
    public Student(){}

    /**
     * 全参构造
     * @param name  名称
     * @param age   年龄
     * @param nickName  昵称
     * @param studentNum    学号
     * @param courses   课程数组
     */
    public Student(String name, int age, String nickName, int studentNum, String[] courses) {
        super(name, age, nickName);
        this.studentNum = studentNum;
        this.courses = courses;
    }

    /**
     * 获取学号
     * @return  学号
     */
    public int getStudentNum() {
        return studentNum;
    }

    /**
     * 设置学号
     * @param studentNum    学号
     */
    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                ", studentNum=" + studentNum +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }

}