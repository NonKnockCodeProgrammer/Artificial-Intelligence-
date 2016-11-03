package test;

class Address {
private String national;
private String provincial;
private String city;
private String street;
private String zipcode;
public Address() {
}
public Address(String national, String provincial, String city,
String street, String zipcode) {
super();
this.national = national;
this.provincial = provincial;
this.city = city;
this.street = street;
this.zipcode = zipcode;
}
public String toString() {
return "国家：" + this.national + "，省份：" + this.provincial + "，城市："
+ this.city + "，街道：" + this.street + "，邮政编码：" + this.zipcode;
}
// setter、getter略
}
public class TestDemo1 {
public static void main(String args[]) {
Address ad = new Address("中国", "北京", "北京市", "MLDN", "100088");
System.out.println(ad);
}
}