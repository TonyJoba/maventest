package cn.it.dao;

import cn.it.model.ORG;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    ORG selectOrg();
}