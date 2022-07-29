package by.kashliak.demo.controller;

import by.kashliak.demo.entity.Pet;
import by.kashliak.demo.petDAO.PetDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("petstore")
public class PetController {

    @Autowired
    PetDAO petDAO;

    @GetMapping
    public List<Pet> petList(){
        return petDAO.getPetCollection() ;
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<String> addPet(Pet pet){
       petDAO.savePetToPetCollection(pet);
        return new ResponseEntity<String>("Created", HttpStatus.CREATED);
    }
}
