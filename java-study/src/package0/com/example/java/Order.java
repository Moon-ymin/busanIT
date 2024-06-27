package package0.com.example.java;

import package0.com.example.java.member.Member;

public class Order {
    Member member;
    Item item;

    public Order(Member member, Item item) {
        this.member = member;
        this.item = item;
    }
}
