/**
 * 
 */
package net.paragon.pmsp.repository;

import org.springframework.stereotype.Repository;

import net.paragon.pmsp.domain.entity.Pond;
import net.paragon.pmsp.framework.repository.CodeBaseRepository;

/**
 * @author bqduc
 *
 */
@Repository
public interface PondRepository extends CodeBaseRepository<Pond, Long> {
}
