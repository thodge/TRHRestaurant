package restaurant.service;

import java.sql.SQLException;
import java.util.List;
import restaurant.DataAccessException;
import restaurant.dao.IMenuItemDAO;
import restaurant.dao.MenuItem;
import restaurant.dao.MenuItemsDAO;
import restaurant.db.accessor.DBaccessor;

/**
 *
 * @author Hodgey
 */
public final class RestaurantService {
    private List<MenuItem> menuList;
    private restaurant.dao.IMenuItemDAO menuItemDAO;
    private final DBaccessor db = new DBaccessor();
    private final String dao = "restaurant.dao.IMenuItemDAO";
    public RestaurantService() throws Exception{
        initMenu(dao);
    }
    
    public void initMenu(String dao) throws Exception{
        menuItemDAO = new MenuItemsDAO(db);
        menuList = menuItemDAO.getAllMenuItems();
    }
    
    public void addToMenu(String itemName, double itemPrice) throws DataAccessException, SQLException{
        MenuItem mi = new MenuItem(itemName, itemPrice);
        menuItemDAO.addItemToMenu(mi);         
    }
    public void removeFromMenu(int id) throws DataAccessException, SQLException{
        menuItemDAO.deleteItemFromMenuById(id);
    }
    public List<MenuItem> getMenuList() {
        return menuList;
    }
    
    public void setMenuList(List<MenuItem> menuList) {
        this.menuList = menuList;
    }

    public IMenuItemDAO getMenuItemDAO() {
        return menuItemDAO;
    }

    public void setMenuItemDAO(IMenuItemDAO menuItemDAO) {
        this.menuItemDAO = menuItemDAO;
    }
    public static void main(String[] args) throws Exception {
        String dao = "restaurant.dao.IMenuItemDAO";
        RestaurantService rs = new RestaurantService();
        rs.addToMenu("Rice", 1.99);
        for (MenuItem items : rs.menuList) {
            System.out.println(items.getItemName() + " For $"+ items.getItemPrice());
        }
    }
    
}
