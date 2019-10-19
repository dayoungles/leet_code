package leet;

public class DefangIPAddr {
    public String defangIPaddr(String address) {
        String[] parsed = address.split("\\.");
        String result = "";
        String bridge = "[.]";
        int count= 0;
        for (String number : parsed) {
            result = result + number;
            if (count == 4){
                break;
            }
            result = result + bridge;
        }
        return result;
    }
}
