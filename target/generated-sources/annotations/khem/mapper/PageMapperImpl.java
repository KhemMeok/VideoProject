package khem.mapper;

import javax.annotation.processing.Generated;
import khem.dto.PageDTO;
import khem.dto.PaginationDTO;
import org.springframework.data.domain.Page;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-04T20:47:01+0700",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.34.0.v20230511-1142, environment: Java 17.0.7 (Eclipse Adoptium)"
)
public class PageMapperImpl implements PageMapper {

    @Override
    public PageDTO toDTO(Page<?> page) {
        if ( page == null ) {
            return null;
        }

        PageDTO pageDTO = new PageDTO();

        pageDTO.setPagination( toPaginationDTO(page) );
        pageDTO.setList( page.getContent() );

        return pageDTO;
    }

    @Override
    public PaginationDTO toPaginationDTO(Page<?> page) {
        if ( page == null ) {
            return null;
        }

        PaginationDTO.PaginationDTOBuilder paginationDTO = PaginationDTO.builder();

        paginationDTO.empty( page.isEmpty() );
        paginationDTO.first( page.isFirst() );
        paginationDTO.last( page.isLast() );
        paginationDTO.number( page.getNumber() );
        paginationDTO.size( page.getSize() );
        paginationDTO.totalElements( page.getTotalElements() );
        paginationDTO.totalPages( page.getTotalPages() );

        return paginationDTO.build();
    }
}
