public class commandInjection {
    public void injection() {
        String btype = request.getParameter("backuptype");
        String cmd = new String("cmd.exe /K \"c:\\util\\rmanDB.bat "+btype+"&&c:\\utl\\cleanup.bat\"");

        System.Runtime.getRuntime().exec(cmd);
    }


    public void injectionTwo() {
        String home = System.getProperty("APPHOME");
        String cmd = home + INITCMD;
        java.lang.Runtime.getRuntime().exec(cmd);
    }
}