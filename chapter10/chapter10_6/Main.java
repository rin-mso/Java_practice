package chapter10_6;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


// ネストしたデータの読み込みを実現するコード
public class Main {
    public static void main(String[] agrs) throws Exception {
        InputStream is = new FileInputStream("c:¥¥rpgsave.xml");
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
        Element hero = doc.getDocumentElement();
        Element weapon = findChildByTag(hero, "weapon");
        Element power = findChildByTag(weapon, "power");
        String value = power.getTextContent();
    }
    // 指定された名前を持つタグの最初の子タグを返す
    static Element findChildByTag (Element self, String name) throws Exception{
        // 全ての子を取得
        NodeList children = self.getChildNodes();
        for(int i = 0; i < children.getLength(); i++) {
            if(children.item(i) instanceof Element) {
                Element e = (Element) children.item(i);
                // タグ名を照合
                if(e.getTagName().equals(name)) {
                    return e;
                }
            }
        }
        return null;
    }
}
