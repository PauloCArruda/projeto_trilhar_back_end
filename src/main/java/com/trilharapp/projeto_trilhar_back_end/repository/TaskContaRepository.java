package com.trilharapp.projeto_trilhar_back_end.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.trilharapp.projeto_trilhar_back_end.model.TaskConta;

@Repository
public interface  TaskContaRepository extends JpaRepository<TaskConta, Long>{

}