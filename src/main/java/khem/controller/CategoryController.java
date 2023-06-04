package khem.controller;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import khem.dto.CategoryDTO;
import khem.dto.PageDTO;
import khem.exceptionHandle.ApiException;
import khem.mapper.CategoryMapper;
import khem.mapper.PageMapper;
import khem.model.CategoryModel;
import khem.service.CategoryService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;
    
    @PostMapping
    public ResponseEntity<?> add(@RequestBody CategoryModel entity) throws ApiException{
        return ResponseEntity.ok(categoryService.save(entity));
    }

    @GetMapping("{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long id) throws ApiException{

        return ResponseEntity.ok(categoryService.getById(id));
    }

    @PutMapping("{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,@RequestBody CategoryDTO entity) throws ApiException{
        CategoryModel categoryModel = CategoryMapper.INSTANCE.toEntity(entity);
        return ResponseEntity.ok().body(categoryService.Update(id, categoryModel));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Long id) throws ApiException{
        categoryService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<?> getAll(){
        List<CategoryDTO> categoryList = categoryService
                                        .findAll()
                                        .stream()
                                        .map(CategoryMapper.INSTANCE::toDTO)
                                        .toList();
        return ResponseEntity.ok().body(categoryList);
    }

    @GetMapping("/page")
    public ResponseEntity<?> getCategoryPage(@RequestParam Map<String,String> param){
        Page<CategoryModel> page = categoryService.getCategoryPage(param);
        PageDTO pageDTO = PageMapper.INSTANCE.toDTO(page);
        pageDTO.setList(page.get().map(CategoryMapper.INSTANCE::toDTO).toList());
        return ResponseEntity.ok().body(pageDTO);
    }
}
