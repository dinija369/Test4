public class crossSite {
    public String preventXSS(String input, String mask) {
        return input.replaceAll("script", mask);
    }
}