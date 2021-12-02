package dem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dem.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
