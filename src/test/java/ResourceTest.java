import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class ResourceTest {
    public static void main(String[] args) throws IOException, DocumentException {
        // books.xml位于应用的当前路径下
        UrlResource r = new UrlResource("file:books.xml");
        //readXml(r);

        //加载类路径下的资源，对于web应用，可自动搜索位于WEB-INF/classes下的资源。
        ClassPathResource cr = new ClassPathResource("books.xml");
        // file:/D:/java/project/spring/target/classes/books.xml
        System.out.println(cr.getURL());
        readXml(cr);


    }
    public static void readXml(Resource r) throws IOException, DocumentException {
        System.out.println(r.getFilename());
        System.out.println(r.getDescription());

        SAXReader reader = new SAXReader();
        Document doc = reader.read(r.getFile());

        Element element = doc.getRootElement();
        List l = element.elements();

        for(Iterator it = l.iterator(); it.hasNext(); ){
            Element ee = (Element) it.next();
            System.out.println(ee.getText());
        }
    }
}
