package homework_nr_7;

public class test {
    public static void main(String[] args) {
        Student student = new Student("Max", "str. Pushkina 13","developer", 23,34.55);
        Staff staff = new Staff("Misha", "str. SomeStreet", "school", 12334);
        System.out.println(student);
        System.out.println(staff);
    }
}
