package mk.ukim.finki.emt.eshop.web.controller;

import mk.ukim.finki.emt.eshop.model.tryouts.Applicant;
import mk.ukim.finki.emt.eshop.repository.ApplicantRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class ApplicantControllerRest {

    private final ApplicantRepository applicantRepository;

    public ApplicantControllerRest(ApplicantRepository applicantRepository) {
        this.applicantRepository = applicantRepository;
    }

    @GetMapping
    public List<Applicant> findAll(){
        return this.applicantRepository.findAll();
    }
}
