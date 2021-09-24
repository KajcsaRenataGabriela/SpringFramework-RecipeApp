package guru.springframework.springrecipeapp.controllers;

import guru.springframework.springrecipeapp.domain.Category;
import guru.springframework.springrecipeapp.domain.UnitOfMeasurement;
import guru.springframework.springrecipeapp.repositories.CategoryRepository;
import guru.springframework.springrecipeapp.repositories.UnitOfMeasurementRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasurementRepository unitOfMeasurementRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasurementRepository unitOfMeasurementRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasurementRepository = unitOfMeasurementRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasurement> unitOfMeasureOptional = unitOfMeasurementRepository.findByDescription("Teaspoon");

//        System.out.println("Cat Id is: " + categoryOptional.get().getId());
//        System.out.println("UOM ID is: " + unitOfMeasureOptional.get().getId());

        return "index";
    }
}