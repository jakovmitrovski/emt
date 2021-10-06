package mk.ukim.finki.emt.eshop.model.tryouts;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Applicant {

    public Applicant() {
    }

    public Applicant(Long id, String shortDescription, String cv) {
        this.id = id;
        this.shortDescription = shortDescription;
        this.cv = cv;
        this.appliedJobs = new ArrayList<>();
    }

    @Id
    private Long id;

    @Column(length = 10000)
    private String shortDescription;

    private String cv;


    @OneToMany(mappedBy = "applicant", fetch = FetchType.EAGER)
    private List<ApplicantHasJob> appliedJobs;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public List<ApplicantHasJob> getAppliedJobs() {
        return appliedJobs;
    }

    public void setAppliedJobs(List<ApplicantHasJob> appliedJobs) {
        this.appliedJobs = appliedJobs;
    }
}
