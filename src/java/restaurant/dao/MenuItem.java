
package restaurant.dao;

/**
 *
 * @author Hodgey
 */
public class MenuItem {
    private int itemId;
    private String itemName;
    private double itemPrice;
    
    public MenuItem(){
        
    }
    public MenuItem(String itemName, double itemPrice){
        setItemName(itemName);
        setItemPrice(itemPrice);
    }
    public MenuItem(int itemId, String itemName, double itemPrice){
        setItemId(itemId);
        setItemName(itemName);
        setItemPrice(itemPrice);
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    
}
