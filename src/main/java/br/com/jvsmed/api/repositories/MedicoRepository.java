package br.com.jvsmed.api.repositories;

import br.com.jvsmed.api.entities.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

//    Page<Medico> findAllByAtivoTrue(Pageable paginacao);
}
