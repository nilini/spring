import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;

public class ResourceTest {
    public static void main(String[] args) throws IOException, DocumentException {
        // books.xml位于应用的当前路径下
        UrlResource url = new UrlResource("file:books.xml");
        System.out.println(url.getFilename());
        System.out.println(url.getDescription());

        SAXReader reader = new SAXReader();
        Document doc = reader.read(url.getFile());

        Element element = doc.getRootElement();
        List l = element.elements();

        for(Iterator it = l.iterator(); it.hasNext(); ){
            Element ee = (Element) it.next();
            System.out.println(ee.getText());
        }
    }
}
