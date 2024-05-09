package com.trilharapp.projeto_trilhar_back_end.model;

import java.sql.Date;

import org.springframework.lang.NonNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskConta {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_conta") 
private Long idConta;
    
@Column(name = "descricao")     
private String descricao;

@Column(name = "despesas")  
private double despesas;

@Column(name = "vencimento")  
private Date vencimento;
}