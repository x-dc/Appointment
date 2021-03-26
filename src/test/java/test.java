import cdu.jaav.entity.utils.ResponseData;
import cdu.jaav.service.impl.StudentServiceImpl;
import org.junit.Test;

import java.util.List;

public class test {
    @Test
    public void test1(){
        StudentServiceImpl studentService = new StudentServiceImpl();
        ResponseData<List> listResponseData = studentService.queryAllByPage(1, 10);
        System.out.println(listResponseData.toString());
    }
}
