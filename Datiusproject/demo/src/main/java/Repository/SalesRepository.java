package Repository;

import Entity.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Equipment,Long> {

}
