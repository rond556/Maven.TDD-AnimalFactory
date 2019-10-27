package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat Cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat Cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addTest(){
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        Integer expected = CatHouse.getNumberOfCats() + 1;
        CatHouse.add(animal);
        Assert.assertEquals(expected, CatHouse.getNumberOfCats());
    }

    @Test
    public void removeCatByIDTest(){
        Cat Cat = new Cat(null, null, 345);
        Cat expectedCat = null;
        CatHouse.remove(345);
        Assert.assertEquals(expectedCat, CatHouse.getCatById(345));

    }

    @Test
    public void removeCatByNameTest(){
        Cat Cat = new Cat("Milo", null, 345);
        CatHouse.add(Cat);

        CatHouse.remove(Cat);
        Assert.assertNull(CatHouse.getCatById(345));

    }

    @Test
    public void getCatByIdTest(){
        Cat actualCat = new Cat(null,null, 345);
        Cat fakeCat = new Cat(null,null,567);
        CatHouse.add(actualCat);
        Assert.assertEquals(actualCat, CatHouse.getCatById(345));

    }

    @Test
    public void testGetNumberOfCats() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);

        // When
        CatHouse.add(animal);

        // Then
        Assert.assertEquals((Integer)1,CatHouse.getNumberOfCats());

    }
}
