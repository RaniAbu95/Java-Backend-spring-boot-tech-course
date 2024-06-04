public abstract class Animal {

    private String name;
    private String color;
    private int legs;
    private int age;

    public Animal(String name, int legs) {
        this.name = name;
        this.setLegs(legs);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    private void setLegs(int legs) {
        if(legs>0) {
            this.legs = legs;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String introduce()
    {
        return "Name: "+this.name+", age:"+this.age+", color:"+this.color+", legs:"+this.legs;
    }
    public abstract void makeSound();
}
