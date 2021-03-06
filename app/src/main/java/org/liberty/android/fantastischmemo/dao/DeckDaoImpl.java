package org.liberty.android.fantastischmemo.dao;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.DatabaseTableConfig;

import org.liberty.android.fantastischmemo.entity.Deck;

import java.sql.SQLException;

public class DeckDaoImpl extends BaseDaoImpl<Deck, Integer> implements DeckDao {
    public DeckDaoImpl(ConnectionSource connectionSource, DatabaseTableConfig<Deck> tableConfig)
        throws SQLException {
        super(connectionSource, Deck.class);
    }
    public DeckDaoImpl(ConnectionSource connectionSource, Class<Deck> clazz)
        throws SQLException {
        super(connectionSource, clazz);
    }

}

