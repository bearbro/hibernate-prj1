package cn.edu.zjut.action;

import cn.edu.zjut.bean.UserBean;
import cn.edu.zjut.po.Customer;
import cn.edu.zjut.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Bro、小熊 on 2017/10/2.
 */
public class UserAction extends ActionSupport
        implements ServletContextAware, ServletRequestAware, ServletResponseAware {
    private Customer loginUser;
    private HttpServletRequest request;
    private HttpServletResponse response;
    private HttpSession session;
    private ServletContext application;

    @Override
    public void setServletResponse(HttpServletResponse response) {
        this.response = response;
    }

    @Override
    public void setServletContext(ServletContext application) {
        this.application = application;
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
//        session=request.getSession();
    }

    public Customer getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(Customer loginUser) {
        this.loginUser = loginUser;
    }

    public String register() {
        UserService userServ = new UserService();
        userServ.register(loginUser);
        return "regsuccess";

    }

    public String login() {
        UserService userServ = new UserService();

        if (userServ.login(loginUser)) {
            return "logsuccess";
        } else {
            return "logfail";
        }
    }
}
