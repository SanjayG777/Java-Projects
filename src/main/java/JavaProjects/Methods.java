package src.main.java.JavaProjects;

public class Methods {

    public String learnMethod(String name) {
        System.out.println("I am " + name);
        return name;

    }

    public static void main(String[] args) {
        Methods m = new Methods();
        m.learnMethod("Sanjay");

    }

}

