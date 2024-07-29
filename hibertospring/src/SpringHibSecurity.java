
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spr.dao.Logicalcode;
import spr.hib.beans.Product;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class SpringHibSecurity {
    public static void main(String args[]){
        ApplicationContext context=
        new ClassPathXmlApplicationContext("/SpringXMLConfig.xml");
        Logicalcode logicalcode=
        (Logicalcode)context.getBean("technosoft");
//        Product pro = new Product(4565,"pepsi","can",41232,"dollar","friday","caution");
//        logicalcode.insertRecord(pro);
//        System.out.println("why");
        
        Product pro2 = new Product();
        pro2.setProdId(4565);
        logicalcode.deleteRecord(pro2);
//  
    }
}
