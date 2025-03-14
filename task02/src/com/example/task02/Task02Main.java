package com.example.task02;

public class Task02Main {
    private static final Item ITEM1 = new Item("Товар 1", 10);
    private static final Item ITEM2 = new Item("Товар 2", 20);
    private static final Item ITEM3 = new Item("Товар 3", 30);

    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.add(ITEM1, 10);
        bill.add(ITEM2, 5);
        bill.add(ITEM3, 2);
        System.out.println("Базовый счет:\n\n" + bill);

        DiscountBill discountBill = new DiscountBill(10);
        discountBill.add(ITEM1, 10);
        discountBill.add(ITEM2, 5);
        discountBill.add(ITEM3, 2);
        System.out.println("\nСчет со скидкой:\n" + discountBill);
        System.out.println("\nРазмер скидки: " + discountBill.getDiscount() + "%");
        System.out.println("Абсолютное значение скидки: " + discountBill.getDiscountAmount());
        System.out.println("Итоговая стоимость: " + discountBill.getPrice());
    }
}