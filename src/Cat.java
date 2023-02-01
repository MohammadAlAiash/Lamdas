public class Cat implements Printable {
    String name;
    int age;

    public Cat(){
    }

    @Override
    public String print(String suffix) {
        return  "Meow " + suffix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
