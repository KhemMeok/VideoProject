package khem.dto;

import java.util.List;

import lombok.Data;

@Data
public class PageDTO {
    private List<?> list;
    private PaginationDTO pagination;
}
