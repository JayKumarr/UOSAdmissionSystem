package admission.model;
// Generated Jun 30, 2014 5:25:15 PM by Hibernate Tools 3.6.0

import admission.enums.AreaEnum;
import admission.enums.GenderEnum;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Candidate generated by hbm2java
 */
@Entity
@Table(name = "candidate"
)
public class Candidate implements java.io.Serializable {

    private Integer candidateId;
    private Test test;
    private Country country;
    private Religion religion;
    private District district;
    private ProgramType programType;
    private AdmissionYear admissionYear;
    private BankBranch bankBranch;
    private int seatNo;
    private Integer formSno;
    private String cnicNo;
    private String cnicOf;
    private String name;
    private String fathersName;
    private String surname;
    private GenderEnum gender;
    private AreaEnum area;
    private Date dateOfBirth;
    private String placeOfBirth;
    private String permanentHomeAddress;
    private String presentPostelAddress;
    private String guardiansName;
    private String relationship;
    private String guardiansAddress;
    private String fathersOccupation;
    private String telephone;
    private String mobile;
    private String email;
    private Integer chalanFee;
    private Date chalanDate;
    private Integer yearsDegree;
    private String remarks;
    private Integer testScore;
    private Float percentage;
    private Integer deductionMarks;
    private Boolean isObjection;
    private String objectionRemarks;
    private String imagePath;

//    private Set<AdmissionListDetails> admissionListDetailses = new HashSet<AdmissionListDetails>(0);
//    private Set<AppliedCategory> appliedCategories = new HashSet<AppliedCategory>(0);
//    private Set<Accounts> accounts = new HashSet<Accounts>(0);
//    private Set<OtherTest> otherTests = new HashSet<OtherTest>(0);
//    private Set<CandidateProgramOfStudy> candidateProgramOfStudies = new HashSet<CandidateProgramOfStudy>(0);
//    private Set<AppliedCampus> appliedCampuses = new HashSet<AppliedCampus>(0);
//    private Set<CredentialDetails> credentialDetailses = new HashSet<CredentialDetails>(0);
//    private Set<ForeignCandidate> foreignCandidates = new HashSet<ForeignCandidate>(0);

    public Candidate() {
    }

    public Candidate(Country country, Religion religion, ProgramType programType, AdmissionYear admissionYear, int seatNo, int deductionMarks) {
        this.country = country;
        this.religion = religion;
        this.programType = programType;
        this.admissionYear = admissionYear;
        this.seatNo = seatNo;
        this.deductionMarks = deductionMarks;
    }

