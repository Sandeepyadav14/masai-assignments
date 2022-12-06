package Bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int collageId;
    private String collageName;
    private String collageAddress;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "college")
    private List<Student> list = new ArrayList<>();

//    @Override
//    public String toString() {
//        return "College{" +
//                "collageId=" + collageId +
//                ", collageName='" + collageName + '\'' +
//                ", collageAddress='" + collageAddress + '\'' +
//                ", list=" + list +
//                '}';
//    }

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

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }
}
