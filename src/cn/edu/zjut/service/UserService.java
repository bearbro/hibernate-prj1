package cn.edu.zjut.service;

import cn.edu.zjut.dao.CustomerDAO;
import cn.edu.zjut.po.Customer;

import java.util.List;

/**
 * Created by Bro、小熊 on 2017/10/2.
 */
public class UserService {
    public boolean login(Customer loginUser) {
        String account=loginUser.getAccount();
        String password=loginUser.getPassword();
        String hql="from Customer as user where account='"+account+"' and password='"+password+"'";
        CustomerDAO dao=new CustomerDAO();
        List list=dao.findByHql(hql);
        if (list.isEmpty())
            return false;
        else
            return true;
    }

    public boolean register(Customer regUser) {
        if ((!regUser.getAccount().equals(""))
                && regUser.getAccount().equals(regUser.getPassword())) {
            return true;
        }
        return false;
    }
}
