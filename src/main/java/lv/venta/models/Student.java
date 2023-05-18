package lv.venta.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name = "student_table")
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Student {
	@Setter(value = AccessLevel.NONE)
	@Column(name = "Ids")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ids;
	
	@Column(name = "Name")
	@NotNull
	@Pattern(regexp = "[A-ZĒŪĪĻĶŠĀŽČŅ]{1}[a-zēūīļķšāžčņ\\ ]+", message = "Pirmajam burtam jābūt lielajam")
	@Size(min = 3, max = 15)
	private String name;
	
	@NotNull
	@Size(min = 3, max = 15)
	@Pattern(regexp = "[A-ZĒŪĪĻĶŠĀŽČŅ]{1}[a-zēūīļķšāžčņ\\ ]+", message = "Pirmajam burtam jābūt lielajam")
	@Column(name = "Surname")
	private String surname;

	public Student( String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	
}
