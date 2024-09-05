public class Orders{
    public void get_no(){
       System.out.println(8097675);
    }
    class Customers{
        public void get_name(){
            System.out.println("cwp");
        }
    }

    public static void main(String[] arg){
        Orders orders=new Orders();
        Orders.Customers obj=orders.new Customers();
        //outerclass.innerclass obj=outerclassobject.new innerclass();
        orders.get_no();
        obj.get_name();
    }
}