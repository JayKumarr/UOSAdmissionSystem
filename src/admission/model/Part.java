package admission.model;
// Generated Jun 30, 2014 5:25:15 PM by Hibernate Tools 3.6.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Part generated by hbm2java
 */
@Entity
@Table(name = "part"
)
public class Part implements java.io.Serializable {

    private Integer partId;
    private ProgramType programType;
    private String name;
    private Integer partNo;
    private String remarks;

    public Part() {
    }

    public Part(ProgramType programType) {
        this.programType = programType;
    }

    public Part(ProgramType programType, String name, Integer partNo, String remarks) {
        this.programType = programType;
        this.name = name;
        this.partNo = partNo;
        this.remarks = remarks;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "part_id", unique = true, nullable = false)
    public Integer getPartId() {
        return this.partId;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "program_type_id", nullable = false)
    public ProgramType getProgramType() {
        return this.programType;
    }

    public void setProgramType(ProgramType programType) {
        this.programType = programType;
    }

    @Column(name = "name", length = 45)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "part_no")
    public Integer getPartNo() {
        return this.partNo;
    }

    public void setPartNo(Integer partNo) {
        this.partNo = partNo;
    }

    @Column(name = "remarks", length = 45)
    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "part")
//    public Set<PartRegistry> getPartRegistries() {
//        return this.partRegistries;
//    }
//
//    public void setPartRegistries(Set<PartRegistry> partRegistries) {
//        this.partRegistries = partRegistries;
//    }

    @Override
    public String toString() {
        return name;
    }

    
}
