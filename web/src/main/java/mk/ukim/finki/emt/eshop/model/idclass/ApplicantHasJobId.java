package mk.ukim.finki.emt.eshop.model.idclass;

import java.io.Serializable;
import java.util.Objects;

public class ApplicantHasJobId implements Serializable {

    public ApplicantHasJobId() {
    }

    public ApplicantHasJobId(long applicant, long job) {
        this.applicant = applicant;
        this.job = job;
    }

    private long applicant;
    private long job;

    public long getApplicant() {
        return applicant;
    }

    public void setApplicant(long applicant) {
        this.applicant = applicant;
    }

    public long getJob() {
        return job;
    }

    public void setJob(long job) {
        this.job = job;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApplicantHasJobId that = (ApplicantHasJobId) o;
        return applicant == that.applicant && job == that.job;
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicant, job);
    }


}
