package entity;
//订单详情表
public class Detail {
   private int id; //编号
   private int orderId; //订单ID
   private int productId;//商品ID
   private int quantity;//数量
   private double cost;//金额
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
   
}
