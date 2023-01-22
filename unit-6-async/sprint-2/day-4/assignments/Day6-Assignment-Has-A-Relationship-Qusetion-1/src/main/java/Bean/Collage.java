package Bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Collage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int collageId;
    private String collageName;
    private String collageAddress;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "collage")
    private List<Student> studentList=new ArrayList<>();

    public Collage() {
    }

    public Collage(int collageId, String collageName, String collageAddress, List<Student> studentList) {
        this.collageId = collageId;
        this.collageName = collageName;
        this.collageAddress = collageAddress;
        this.studentList = studentList;
    }

    public int getCollageId() {
        return collageId;
    }

    public void setCollageId(int collageId) {
        this.collageId = collageId;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    public String getCollageAddress() {
        return collageAddress;
    }

    public void setCollageAddress(String collageAddress) {
        this.collageAddress = collageAddress;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Collage{" +
                "collageId=" + collageId +
                ", collageName='" + collageName + '\'' +
                ", collageAddress='" + collageAddress + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
