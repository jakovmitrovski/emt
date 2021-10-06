package mk.ukim.finki.emt.eshop.model.tryouts;

import mk.ukim.finki.emt.eshop.model.enumerations.Status;
import mk.ukim.finki.emt.eshop.model.idclass.ApplicantHasJobId;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "applicant_has_job")
@IdClass(ApplicantHasJobId.class)
public class ApplicantHasJob {

    public ApplicantHasJob() {
    }

    public ApplicantHasJob(Applicant applicant, Job job, Status status) {
        this.applicant = applicant;
        this.job = job;
        this.status = status;
    }

    @Id
    @ManyToOne
    @JoinColumn(name = "applicant_id", referencedColumnName = "id")
    private Applicant applicant;

    @Id
    @ManyToOne
    @JoinColumn(name = "job_id", referencedColumnName = "id")
    private Job job;

    @Enumerated(value = EnumType.STRING)
    private Status status;

    @CreationTimestamp
    private LocalDateTime createdAt;

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
