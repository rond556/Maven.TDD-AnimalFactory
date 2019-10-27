package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void constructorTest(){
        String givenName = "Otis";
        Date givenBirthDate = new Date();
        Integer givenId = 3434;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest(){
        Dog dog = new Dog(null, null, null);
        String expected = "Otis";
        String actual = dog.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest(){
        Dog dog = new Dog(null, null, null);
        String expected = "bark!";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDateTest(){
        Dog dog = new Dog(null, null, null);
        Date expected = new Date();
        Date actual = dog.setBirthDate(expected);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void eatTest(){
        Dog dog = new Dog(null, null, null);
        String expected = "Beef";
        String actual = dog.eat();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getIDTest(){
        Dog dog = new Dog(null, null, null);
        Integer expected = 12231021;
        Integer actual = dog.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void animalInheritanceTest(){
        Dog dog = new Dog(null, null, null);
        boolean expected = true;
        boolean actual = dog instanceof Animal;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mammalInheritanceTest(){
        Dog dog = new Dog(null, null, null);
        boolean expected = true;
        boolean actual = dog instanceof Mammal;
        Assert.assertEquals(expected, actual);
    }
}
