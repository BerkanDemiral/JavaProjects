package kodlamaio.northwind.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="categories")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","products"}) // olur da sonsuz döngüye girip fazla sorgu getirirse onu durdurmasını söyleyen kod bloğu
public class Category {
	@Id
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="category_name")
	private String categoryName;
	
	@OneToMany(mappedBy = "category") // bu ana tablo ve ana tablo üzerinden gitmeliyiz -- ( products mappedBy(ilişkilendirlilsin) product'daki category sütunu ile)
	private List<Product> products; // product(one) -> categories(many) = onteToMany
}





