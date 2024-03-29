public class Student {
    private String name;
    private String id;
    private String group;
    private String email;


    //getter, setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Student class constructor.
     */
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }


    /**
     *  Student class same group.
     *
     * @param name : name of student
     * @param id : id of student
     * @param email : email of student
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    /**
     *  Student class copy.
     *
     * @param s : student copy
     */
    public Student(Student s) {
        this.name = s.getName();
        this.id = s.getId();
        this.group = s.getGroup();
        this.email = s.getEmail();

    }


    public String getInfo() {
        return this.name + " - " + this.id + " - " + this.group + " - " + this.email;
    }

    /**
     * Basic information of students.
     *
     * @param name : name of student
     * @param id : id of student
     * @param group : id of student
     * @param email : email of student
     */
    public Student(String name, String id, String group, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = group;
    }

}