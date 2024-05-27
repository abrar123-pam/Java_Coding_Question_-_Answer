package Contact;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

class Details {
    private static final Map<String, Call> callMap = new HashMap<>();

    public void saveNumber(Call call) {
        callMap.put(call.getContactName(), call);
    }

    public void updateContact(String oldName, Call newCall) {
        callMap.remove(oldName);
        callMap.put(newCall.getContactName(), newCall);
    }

    public void deleteContact(String name) {
        if (!callMap.containsKey(name)) {
            System.out.println("Contact doesn't exist");
        } else {
            callMap.remove(name);
            System.out.println("Contact deleted successfully");
        }
    }

    public void searchNumber(String name) {
        if (!callMap.containsKey(name)) {
            System.out.println("Contact doesn't exist");
        } else {
            Call callName = callMap.get(name);
            System.out.println("Your Number is: " + callName.getContactNumber());
        }
    }

    public Call getContact(String name) {
        return callMap.get(name);
    }

    public void makeCall(String number) {
        boolean found = false;
        for (Call c : callMap.values()) {
            if (c.getContactNumber().equals(number)) {
                System.out.println("Speaking to the contact number");
                c.incrementCount();
                recordCall(c);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Contact number doesn't exist");
        }
    }

    private void recordCall(Call call) {
        try (FileWriter fw = new FileWriter("C:\\Users\\Abrar Musharraf P\\IdeaProjects\\Practice\\src\\Contact\\call_history.txt", true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println("Contact Name: " + call.getContactName() + ", Number: " + call.getContactNumber() + ", Call Count: " + call.getCount());
        } catch (IOException e) {
            System.out.println("An error occurred while recording the call.");
        }
    }
}