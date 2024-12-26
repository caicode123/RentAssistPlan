package com.caicode.lease.web.app.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.caicode.lease.model.entity.BrowsingHistory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.caicode.lease.web.app.vo.history.HistoryItemVo;

/**
* @author caicode
* @description 针对表【browsing_history(浏览历史)】的数据库操作Service
*/
public interface BrowsingHistoryService extends IService<BrowsingHistory> {
    IPage<HistoryItemVo> pageHistoryItemByUserId(Page<HistoryItemVo> page, Long userId);

    void saveHistory(Long userId, Long id);
}
