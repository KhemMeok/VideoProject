package khem.Pagenation.filter;

import lombok.Data;

@Data
public class CategoryFilter {
    private Long id;
    private String name;
    private Boolean active;
}
