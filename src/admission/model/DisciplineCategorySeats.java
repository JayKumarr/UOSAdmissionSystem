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
import javax.persistence.Transient;

/**
 * DisciplineCategorySeats generated by hbm2java
 */
@Entity
@Table(name = "discipline_category_seats"
)
public class DisciplineCategorySeats implements java.io.Serializable, Cloneable {

    private Integer admissionSessionId;
    private Integer cposGroupId;
    private Integer campusCategoryId;

    private Integer disciplineCategorySeatsId;
    private AdmissionSession admissionSession;
    private CampusCategory campusCategory;
    private CposGroup cposGroup;
    private Integer numberOfSeats;
    private String remarks;

    public DisciplineCategorySeats() {
    }

    public DisciplineCategorySeats(AdmissionSession admissionSession, CampusCategory campusCategory, CposGroup cposGroup) {
        this.admissionSession = admissionSession;
        this.campusCategory = campusCategory;
        this.cposGroup = cposGroup;
    }

    public DisciplineCategorySeats(AdmissionSession admissionSession, CampusCategory campusCategory, CposGroup cposGroup, Integer numberOfSeats, String remarks) {
        this.admissionSession = admissionSession;
        this.campusCategory = campusCategory;
        this.cposGroup = cposGroup;
        this.numberOfSeats = numberOfSeats;
        this.remarks = remarks;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "discipline_category_seats_id", unique = true, nullable = false)
    public Integer getDisciplineCategorySeatsId() {
        return this.disciplineCategorySeatsId;
    }

    public void setDisciplineCategorySeatsId(Integer disciplineCategorySeatsId) {
        this.disciplineCategorySeatsId = disciplineCategorySeatsId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "admission_session_id", nullable = false)
    public AdmissionSession getAdmissionSession() {
        return this.admissionSession;
    }

    public void setAdmissionSession(AdmissionSession admissionSession) {
        this.admissionSession = admissionSession;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "campus_category_id", nullable = false)
    public CampusCategory getCampusCategory() {
        return this.campusCategory;
    }

    public void setCampusCategory(CampusCategory campusCategory) {
        this.campusCategory = campusCategory;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cpos_group_id", nullable = false)
    public CposGroup getCposGroup() {
        return this.cposGroup;
    }

    public void setCposGroup(CposGroup cposGroup) {
        this.cposGroup = cposGroup;
    }

    @Column(name = "number_of_seats")
    public Integer getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Column(name = "remarks", length = 45)
    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setAdmissionSessionId(Integer admissionSessionId) {
        this.admissionSessionId = admissionSessionId;
    }

    public void setCampusCategoryId(Integer campusCategoryId) {
        this.campusCategoryId = campusCategoryId;
    }

    public void setCposGroupId(Integer cposGroupId) {
        this.cposGroupId = cposGroupId;
    }

    @Transient
    public Integer getAdmissionSessionId() {
        return admissionSessionId;
    }

    @Transient
    public Integer getCampusCategoryId() {
        return campusCategoryId;
    }

    @Transient
    public Integer getCposGroupId() {
        return cposGroupId;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
