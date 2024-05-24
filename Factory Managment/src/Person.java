public class Person {

    private String name;
    private int age;
    private String email;
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    private int getAge() {
        return age;
    }

    private String getEmail() {
        return email;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setEmail(String email) {
        this.email = email;
    }
}
