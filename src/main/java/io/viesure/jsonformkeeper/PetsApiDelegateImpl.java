package io.viesure.jsonformkeeper;

import io.viesure.jsonformkeeper.api.PetsApiDelegate;
import io.viesure.jsonformkeeper.model.Cat;
import io.viesure.jsonformkeeper.model.Dog;
import io.viesure.jsonformkeeper.model.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetsApiDelegateImpl implements PetsApiDelegate {

    @Override
    public ResponseEntity<List<Pet>> petsGet() {
        Cat cat = new Cat();
        cat.setName("Luke");
        cat.setPetType("cat");
        cat.setHuntingSkill(Cat.HuntingSkillEnum.CLUELESS);
        Dog dog = new Dog();
        dog.setPetType("dog");
        dog.setPackSize(3);
        dog.setName("Hans");
        return ResponseEntity.ok(List.of(cat, dog));
    }
}
