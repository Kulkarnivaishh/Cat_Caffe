package com.catcafe;

public class MembershipTester {
	public static void main(String[] args) {
        Membership membership = new Membership("John", 10);
        System.out.println("Membership Name: " + membership.getName());
        System.out.println("Remaining Visits: " + membership.getRemainingVisits());
        System.out.println("Is Membership Valid: " + membership.isValid());
        System.out.println("Top-Up Success: " + membership.topUp(5));
        System.out.println("Remaining Visits After Top-Up: " + membership.getRemainingVisits());
        System.out.println("Charge Success: " + membership.charge());
        System.out.println("Remaining Visits After Charge: " + membership.getRemainingVisits());
        System.out.println("Is Membership Valid After Charge: " + membership.isValid());
    }

}
