/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report;

import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Peter_Malak
 */
@ManagedBean("bean")
@RequestScoped
public class MyBean {

    public String dashboard() {
        return "Dashboard";
    }

    public String search() {
        return "search";
    }

}
