package in.pravakar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="book_tbl")
public class BookEntity {
	@Id
	@Column(name="book_id")
	private Integer bId;
	@Column(name="book_name")
	private String bName;
	@Column(name="book_price")
	private String bPrice;
}
