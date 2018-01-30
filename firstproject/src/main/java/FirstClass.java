public class FirstClass {

    private int i = 1;
    private String name = "Student";
    String defaultValue = "";

    public String getName() {
        return name;
    }

    //MAC cmd + N

    public void  setName(String name) {
        this.name = name;
    }

    //camelCase for variables

    public static void main(String[] args) {
        new FirstClass();
    }

    //constructor
    public FirstClass() {

    }

    public FirstClass(String name) {
        setName(name);
    }

    //this CamelCase for Classes a

    /**
     * This method just runs
     *
     * @param args - description
     */

    // static - одна для всего класса
    // final - нельзя переопределить значение этой переменной


}
