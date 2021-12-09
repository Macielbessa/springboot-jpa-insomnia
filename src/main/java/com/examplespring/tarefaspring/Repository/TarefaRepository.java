package com.examplespring.tarefaspring.Repository;

import com.examplespring.tarefaspring.Models.TarefaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<TarefaModel, Long> {

}
