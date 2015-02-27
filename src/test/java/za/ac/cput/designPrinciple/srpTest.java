package za.ac.cput.designPrinciple;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.designPrinciple.srp.violation.srpFail;
import za.ac.cput.designPrinciple.srp.violation.srpInterface;

/**
 * Created by student on 2015/02/27.
 */
public class srpTest {
    private srpInterface srpIn;

    @Before
    public void setUp() throws Exception {
        srpIn =  new srpFail();

    }

    @Test
    public void testCalcEmpSal() throws Exception {
        Assert.assertEquals("fail", srpIn.calculateEmpSal());

    }

    @Test
    public void teststoreEmpDetails() throws Exception {
        Assert.assertEquals("name", srpIn.storeEmpDetails());

    }

    @After
    public void tearDown() throws Exception {


    }
}
