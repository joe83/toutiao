package com.chinaso.toutiao.greendao.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.chinaso.toutiao.mvp.data.collection.CollectionEntity;
import com.chinaso.toutiao.mvp.data.NewsChannelEntity;
import com.chinaso.toutiao.mvp.data.readhistory.ReadHistoryEntity;

import com.chinaso.toutiao.greendao.gen.CollectionEntityDao;
import com.chinaso.toutiao.greendao.gen.NewsChannelEntityDao;
import com.chinaso.toutiao.greendao.gen.ReadHistoryEntityDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig collectionEntityDaoConfig;
    private final DaoConfig newsChannelEntityDaoConfig;
    private final DaoConfig readHistoryEntityDaoConfig;

    private final CollectionEntityDao collectionEntityDao;
    private final NewsChannelEntityDao newsChannelEntityDao;
    private final ReadHistoryEntityDao readHistoryEntityDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        collectionEntityDaoConfig = daoConfigMap.get(CollectionEntityDao.class).clone();
        collectionEntityDaoConfig.initIdentityScope(type);

        newsChannelEntityDaoConfig = daoConfigMap.get(NewsChannelEntityDao.class).clone();
        newsChannelEntityDaoConfig.initIdentityScope(type);

        readHistoryEntityDaoConfig = daoConfigMap.get(ReadHistoryEntityDao.class).clone();
        readHistoryEntityDaoConfig.initIdentityScope(type);

        collectionEntityDao = new CollectionEntityDao(collectionEntityDaoConfig, this);
        newsChannelEntityDao = new NewsChannelEntityDao(newsChannelEntityDaoConfig, this);
        readHistoryEntityDao = new ReadHistoryEntityDao(readHistoryEntityDaoConfig, this);

        registerDao(CollectionEntity.class, collectionEntityDao);
        registerDao(NewsChannelEntity.class, newsChannelEntityDao);
        registerDao(ReadHistoryEntity.class, readHistoryEntityDao);
    }
    
    public void clear() {
        collectionEntityDaoConfig.getIdentityScope().clear();
        newsChannelEntityDaoConfig.getIdentityScope().clear();
        readHistoryEntityDaoConfig.getIdentityScope().clear();
    }

    public CollectionEntityDao getCollectionEntityDao() {
        return collectionEntityDao;
    }

    public NewsChannelEntityDao getNewsChannelEntityDao() {
        return newsChannelEntityDao;
    }

    public ReadHistoryEntityDao getReadHistoryEntityDao() {
        return readHistoryEntityDao;
    }

}
