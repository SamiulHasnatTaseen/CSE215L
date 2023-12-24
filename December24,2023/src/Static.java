class Department {
    private String name;
    private static int NoWorker = 0;
    private int id;
    
    //Default constructor
    public Department() {
    	this.name = "Unknown";
    }
    //Parameterized constructor
    public Department(String name, int id) {
    	this.name = name;
        this.id=id;
    	NoWorker++;
    }
    //getter
    public static int getNoWorker() {
        return NoWorker;
    }
    public String getName() {
        return name;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Department name: " + name+ " id "+ id;
    }
}

public class Static {

    public static void main(String[] args) {

        System.out.println("No of workers : " + Department.getNoWorker());
        Department D1 = new Department();
        D1.setName("BBA");
        D1.setId(31);
        System.out.println("No of workers : " + Department.getNoWorker());
        Department D2 = new Department("ECE",42);
        System.out.println("No of workers : " + Department.getNoWorker());
        System.out.println(D1.toString());
        System.out.println(D2.toString());
        
    }
}
