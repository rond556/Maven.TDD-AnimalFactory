package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

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
    public void setNameTest(){
        Dog dog = new Dog(null, null, null);
        String expected = "Max";
        String actual = dog.setName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest(){
        Dog dog = new Dog(null, null, null);
        String expected = "bark!";
        String actual = dog.speak();
        Assert.assertEquals((expected, actual));
    }

    @Test
    public void setBirthDateTest(){
        Dog dog = new Dog(null, null, null);
        String expected = "Oct. 21";
        String actual = dog.setBirthDate();
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
        String expected = "12231021";
        String actual = dog.getID();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void animalInheritanceTest(){
        Dog dog = new Dog(null, null, null);
        boolean expected = true;
        boolean actual = dog.instanceOf(animal);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mammalInheritanceTest(){
        Dog dog = new Dog(null, null, null);
        boolean expected = true;
        boolean actual = dog.instanceOf(mammal);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
