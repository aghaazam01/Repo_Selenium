package Class_1;

import org.testng.Assert;
import org.testng.annotations.Test;


public class First_class {

    //Annotation means to run the test @ Test
        @Test
        public void method1 () {
            System.out.println("Hello world");
      // Assertion means verification (boolean)
            int a = 20;
            int b = 30;
            boolean res = b < a;
           // Assert.assertTrue(res);  // if b>a
           // Assert.assertTrue(res);
           // Assert.assertTrue(res,"res is not not as expected");
            Assert.assertEquals(b,a,"a & b are not equal to each other");
        }



         @Test
        public void method2(){
            System.out.println("I am happy to solve the problem");
        }


}
