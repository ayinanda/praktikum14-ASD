import java.util.ArrayList;
import java.util.Collections;

public class DemoArrayList09 {
    public static void main(String[] args) {
        ArrayList<Customer09> customers = new ArrayList<>();

        Customer09 customer1 = new Customer09(1, "Zakia");
        Customer09 customer2 = new Customer09(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer09(4, "Cica"));
        customers.add(2, new Customer09(100, "Rosa"));

        System.out.println(customers.indexOf(customer2)); // mengetahui posisi dari suatu objek

        Customer09 customer = customers.get(1); // mengembalikan object pada index tertentu
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        ArrayList<Customer09> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer09(201, "Della"));
        newCustomers.add(new Customer09(202, "Victor"));
        newCustomers.add(new Customer09(203, "Sarah"));

        customers.addAll(newCustomers);

        for (Customer09 cust : customers) {
            System.out.println(cust.toString());
        }
        
        System.out.println(customers);

        System.out.println();

        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        Collections.sort(daftarSiswa);

        System.out.println(daftarSiswa);
        System.out.println();

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));
        System.out.println(customers); 
    }
}