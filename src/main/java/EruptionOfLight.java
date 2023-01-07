public class EruptionOfLight {
    public String findEmailDomain(String address) {
        String[] s = address.split("@");
        return s[s.length - 1];
    }
}
