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
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

/**
 * CategoryType generated by hbm2java
 */
@Entity
@Table(name = "category_type"
)
public class CategoryType implements java.io.Serializable {

    private Integer categoryTypeId;
    private String name;
    private String remarks;
    private String code;
    private Set<Category> categories = new HashSet<Category>(0);

    public CategoryType() {
    }

    public CategoryType(String name, String remarks, String code, Set<Category> categories) {
        this.name = name;
        this.remarks = remarks;
        this.code = code;
        this.categories = categories;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "category_type_id", unique = true, nullable = false)
    public Integer getCategoryTypeId() {
        return this.categoryTypeId;
    }

    public void setCategoryTypeId(Integer categoryTypeId) {
        this.categoryTypeId = categoryTypeId;
    }

    @Column(name = "name", length = 45)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "remarks", length = 45)
    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Column(name = "code", length = 10)
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "categoryType")
    @OrderBy("name")
    public Set<Category> getCategories() {
        return this.categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return this.getName();
    }

}
