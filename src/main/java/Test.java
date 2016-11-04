import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by youzipi on 16/11/3.
 */
public class Test {
    public static void main(String[] args) {
        String[] a = new String[]{"1", "2", "3"};

        List<String> stringList = Arrays.asList();

        List<String> stringList2 = new ArrayList<>(Arrays.asList(a));

        String b = "22";
        String c = "22";
        //apache
        StringUtils.isNotBlank(b);
        StringUtils.isNotEmpty(b);
        StringUtils.isNumeric(b);


        // Spring
        BeanUtils.copyProperties(b,c);


        String slist = "101";
        char[] chars = slist.toCharArray();
        System.out.println();
    }
}
