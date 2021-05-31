package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products") // veritabanında hangi tabloya karşılık geliyor.
@Data // getter setter metodları otomatik olarak çalışır (outline'a bakabilirsin)
@AllArgsConstructor // parametreli constructor ekledi
@NoArgsConstructor // parametresiz constructor ekledi
public class Product {

	@Id // id alanını belirttik.
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment(bir bir artırılacak) diye belirttik. --
														// Identity
	@Column(name = "product_id") // hangi sütuna karşılık geliyor.
	private int id;

	@Column(name = "category_id")
	private int categoryId;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "unit_price")
	private double unitPrice;

	@Column(name = "units_in_stock")
	private short unitsInStock;

	@Column(name = "quantity_per_unit")
	private String quantityPerUnit; // bir birimde kaç tane var(açıklama gibi bir şey)

}
