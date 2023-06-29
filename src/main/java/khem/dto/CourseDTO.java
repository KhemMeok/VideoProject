package khem.dto;

import lombok.Data;

@Data
public class CourseDTO {
    private Long id;
    private String name;
    private Boolean active;
    private Integer categoryId;
}
