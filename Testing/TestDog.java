import org.junit.Assert;
import org.junit.Test;

public class TestDog {
    @Test
    public void testAnimalDog() {
        Animal myDog  = new  Dog();

        Assert.assertEquals(myDog.makeSound(), "Bark");
        Assert.assertEquals(myDog.move(), "I'm running");

        Dog lukie = new Dog();
        Assert.assertEquals(lukie.misbehave("Car"), "I Chewed Up Yo' Car");

    }
}
