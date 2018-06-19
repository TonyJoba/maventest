package cn.it.service;

import cn.it.dao.UserDao;
import cn.it.model.ORG;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

    @Autowired
    private UserDao userdao;

    public ORG getOrg() {
        ORG org = this.userdao.selectOrg();
        return org;
    }
}