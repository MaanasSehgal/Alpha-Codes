public class constructerTut {

    public static void main(String[] args) {
        Student s1 = new Student("Maanas", 2305547);
        System.out.println(s1.name);
        System.out.println(s1.rollno);

    }
}

class Student {

    String name;    
    int rollno;

    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
}
