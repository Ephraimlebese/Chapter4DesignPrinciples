package za.ac.cput.designPrinciple.srp.violation;

/**
 * Created by student on 2015/02/27.
 */
public class srpFail implements srpInterface {

    //this class is completing a lot of tasks
    @Override
    public String calculateEmpSal()
    {
        return "fail";
    }
    @Override
    public String storeEmpDetails()
    {
        return "name";
    }


}
