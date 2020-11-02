package review.adapter.studentlistview;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String id;
    private String program;
    private int term;

    public Student(String name, String id, String program, int term) {
        this.name = name;
        this.id = id;
        this.program = program;
        this.term = term;
    }

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

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
}
