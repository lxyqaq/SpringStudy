package org.lxyqaq.spring5;

/**
 * @ClassName Orders
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/1 21:36
 * @Version 1.0
 */
public class Orders {

    private String oname;
    private String address;

    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void ordersTest() {
        System.out.println("oname = " + oname + " , address = " + address);
    }

}
