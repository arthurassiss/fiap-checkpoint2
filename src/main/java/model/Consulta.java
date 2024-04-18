package model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "consultas")
public class Consulta extends AbstractEntity<Long>{
	
	@Column(nullable = false, length = 50)
	private String nome;
	
	@Column(nullable = false, length = 50)
	private String especialidade;
	
	@Column(nullable = false)
	private BigDecimal valor_hora;
	
	@Column(nullable = false)
	@CreationTimestamp
	private Timestamp created_at;
	
	@Column(nullable = false)
	@CreationTimestamp
	private Timestamp updated_at;
	
}
