package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void addTest(){
        String name = "Otis";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        Integer expected = DogHouse.getNumberOfDogs() + 1;
        DogHouse.add(animal);
        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }

    @Test
    public void removeDogByIDTest(){
        Dog dog = new Dog(null, null, 345);
        Dog expectedDog = null;
        DogHouse.remove(345);
        Assert.assertEquals(expectedDog, DogHouse.getDogById(345));

    }

    @Test
    public void removeDogByNameTest(){
        Dog dog = new Dog("Otis", null, 345);
        DogHouse.add(dog);

        DogHouse.remove(dog);
        Assert.assertNull(DogHouse.getDogById(345));

    }

    @Test
    public void getDogByIdTest(){
        Dog actualDog = new Dog(null,null, 345);
        Dog fakeDog = new Dog(null,null,567);
        DogHouse.add(actualDog);
        Assert.assertEquals(actualDog, DogHouse.getDogById(345));

    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Otis";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);

        // When
        DogHouse.add(animal);

        // Then
        Assert.assertEquals((Integer)1,DogHouse.getNumberOfDogs());

    }
}
