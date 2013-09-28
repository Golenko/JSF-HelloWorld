package com.com.helloworld;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import java.io.Serializable;

/**
 * @author I. Golenko
 *         Date: 28.09.13
 */
@ManagedBean(name = "navigationController", eager = true)
public class NavigationController implements Serializable {
    public String moveToPage1() {
        return "pageOne";
    }

    //this managed property will read value from request parameter pageId
    @ManagedProperty(value = "#{param.pageId}")
    private String pageId;

    //conditional navigation based on pageId
    //if pageId is 1 show pageOne.xhtml,
    //if pageId is 2 show page2.xhtml
    //else show home.xhtml
    public String showPage() {
        if (pageId == null) {
            return "home";
        }
        if (pageId.equals("1")) {
            return "pageOne";
        } else if (pageId.equals("2")) {
            return "page2";
        } else {
            return "home";
        }
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }
}