package S2023428;

import java.util.*;

class Student
{
    private int id;
    private String name;
    public Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return id+":"+name;
    }
    public int hashCode()
    {
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + name.hashCode();
        return result;
    }


    public boolean equals(Object obj)
    {
        if(this==obj){
            return true;
        }
        if(!(obj instanceof Student))
        {
            return false;
        }
        Student stu = (Student) obj;
        return this.id == stu.id;
    }
}

public class Case1 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        Student stu1 = new Student(1,"张三");
        Student stu2 = new Student(2,"王五");
        Student stu3 = new Student(2,"王五");
        hs.add(stu1);
        hs.add(stu2);
        hs.add(stu3);
        System.out.println(hs);
    }
}
