import org.junit.Assert;
import org.junit.Test;

public class TestBird {
    @Test
    public void testAnimalBird() {
        Animal myBird = new Bird();


        Assert.assertEquals(myBird.move(), "I'm flying");
        Assert.assertEquals(myBird.makeSound(), "Chirp");


    }

}
