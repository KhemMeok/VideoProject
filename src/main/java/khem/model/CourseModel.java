package khem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@Entity
@Table(name = "courses", uniqueConstraints = {@UniqueConstraint(columnNames = {"course_name"})})
@Data
public class CourseModel{
    @Id
    @GeneratedValue(generator = "course_seq_generator")
    @SequenceGenerator(name = "course_seq_generator", initialValue = 1, sequenceName = "course_seq_generator",  allocationSize = 1)
    private Long id;
    
    @Column(name = "course_name")
    private  String name;

    @Column(name = "active")
    private Boolean active;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryModel category;
}