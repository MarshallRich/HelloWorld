//gives some basic information about characters in fiction
public class Character {
    public String name;
    public int age;
    public boolean isProtagonist;
    public boolean isHuman = true;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        if (age >= 0) {
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }

    public void setProtagonist(boolean isProtagonist){
        this.isProtagonist = isProtagonist;
    }

    public boolean checkProtagonist(){
        return isProtagonist;
    }

    public void setHuman(boolean isHuman){
        this.isHuman = isHuman;
    }

    public boolean checkHuman(){
        return isHuman;
    }
}
