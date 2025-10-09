package gt.edu.umg.business.partners.service.repositories;

import gt.edu.umg.business.partners.service.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

    public List<Contact> findByBusinessPartner_Id(Integer id);

}