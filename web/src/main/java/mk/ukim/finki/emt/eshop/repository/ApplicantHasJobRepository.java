package mk.ukim.finki.emt.eshop.repository;

import mk.ukim.finki.emt.eshop.model.idclass.ApplicantHasJobId;
import mk.ukim.finki.emt.eshop.model.tryouts.ApplicantHasJob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantHasJobRepository extends JpaRepository<ApplicantHasJob, ApplicantHasJobId> {
}
