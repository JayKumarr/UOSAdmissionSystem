package admission.model;
// Generated Jun 30, 2014 5:25:15 PM by Hibernate Tools 3.6.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Jurisdiction generated by hbm2java
 */
@Entity
@Table(name = "jurisdiction"
)
public class Jurisdiction implements java.io.Serializable {

    private Integer districtId;
    private Integer campusId;
    private Integer talukaId;

    private Integer jurisdictionId;
    private Taluka taluka;
    private District district;
    private Campus campus;
    private Boolean isJurisdiction;
    private String remarks;
    private Set<DistrictSeatDistribution> districtSeatDistributions = new HashSet<DistrictSeatDistribution>(0);

    public Jurisdiction() {
    }

    public Jurisdiction(District district, Campus campus) {
        this.district = district;
        this.campus = campus;
    }

    public Jurisdiction(Taluka taluka, District district, Campus campus, Boolean isJurisdiction, String remarks, Set<DistrictSeatDistribution> districtSeatDistributions) {
        this.taluka = taluka;
        this.district = district;
        this.campus = campus;
        this.isJurisdiction = isJurisdiction;
        this.remarks = remarks;
        this.districtSeatDistributions = districtSeatDistributions;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "jurisdiction_id", unique = true, nullable = false)
    public Integer getJurisdictionId() {
        return this.jurisdictionId;
    }

    public void setJurisdictionId(Integer jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "taluka_id")
    public Taluka getTaluka() {
        return this.taluka;
    }

    public void setTaluka(Taluka taluka) {
        this.taluka = taluka;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "district_id", nullable = false)
    public District getDistrict() {
        return this.district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "campus_id", nullable = false)
    public Campus getCampus() {
        return this.campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    @Column(name = "is_jurisdiction")
    public Boolean getIsJurisdiction() {
        return this.isJurisdiction;
    }

    public void setIsJurisdiction(Boolean isJurisdiction) {
        this.isJurisdiction = isJurisdiction;
    }

    @Column(name = "remarks", length = 45)
    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "jurisdiction")
    public Set<DistrictSeatDistribution> getDistrictSeatDistributions() {
        return this.districtSeatDistributions;
    }

    public void setDistrictSeatDistributions(Set<DistrictSeatDistribution> districtSeatDistributions) {
        this.districtSeatDistributions = districtSeatDistributions;
    }

    @Transient
    public Integer getCampusId() {
        return campusId;
    }

    public void setCampusId(Integer campusId) {
        this.campusId = campusId;
    }

    @Transient
    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    @Transient
    public Integer getTalukaId() {
        return talukaId;
    }

    public void setTalukaId(Integer talukaId) {
        this.talukaId = talukaId;
    }

    @Override
    public String toString() {
        return this.getTaluka() == null ? this.getDistrict().getName() : this.getTaluka().getName();
    }

}
