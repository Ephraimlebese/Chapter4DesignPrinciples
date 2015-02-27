package za.ac.cput.designPrinciple;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.designPrinciple.ocp.mainClass;
import za.ac.cput.designPrinciple.ocp.pass.OcpPass;

/**
 * Created by student on 2015/02/27.
 */
public  class OcpTestpass extends mainClass{

    private OcpPass myOCP;

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testName() throws Exception {
        Assert.assertEquals("stunna", getName());

    }

    @Test
    public void testPassMethod() throws Exception {
        myOCP = new OcpPass();
        Assert.assertEquals("passed", myOCP.passMethod());

    }

    @After
    public void tearDown() throws Exception {


    }


    @Override
    public String passMethod() {
        return null;
    }
}
