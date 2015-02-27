package za.ac.cput.designPrinciple;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.designPrinciple.srp.pass.SrpPassInterface;
import za.ac.cput.designPrinciple.srp.pass.srpPass;

/**
 * Created by student on 2015/02/27.
 */
public class srpTestPass {

    private SrpPassInterface srpPass;
    @Before
    public void setUp() throws Exception {
        srpPass = new srpPass();

    }

    @Test
    public void testempSal() throws Exception {
        Assert.assertEquals(100, srpPass.empSal());

    }

    @After
    public void tearDown() throws Exception {


    }
}
