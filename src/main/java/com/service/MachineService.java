package com.service;

import com.common.Page;
import com.common.PageUtil;
import com.dao.MachineDao;
import com.dao.mapper.MachineMapper;
import com.entity.Machine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * project_name:member_manage
 * package_name:com.service
 * user: youzipi
 * date: 15-11-13 下午2:44
 */
@Service
public class MachineService {
    @Autowired
    MachineMapper machineMapper;
    @Autowired
    MachineDao machineDao;

    public List<Machine> getByPage(Page page) {
        return machineDao.selectByPage(PageUtil.page2map(page));
    }

    public int count() {
        return machineDao.count();
    }

    public Machine getById(Integer id) {
        return null;
    }
}
