package com.flightpub.checkoutPayment.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * ConfirmationAction
 *
 * Performs all transaction processing and delivers success or error view response
 */
public class ConfirmationAction extends ActionSupport implements SessionAware {

    private String userType;
    private Map<String, Object> userSession ;

    public String execute() {
        userSession.put("USER_TYPE", userType);

        return SUCCESS;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setSession(Map<String, Object> session) {
        userSession = session ;
    }
}
