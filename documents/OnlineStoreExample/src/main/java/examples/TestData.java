package examples;

import examples.domain.Address;
import examples.domain.Category;
import examples.domain.Customer;
import examples.domain.Item;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TestData {

    private Map<String, Item> items = createItems();
    private Map<String, Customer> customers = createCustomers();

    public Item getItem(String key) {
        return items.get(key);
    }

    public Customer getCustomer(String key) {
        return customers.get(key);
    }


    private static Map<String, Item> createItems() {
        Category books = new Category("Books", false);
        Category liquor = new Category("Liquor", true);

        Map<String, Item> items = new HashMap<String, Item>();

        Item programmingBook = new Item();
        programmingBook.setItemId("BK1");
        programmingBook.setName("Programming Book");
        programmingBook.setDescription("This is a book about programming.");
        programmingBook.setPrice(25.00);
        programmingBook.setCategory(books);
        items.put("BK1", programmingBook);

        Item cookBook = new Item();
        cookBook.setItemId("BK2");
        cookBook.setName("Cooking Book");
        cookBook.setDescription("This is a book about cooking.");
        cookBook.setPrice(20.00);
        cookBook.setCategory(books);
        items.put("BK2", cookBook);

        Item whisky = new Item();
        whisky.setItemId("WH1");
        whisky.setName("ABC Whisky");
        whisky.setDescription("43 proof bourbon.");
        whisky.setPrice(35.00);
        whisky.setCategory(liquor);
        items.put("WH1", whisky);

        return items;
    }

    private static Map<String, Customer> createCustomers() {
        Map<String, Customer> customers = new HashMap<String, Customer>();

        Address address1 = new Address();
        address1.setAddressLine1("123 Someorother Street");
        address1.setCity("Big City");
        address1.setPostalCode("0012");

        Address address2 = new Address();
        address2.setAddressLine1("7 Java Avenue");
        address2.setCity("Tiny Town");
        address2.setPostalCode("7764");

        Customer john = new Customer();
        john.setCustomerId("J1");
        john.setName("John Doe");
        john.setDateOfBirth(getDate("01/01/2010"));
        john.setAddress(address1);
        john.setEmailAddress("john@testemailproviderdomain.com");
        customers.put("J1", john);

        Customer jane = new Customer();
        jane.setCustomerId("J2");
        jane.setName("Jane Doe");
        jane.setDateOfBirth(getDate("07/11/1980"));
        jane.setAddress(address2);
        jane.setEmailAddress("jane@testemailproviderdomain.com");
        customers.put("J2", jane);

        return customers;
    }

    private static Date getDate(String dateString) {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        try {
            return format.parse(dateString);
        } catch (ParseException ex) {
            throw new IllegalStateException("Failed to parse date.", ex);
        }
    }
}
