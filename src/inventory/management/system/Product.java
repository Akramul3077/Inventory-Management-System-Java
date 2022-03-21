/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory.management.system;

public class Product {
    private int id;
    private String name;
    private float price;
    private String addDate;
    private byte[] picture;
    
    public Product(int pid,String pname,float pprice,String paddDate,byte[] pimg){
        this.id=pid;
        this.name=pname;
        this.price=pprice;
        this.addDate =paddDate;
        this.picture=pimg;
    }
    
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public float getPrice(){
        return price;
    }
    public String getAddDate(){
        return addDate;
    }
    public byte[] getPicture(){
        return picture;
    }

    byte[] getImage() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
