/**
 * Created by MacLap on 2/1/16.
 */
public class Person {
    public String name;
    public int age;
    public boolean isAlive = true;
    public String address;

    public Person(String name, int age){
        setName(name);
        setAge(age);
        setAlive(isAlive);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.contains(" ")) {
            this.name = name;
        }
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age >=0) {
            this.age = age;
        }
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public boolean isValidName(String name){
        return name.contains(" ");
    }
}
