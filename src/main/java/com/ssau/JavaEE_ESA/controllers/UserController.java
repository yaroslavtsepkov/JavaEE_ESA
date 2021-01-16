package com.ssau.JavaEE_ESA.controllers;

import com.ssau.JavaEE_ESA.beans.UserBean;
import com.ssau.JavaEE_ESA.entities.User;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;


@Named(value = "userController")
@RequestScoped
public class UserController {

    @Inject
    private UserBean userBean;
    private User user = new User();
    private List<User> userList = new ArrayList<>();

    public List<User> getUserList(){
        userList = userBean.getAllUsers();
        return userList;
    }

    public UserBean getUserBean() {
        return userBean;
    }

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
