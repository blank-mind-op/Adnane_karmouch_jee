package ma.xproce.gestionconference.dao.repositories;

import ma.xproce.gestionconference.dao.entities.Invite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InviteRepository extends JpaRepository<Invite,Integer> {
}
