package by.kashliak.demo.petDAO;

import by.kashliak.demo.entity.Pet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class PetDAO {
    List<Pet> petCollection;
    {
        petCollection = new ArrayList<>();
    }

    public PetDAO() {
    }

    public List<Pet> getPetCollection(){
        return petCollection;

    }

    public void savePetToPetCollection(Pet pet){
        petCollection.add(pet);
    }
}
