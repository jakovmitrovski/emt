package mk.ukim.finki.emt.eshop.repository;

import mk.ukim.finki.emt.eshop.model.tryouts.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Long> {
}
