/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spr.dao;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import spr.hib.beans.Product;
import java.sql.SQLException;

public class Logicalcode {
    private HibernateTemplate hibernateTemplate;

    public Logicalcode() {
    }

    public Logicalcode(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    
    public HibernateTemplate getHibernateTempate(){
        return hibernateTemplate;
    }
    
    public void sethibernateTemplate(HibernateTemplate hibernateTemplate){
        this.hibernateTemplate = hibernateTemplate;
    }
    
    public void insertRecord(Product pro){
//        hibernate Template.save(pro);
        
        hibernateTemplate.execute(
             new HibernateCallback<Object>()
        {
         @Override
         public Object doInHibernate(Session session)
         {
             session.save(pro);
             System.out.println("Record inserted");
             return null;
         }
         
        });  
    }
    
    public void deleteRecord(Product pro)
    {
//       hibernate Template.delete(pro);
        hibernateTemplate.execute(new HibernateCallback<Object>()
        {
            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException
            {
                Product obj = (Product)session.get(Product.class, pro.getProdId());
                if(obj==null)
                {
                    System.out.println("No record found");
                }
                else{
                    session.delete(obj);
                }
               return null;
            }
        }
        );
       
    }
            
    
}