    public Candidate(Test test, Country country, Religion religion, District district, ProgramType programType, AdmissionYear admissionYear, int seatNo, Integer formSno, String cnicNo, String cnicOf, String name, String fathersName, String surname, GenderEnum gender, AreaEnum area, Date dateOfBirth, String placeOfBirth, String permanentHomeAddress, String presentPostelAddress, String guardiansName, String relationship, String guardiansAddress, String fathersOccupation, String telephone, String mobile, String email, Integer chalanFee, Date chalanDate, Integer yearsDegree, String remarks, Integer testScore, Float percentage, Integer deductionMarks, Boolean isObjection, String objectionRemarks, String imagePath
    /*, Set<AdmissionListDetails> admissionListDetailses, Set<AppliedCategory> appliedCategories, Set<Accounts> accounts, Set<OtherTest> otherTests, Set<CandidateProgramOfStudy> candidateProgramOfStudies, Set<AppliedCampus> appliedCampuses, Set<CredentialDetails> credentialDetailses, Set<ForeignCandidate> foreignCandidates*/) {
        this.test = test;
        this.country = country;
        this.religion = religion;
        this.district = district;
        this.programType = programType;
        this.admissionYear = admissionYear;
        this.seatNo = seatNo;
        this.formSno = formSno;
        this.cnicNo = cnicNo;
        this.cnicOf = cnicOf;
        this.name = name;
        this.fathersName = fathersName;
        this.surname = surname;
        this.gender = gender;
        this.area = area;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.permanentHomeAddress = permanentHomeAddress;
        this.presentPostelAddress = presentPostelAddress;
        this.guardiansName = guardiansName;
        this.relationship = relationship;
        this.guardiansAddress = guardiansAddress;
        this.fathersOccupation = fathersOccupation;
        this.telephone = telephone;
        this.mobile = mobile;
        this.email = email;
        this.chalanFee = chalanFee;
        this.chalanDate = chalanDate;
        this.yearsDegree = yearsDegree;
        this.remarks = remarks;
        this.testScore = testScore;
        this.percentage = percentage;
        this.deductionMarks = deductionMarks;
        this.isObjection = isObjection;
        this.objectionRemarks = objectionRemarks;
        this.imagePath = imagePath;
//        this.admissionListDetailses = admissionListDetailses;
//        this.appliedCategories = appliedCategories;
//        this.accounts = accounts;
//        this.otherTests = otherTests;
//        this.candidateProgramOfStudies = candidateProgramOfStudies;
//        this.appliedCampuses = appliedCampuses;
//        this.credentialDetailses = credentialDetailses;
//        this.foreignCandidates = foreignCandidates;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "candidate_id", unique = true, nullable = false)
    public Integer getCandidateId() {
        return this.candidateId;
    }

    public void setCandidateId(Integer candidateId) {
        this.candidateId = candidateId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "test_id")
    public Test getTest() {
        return this.test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", nullable = false)
    public Country getCountry() {
        return this.country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "religion_id", nullable = false)
    public Religion getReligion() {
        return this.religion;
    }

    public void setReligion(Religion religion) {
        this.religion = religion;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "district_id")
    public District getDistrict() {
        return this.district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "program_type_id", nullable = false)
    public ProgramType getProgramType() {
        return this.programType;
    }

    public void setProgramType(ProgramType programType) {
        this.programType = programType;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bank_branch_id")
    public BankBranch getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(BankBranch bankBranch) {
        this.bankBranch = bankBranch;
    }

    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "admission_year_id", nullable = false)
    public AdmissionYear getAdmissionYear() {
        return this.admissionYear;
    }

    public void setAdmissionYear(AdmissionYear admissionYear) {
        this.admissionYear = admissionYear;
    }

    @Column(name = "seat_no", nullable = false)
    public int getSeatNo() {
        return this.seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    @Column(name = "form_sno")
    public Integer getFormSno() {
        return this.formSno;
    }

    public void setFormSno(Integer formSno) {
        this.formSno = formSno;
    }

    @Column(name = "cnic_no", length = 15)
    public String getCnicNo() {
        return this.cnicNo;
    }

    public void setCnicNo(String cnicNo) {
        this.cnicNo = cnicNo;
    }

    @Column(name = "cnic_of", length = 1)
    public String getCnicOf() {
        return this.cnicOf;
    }

    public void setCnicOf(String cnicOf) {
        this.cnicOf = cnicOf;
    }

    @Column(name = "name", length = 45)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "fathers_name", length = 45)
    public String getFathersName() {
        return this.fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    @Column(name = "surname", length = 45)
    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Column(name = "gender", length = 1)
    @Enumerated
    public GenderEnum getGender() {
        return this.gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    @Column(name = "area", length = 1)
    @Enumerated
    public AreaEnum getArea() {
        return this.area;
    }

    public void setArea(AreaEnum area) {
        this.area = area;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "date_of_birth", length = 10)
    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Column(name = "place_of_birth", length = 45)
    public String getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    @Column(name = "permanent_home_address", length = 65535)
    public String getPermanentHomeAddress() {
        return this.permanentHomeAddress;
    }

    public void setPermanentHomeAddress(String permanentHomeAddress) {
        this.permanentHomeAddress = permanentHomeAddress;
    }

    @Column(name = "present_postel_address", length = 65535)
    public String getPresentPostelAddress() {
        return this.presentPostelAddress;
    }

    public void setPresentPostelAddress(String presentPostelAddress) {
        this.presentPostelAddress = presentPostelAddress;
    }

    @Column(name = "guardians_name", length = 45)
    public String getGuardiansName() {
        return this.guardiansName;
    }

    public void setGuardiansName(String guardiansName) {
        this.guardiansName = guardiansName;
    }

    @Column(name = "relationship", length = 20)
    public String getRelationship() {
        return this.relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    @Column(name = "guardians_address", length = 65535)
    public String getGuardiansAddress() {
        return this.guardiansAddress;
    }

    public void setGuardiansAddress(String guardiansAddress) {
        this.guardiansAddress = guardiansAddress;
    }

    @Column(name = "fathers_occupation", length = 45)
    public String getFathersOccupation() {
        return this.fathersOccupation;
    }

    public void setFathersOccupation(String fathersOccupation) {
        this.fathersOccupation = fathersOccupation;
    }

    @Column(name = "telephone", length = 45)
    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Column(name = "mobile", length = 45)
    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Column(name = "email", length = 100)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "chalan_fee")
    public Integer getChalanFee() {
        return this.chalanFee;
    }

    public void setChalanFee(Integer chalanFee) {
        this.chalanFee = chalanFee;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "chalan_date", length = 10)
    public Date getChalanDate() {
        return this.chalanDate;
    }

    public void setChalanDate(Date chalanDate) {
        this.chalanDate = chalanDate;
    }

    @Column(name = "years_degree")
    public Integer getYearsDegree() {
        return this.yearsDegree;
    }

    public void setYearsDegree(Integer yearsDegree) {
        this.yearsDegree = yearsDegree;
    }

    @Column(name = "remarks", length = 45)
    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Column(name = "test_score")
    public Integer getTestScore() {
        return this.testScore;
    }

    public void setTestScore(Integer testScore) {
        this.testScore = testScore;
    }

    @Column(name = "percentage", precision = 12, scale = 0)
    public Float getPercentage() {
        return this.percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }

    @Column(name = "deduction_marks", nullable = false)
    public int getDeductionMarks() {
        return this.deductionMarks;
    }

    public void setDeductionMarks(int deductionMarks) {
        this.deductionMarks = deductionMarks;
    }

    @Column(name = "is_objection")
    public Boolean getIsObjection() {
        return this.isObjection;
    }

    public void setIsObjection(Boolean isObjection) {
        this.isObjection = isObjection;
    }

    @Column(name = "objection_remarks", length = 256)
    public String getObjectionRemarks() {
        return this.objectionRemarks;
    }

    public void setObjectionRemarks(String objectionRemarks) {
        this.objectionRemarks = objectionRemarks;
    }

    @Column(name = "image_path", length = 45)
    public String getImagePath() {
        return this.imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "candidate")
////    @OrderBy("admissionList.listNo DESC")
//    public Set<AdmissionListDetails> getAdmissionListDetailses() {
//        return this.admissionListDetailses;
//    }
//
//    public void setAdmissionListDetailses(Set<AdmissionListDetails> admissionListDetailses) {
//        this.admissionListDetailses = admissionListDetailses;
//    }
//
//    @OneToMany(orphanRemoval = true, fetch = FetchType.LAZY, mappedBy = "candidate")
//    public Set<AppliedCategory> getAppliedCategories() {
//        return this.appliedCategories;
//    }
//
//    public void setAppliedCategories(Set<AppliedCategory> appliedCategories) {
//        this.appliedCategories = appliedCategories;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "candidate")
//    public Set<Accounts> getAccounts() {
//        return this.accounts;
//    }
//
//    public void setAccounts(Set<Accounts> accounts) {
//        this.accounts = accounts;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "candidate")
//    public Set<OtherTest> getOtherTests() {
//        return this.otherTests;
//    }
//
//    public void setOtherTests(Set<OtherTest> otherTests) {
//        this.otherTests = otherTests;
//    }
//
//    @OneToMany(orphanRemoval = true, fetch = FetchType.LAZY, mappedBy = "candidate")
//    public Set<CandidateProgramOfStudy> getCandidateProgramOfStudies() {
//        return this.candidateProgramOfStudies;
//    }
//
//    public void setCandidateProgramOfStudies(Set<CandidateProgramOfStudy> candidateProgramOfStudies) {
//        this.candidateProgramOfStudies = candidateProgramOfStudies;
//    }
//
//    @OneToMany(orphanRemoval = true, fetch = FetchType.LAZY, mappedBy = "candidate")
//    public Set<AppliedCampus> getAppliedCampuses() {
//        return this.appliedCampuses;
//    }
//
//    public void setAppliedCampuses(Set<AppliedCampus> appliedCampuses) {
//        this.appliedCampuses = appliedCampuses;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "candidate")
//    @OrderBy("detail_of")
//    public Set<CredentialDetails> getCredentialDetailses() {
//        return this.credentialDetailses;
//    }
//
//    public void setCredentialDetailses(Set<CredentialDetails> credentialDetailses) {
//        this.credentialDetailses = credentialDetailses;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "candidate")
//    public Set<ForeignCandidate> getForeignCandidates() {
//        return this.foreignCandidates;
//    }
//
//    public void setForeignCandidates(Set<ForeignCandidate> foreignCandidates) {
//        this.foreignCandidates = foreignCandidates;
//    }

//    public void calculatePercentage(){
//        if(this.getForeignCandidates() != null){
//            return;
//        }
//        if(this.getTest() == null || this.getTestScore() == null) return;
//        
////        CredentialDetails matric = (CredentialDetails) this.getCredentialDetailses().toArray()[0];
////        CredentialDetails inter = (CredentialDetails) this.getCredentialDetailses().toArray()[1];
////        Float matricPer = matric.getMarksObtained() / matric.getTotalMarks() * 100.0F;
////        Float interPer = inter.getMarksObtained() / inter.getTotalMarks() * 100.0F;
////        
////        if(Coder.Decoder.booleanDecode(this.getProgramType().getIsBachelor())){
////            Float finalPer = matricPer * Constant.MATRIC_PER + interPer * Constant.INTER_PER + this.getTestScore() * Constant.TEST_PER;
////            this.setPercentage(finalPer);
////        }else{
////            CredentialDetails degree = (CredentialDetails) this.getCredentialDetailses().toArray()[3];
////            
////            Float degreePer = degree.getMarksObtained() / degree.getTotalMarks() * 100.0F;
////            Float finalPer = matricPer * Constant.MATRIC_PER + interPer * Constant.M_INTER_PER + degreePer * Constant.DEGREE_PER + this.getTestScore() * Constant.TEST_PER;
////            this.setPercentage(finalPer);
////        }
//        this.setPercentage(Sorter.getPercentage(this));
//    }
    @Override
    public String toString() {
//        calculatePercentage();
        return String.valueOf(this.getPercentage());
    }

}
