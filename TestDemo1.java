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
return "���ң�" + this.national + "��ʡ�ݣ�" + this.provincial + "�����У�"
+ this.city + "���ֵ���" + this.street + "���������룺" + this.zipcode;
}
// setter��getter��
}
public class TestDemo1 {
public static void main(String args[]) {
Address ad = new Address("�й�", "����", "������", "MLDN", "100088");
System.out.println(ad);
}
}