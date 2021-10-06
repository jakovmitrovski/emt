package mk.ukim.finki.emt.eshop.config;

import mk.ukim.finki.emt.eshop.model.enumerations.Status;
import mk.ukim.finki.emt.eshop.model.idclass.ApplicantHasJobId;
import mk.ukim.finki.emt.eshop.model.tryouts.Applicant;
import mk.ukim.finki.emt.eshop.model.tryouts.ApplicantHasJob;
import mk.ukim.finki.emt.eshop.model.tryouts.Job;
import mk.ukim.finki.emt.eshop.repository.ApplicantHasJobRepository;
import mk.ukim.finki.emt.eshop.repository.ApplicantRepository;
import mk.ukim.finki.emt.eshop.repository.JobRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class Bootstrap {

    private final JobRepository jobRepository;
    private final ApplicantRepository applicantRepository;
    private final ApplicantHasJobRepository applicantHasJobRepository;

    public Bootstrap(JobRepository jobRepository, ApplicantRepository applicantRepository, ApplicantHasJobRepository applicantHasJobRepository) {
        this.jobRepository = jobRepository;
        this.applicantRepository = applicantRepository;
        this.applicantHasJobRepository = applicantHasJobRepository;
    }

    @PostConstruct
    public void init(){


//        a.getAppliedJobs().add(new ApplicantHasJob(a, j, Status.APPLIED));
//        applicantRepository.save(a);
       // applicantHasJobRepository.save(new ApplicantHasJob(a, j, Status.APPLIED));
        //Applicant a = applicantRepository.save(new Applicant(1L, "desc", "cv"));
        //Job j = jobRepository.save(new Job("title", "location", "summary"));
        Applicant a = applicantRepository.findById(1L).get();
        Job j = jobRepository.findById(5L).get();
        //applicantRepository.save(a);
        //jobRepository.save(j);

        //ApplicantHasJob applicantHasJob = new ApplicantHasJob(a, j, Status.DENIED);
        //applicantHasJobRepository.save(applicantHasJob);
        //j.getAppliedApplicants().add(applicantHasJobRepository.findById(new ApplicantHasJobId(1L, 4L)).get());
        //a.getAppliedJobs().add(applicantHasJob);
        //jobRepository.save(j);
        //applicantRepository.save(a);
        List<ApplicantHasJob> l = a.getAppliedJobs();
        List<ApplicantHasJob> jl = j.getAppliedApplicants();

        System.out.println("here");

    }
}
