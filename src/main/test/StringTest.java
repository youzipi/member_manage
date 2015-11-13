import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * project_name:member_manage
 * package_name:PACKAGE_NAME
 * user: youzipi
 * date: 15-11-10 下午7:18
 */
public class StringTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void testStringBuilder() {
        StringBuilder sb = new StringBuilder();
        long ts = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append(String.valueOf(i));
            sb.toString();
        }

//        System.out.println(sb.toString());
        long te = System.currentTimeMillis();
        logger.info("StringBuilder cost {} ms", te - ts);
    }

    @Test
    public void testPlus() {
        String s = "";
        long ts = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            s = s + String.valueOf(i);
        }
        long te = System.currentTimeMillis();
        logger.info("+ cost {} ms", te - ts);
    }

    @Test
    public void testConcat() {
        String s = "";
        long ts = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            s = s.concat(String.valueOf(i));
        }
        long te = System.currentTimeMillis();
        logger.info("concat cost {} ms", te - ts);
    }

    @Test
    public void testJoin() {
        List<String> list = new ArrayList<String>();
        long ts = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(String.valueOf(i));
            StringUtils.join(list, "");
        }
        long te = System.currentTimeMillis();
        logger.info("StringUtils.join cost {} ms", te - ts);
    }

    @Test
    public void testStringBuffer() {
        StringBuffer sb = new StringBuffer();
        long ts = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append(String.valueOf(i));
            sb.toString();
        }
        long te = System.currentTimeMillis();
        logger.info("StringBuffer cost {} ms", te - ts);
    }


}