class Student {
    private int id;
    private String name;
    private double cgpa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(101);
        s.setName("Kobir");
        s.setCgpa(3.5);
        s.setCgpa(4.5);

        System.out.println(s.getId());
        System.out.println(s.getName());
        System.out.println(s.getCgpa());
    }
}

