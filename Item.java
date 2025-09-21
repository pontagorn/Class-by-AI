public class Item {
    private float price;

    public Item() {
        this.price = 0;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float p) {
        this.price = p;
    }

    public static void main(String[] args) {
        Item item = new Item();
        System.out.println("Initial price: " + item.getPrice());
        item.setPrice(67.1579f);
        System.out.println("Updated price: " + item.getPrice());
    }
}
