package khem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Table(name = "category" , uniqueConstraints = {@UniqueConstraint(columnNames = {"category_name"})})
@AllArgsConstructor
@NoArgsConstructor
public class CategoryModel {
   @Id
    @GeneratedValue(generator = "category_seq_generator")
    @SequenceGenerator(name = "category_seq_generator", initialValue = 1, sequenceName = "category_seq_generator",  allocationSize = 1)
   private Long id;

   @Column(name = "category_name")
   private String name;

   @Column(name = "active")
   private Boolean active;

}
