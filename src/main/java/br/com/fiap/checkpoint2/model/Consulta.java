package br.com.fiap.checkpoint2.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "consultas")
public class Consulta extends AbstractEntity<Long>{
	
	@ManyToOne
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;
	
	@ManyToOne
	@JoinColumn(name = "id_profissional")
	private Profissional profissional;
	
	@Column(nullable = false)
	private Timestamp data_consulta;
	
	@Enumerated(EnumType.STRING)
	private STATUS_CONSULTA status_consulta;
	
	@Column(nullable = false)
	private int quantidade_horas;
	
	@Column(nullable = false)
	private int valor_consulta;
	
}
