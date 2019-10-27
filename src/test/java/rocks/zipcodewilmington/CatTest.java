package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void setNameTest(){
        Cat cat = new Cat(null,null,null);
        String expected = "Milo";
        String actual = cat.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest(){
        Cat cat = new Cat(null,null,null);
        String expected = "meow!";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDateTest(){
        Cat cat = new Cat(null,null,null);
        Date expected = new Date();
        Date actual = cat.setBirthDate();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void eatTest(){
        Cat cat = new Cat(null,null,null);
        String expected = "Fish";
        String actual = cat.eat();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getIDTest(){
        Cat cat = new Cat(null,null,null);
        Integer expected = 34345;
        Integer actual = cat.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void animalInheritanceTest(){
        Cat cat = new Cat(null,null,null);
        boolean expected = true;
        boolean actual = cat instanceof Animal;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mammalInheritanceTest(){
        Cat cat = new Cat(null,null,null);
        boolean expected = true;
        boolean actual = cat instanceof Mammal;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
