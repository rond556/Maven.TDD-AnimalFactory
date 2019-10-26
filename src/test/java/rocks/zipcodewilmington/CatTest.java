package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

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
        String expected = "Tony";
        String actual = cat.setName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest(){
        String expected = "meow!";
        String actual = cat.speak();
        Assert.assertEquals((expected, actual));
    }

    @Test
    public void setBirthDateTest(){
        String expected = "Oct. 21";
        String actual = cat.setBirthDay();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void eatTest(){
        String expected = "Fish";
        String actual = cat.eat();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getIDTest(){
        String expected = "34345";
        String actual = cat.getID();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void animalInheritanceTest(){
        boolean expected = true;
        boolean actual = cat.instanceOf();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mammalInheritanceTest(){
        boolean expected = true;
        boolean actual = cat.instanceOF();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
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
