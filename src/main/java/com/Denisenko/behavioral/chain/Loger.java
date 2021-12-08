package com.Denisenko.behavioral.chain;

public class Loger {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ERROR);
        Notifier emailNotifier = new EmailReportNotifier(Priority.WARNING);
        Notifier smsNotifier = new SMSNotifier(Priority.ALERT);

        reportNotifier.setNext(emailNotifier);
        emailNotifier.setNext(smsNotifier);

        reportNotifier.notifyUser("OK",Priority.ERROR);
        reportNotifier.notifyUser("somthing wrong",Priority.WARNING);
        reportNotifier.notifyUser("Programm close",Priority.ALERT);
    }
}
