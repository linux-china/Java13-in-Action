package org.mvnsearch;

import org.junit.jupiter.api.Test;

/**
 * Text block test
 *
 * @author linux_china
 */
public class TextBlockTest {

    @Test
    public void testBlock() {
        String nick = "linux_china";
        //language=html
        String htmlTemplate = """
               <span style="color: green">Hello %s</span>""";
        System.out.println(String.format(htmlTemplate, nick));
        //language=json
        String cleanJsonText = """
               {"id": 1, "nick": "leijuan"}""";
        System.out.println(cleanJsonText);
    }
}
