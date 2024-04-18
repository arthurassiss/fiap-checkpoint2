package br.com.fiap.checkpoint2.model;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "pacientes")
public class Paciente extends AbstractEntity<Long> {
	
	@Column(nullable = false, length = 50)
	private String nome;
	
	@Column(nullable = false, length = 50)
	private String endereco;
	
	@Column(nullable = false, length = 50)
	private String bairro;
	
	@Column(nullable = false, length = 50)
	private String email;
	
	@Column(nullable = false, length = 50)
	private String telefone_completo;
	
	@Column(nullable = false)
	@CreationTimestamp
	private Timestamp created_at;
	
	@Column(nullable = false)
	@CreationTimestamp
	private Timestamp updated_at;
	
}
