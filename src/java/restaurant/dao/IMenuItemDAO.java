package restaurant.dao;

import java.sql.SQLException;
import java.util.List;
import restaurant.DataAccessException;

/**
 *
 * @author Hodgey
 */
public interface IMenuItemDAO {
    public abstract List<MenuItem> getAllMenuItems() throws DataAccessException;
    public abstract void addItemToMenu(MenuItem mi) throws DataAccessException, SQLException;
    public abstract void deleteItemFromMenuById(int id) throws DataAccessException, SQLException;
            }
