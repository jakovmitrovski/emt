package mk.ukim.finki.emt.eshop.repository;

import mk.ukim.finki.emt.eshop.model.tryouts.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
}
